import java.io.*;
import java.nio.file.*;
import java.util.ArrayList;

public class FileManager {

    private static final String FILE_PATH = "data/motorcycles.csv";

    // SAVE MOTORCYCLE
    public static void saveMotorcycle(Motorcycle motorcycle) {

        try {
            // Create data folder if it doesn't exist
            Files.createDirectories(Paths.get("data"));

            String[] data = new String[17];

            // Common attributes
            data[0] = motorcycle.getId();
            data[1] = motorcycle.getBrand();
            data[2] = motorcycle.getModel();
            data[3] = String.valueOf(motorcycle.getYear());
            data[4] = motorcycle.getType();
            data[5] = motorcycle.getTransmissionType();
            data[6] = String.valueOf(motorcycle.getMileage());
            data[7] = String.valueOf(motorcycle.getDailyRate());
            data[8] = motorcycle.getStatus();

            // Empty subclass-specific attributes
            for (int i = 9; i < 17; i++) {
                data[i] = "";
            }

            // Scooter
            if (motorcycle instanceof Scooter) {
                Scooter s = (Scooter) motorcycle;

                data[9] = String.valueOf(s.getEngineDisplacement());
                data[10] = String.valueOf(s.getStorageCapacity());
                data[11] = String.valueOf(s.getFuelCapacity());
            }

            // Standard Bike
            else if (motorcycle instanceof StandardBike) {
                StandardBike s = (StandardBike) motorcycle;

                data[9] = String.valueOf(s.getEngineDisplacement());
                data[11] = String.valueOf(s.getFuelCapacity());
            }

            // Sports Bike
            else if (motorcycle instanceof SportsBike) {
                SportsBike s = (SportsBike) motorcycle;

                data[9] = String.valueOf(s.getEngineDisplacement());
                data[11] = String.valueOf(s.getFuelCapacity());
                data[12] = String.valueOf(s.getPowerOutput());
            }

            // Electric Bike
            else if (motorcycle instanceof ElectricBike) {
                ElectricBike e = (ElectricBike) motorcycle;

                data[13] = String.valueOf(e.getMotorPower());
                data[14] = String.valueOf(e.getBatteryCapacity());
                data[15] = String.valueOf(e.getChargingTime());
            }

            // Adventure Bike
            else if (motorcycle instanceof AdventureBike) {
                AdventureBike a = (AdventureBike) motorcycle;

                data[9] = String.valueOf(a.getEngineDisplacement());
                data[10] = String.valueOf(a.getStorageCapacity());
                data[11] = String.valueOf(a.getFuelCapacity());
                data[16] = String.valueOf(a.getGroundClearance());
            }

            // Write motorcycle to CSV
            try (FileWriter writer = new FileWriter(FILE_PATH, true)) {
                writer.write(String.join(",", data));
                writer.write(System.lineSeparator());
            }

            System.out.println("Motorcycle saved successfully!");

        } catch (IOException e) {
            System.out.println("Error saving motorcycle: " + e.getMessage());
        }
    }

    // LOAD MOTORCYCLES
    public static ArrayList<Motorcycle> loadMotorcycles() {

        ArrayList<Motorcycle> motorcycles = new ArrayList<>();

        Path path = Paths.get(FILE_PATH);

        if (!Files.exists(path)) {
            return motorcycles;
        }

        try (BufferedReader reader =
                new BufferedReader(new FileReader(FILE_PATH))) {

            String line;

            while ((line = reader.readLine()) != null) {

                if (line.trim().isEmpty()) {
                    continue;
                }

                String[] data = line.split(",", -1);

                Motorcycle motorcycle = null;

                String id = data[0];
                String brand = data[1];
                String model = data[2];
                int year = Integer.parseInt(data[3]);
                String type = data[4];
                String transmission = data[5];
                int mileage = Integer.parseInt(data[6]);
                double rate = Double.parseDouble(data[7]);
                String status = data[8];

                // Reconstruct the correct subclass
                switch (type) {

                    case "Scooter":
                        motorcycle = new Scooter(
                            id, brand, model, year,
                            transmission, mileage, rate,
                            Integer.parseInt(data[9]),
                            Double.parseDouble(data[10]),
                            Double.parseDouble(data[11])
                        );
                        break;

                    case "Standard Bike":
                        motorcycle = new StandardBike(
                            id, brand, model, year,
                            transmission, mileage, rate,
                            Integer.parseInt(data[9]),
                            Double.parseDouble(data[11])
                        );
                        break;

                    case "Sports Bike":
                        motorcycle = new SportsBike(
                            id, brand, model, year,
                            transmission, mileage, rate,
                            Integer.parseInt(data[9]),
                            Double.parseDouble(data[11]),
                            Double.parseDouble(data[12])
                        );
                        break;

                    case "Electric Bike":
                        motorcycle = new ElectricBike(
                            id, brand, model, year,
                            mileage, rate,
                            Double.parseDouble(data[13]),
                            Double.parseDouble(data[14]),
                            Double.parseDouble(data[15])
                        );
                        break;

                    case "Adventure Bike":
                        motorcycle = new AdventureBike(
                            id, brand, model, year,
                            transmission, mileage, rate,
                            Integer.parseInt(data[9]),
                            Double.parseDouble(data[10]),
                            Double.parseDouble(data[11]),
                            Double.parseDouble(data[16])
                        );
                        break;
                }

                if (motorcycle != null) {
                    motorcycle.setStatus(status);
                    motorcycles.add(motorcycle);
                }
            }

        } catch (IOException | NumberFormatException e) {
            System.out.println("Error loading motorcycles: " + e.getMessage());
        }

        return motorcycles;
    }
}
