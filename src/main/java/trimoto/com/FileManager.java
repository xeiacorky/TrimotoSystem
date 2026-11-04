import java.io.*;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

public class FileManager {

    private static final String DATA_DIR = "data";
    private static final String MOTORCYCLES_FILE = "data/motorcycles.csv";
    private static final String INSPECTIONS_FILE = "data/inspections.csv";
    private static final String MAINTENANCE_FILE = "data/maintenance.csv";
    private static final String RENTALS_FILE = "data/rentals.csv";
    private static final String DAMAGE_REPORTS_FILE = "data/damage_reports.csv";

    // Helper to sanitize commas and line breaks for CSV storage
    private static String escapeCsv(String input) {
        if (input == null) return "";
        return input.replace(",", ";").replace("\n", " ").replace("\r", "");
    }

    private static String unescapeCsv(String input) {
        if (input == null) return "";
        return input.replace(";", ",");
    }

    private static void ensureDataDirExists() {
        try {
            Files.createDirectories(Paths.get(DATA_DIR));
        } catch (IOException e) {
            System.err.println("Error creating data directory: " + e.getMessage());
        }
    }

    // ==========================================
    // 1. MOTORCYCLES FILE HANDLING
    // ==========================================

    public static void saveAllMotorcycles(List<Motorcycle> motorcycles) {
        ensureDataDirExists();
        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(MOTORCYCLES_FILE))) {
            for (Motorcycle motorcycle : motorcycles) {
                String[] data = new String[17];
                data[0] = motorcycle.getId();
                data[1] = motorcycle.getBrand();
                data[2] = motorcycle.getModel();
                data[3] = String.valueOf(motorcycle.getYear());
                data[4] = motorcycle.getType();
                data[5] = motorcycle.getTransmissionType();
                data[6] = String.valueOf(motorcycle.getMileage());
                data[7] = String.valueOf(motorcycle.getDailyRate());
                data[8] = motorcycle.getStatus();

                for (int i = 9; i < 17; i++) data[i] = "";

                if (motorcycle instanceof Scooter) {
                    Scooter s = (Scooter) motorcycle;
                    data[9] = String.valueOf(s.getEngineDisplacement());
                    data[10] = String.valueOf(s.getStorageCapacity());
                    data[11] = String.valueOf(s.getFuelCapacity());
                } else if (motorcycle instanceof StandardBike) {
                    StandardBike s = (StandardBike) motorcycle;
                    data[9] = String.valueOf(s.getEngineDisplacement());
                    data[11] = String.valueOf(s.getFuelCapacity());
                } else if (motorcycle instanceof SportsBike) {
                    SportsBike s = (SportsBike) motorcycle;
                    data[9] = String.valueOf(s.getEngineDisplacement());
                    data[11] = String.valueOf(s.getFuelCapacity());
                    data[12] = String.valueOf(s.getPowerOutput());
                } else if (motorcycle instanceof ElectricBike) {
                    ElectricBike e = (ElectricBike) motorcycle;
                    data[13] = String.valueOf(e.getMotorPower());
                    data[14] = String.valueOf(e.getBatteryCapacity());
                    data[15] = String.valueOf(e.getChargingTime());
                } else if (motorcycle instanceof AdventureBike) {
                    AdventureBike a = (AdventureBike) motorcycle;
                    data[9] = String.valueOf(a.getEngineDisplacement());
                    data[10] = String.valueOf(a.getStorageCapacity());
                    data[11] = String.valueOf(a.getFuelCapacity());
                    data[16] = String.valueOf(a.getGroundClearance());
                }

                writer.write(String.join(",", data));
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error saving motorcycles: " + e.getMessage());
        }
    }

    public static ArrayList<Motorcycle> loadMotorcycles() {
        ArrayList<Motorcycle> list = new ArrayList<>();
        Path path = Paths.get(MOTORCYCLES_FILE);
        if (!Files.exists(path)) return list;

        try (BufferedReader reader = Files.newBufferedReader(path)) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.trim().isEmpty()) continue;
                String[] data = line.split(",", -1);
                String id = data[0];
                String brand = data[1];
                String model = data[2];
                int year = Integer.parseInt(data[3]);
                String type = data[4];
                String transmission = data[5];
                int mileage = Integer.parseInt(data[6]);
                double rate = Double.parseDouble(data[7]);
                String status = data[8];

                Motorcycle motorcycle = null;
                switch (type) {
                    case "Scooter":
                        motorcycle = new Scooter(id, brand, model, year, transmission, mileage, rate,
                                Integer.parseInt(data[9]), Double.parseDouble(data[10]), Double.parseDouble(data[11]));
                        break;
                    case "Standard Bike":
                        motorcycle = new StandardBike(id, brand, model, year, transmission, mileage, rate,
                                Integer.parseInt(data[9]), Double.parseDouble(data[11]));
                        break;
                    case "Sports Bike":
                        motorcycle = new SportsBike(id, brand, model, year, transmission, mileage, rate,
                                Integer.parseInt(data[9]), Double.parseDouble(data[11]), Double.parseDouble(data[12]));
                        break;
                    case "Electric Bike":
                        motorcycle = new ElectricBike(id, brand, model, year, mileage, rate,
                                Double.parseDouble(data[13]), Double.parseDouble(data[14]), Double.parseDouble(data[15]));
                        break;
                    case "Adventure Bike":
                        motorcycle = new AdventureBike(id, brand, model, year, transmission, mileage, rate,
                                Integer.parseInt(data[9]), Double.parseDouble(data[10]), Double.parseDouble(data[11]), Double.parseDouble(data[16]));
                        break;
                }

                if (motorcycle != null) {
                    motorcycle.setStatus(status);
                    list.add(motorcycle);
                }
            }
        } catch (IOException | NumberFormatException e) {
            System.err.println("Error loading motorcycles: " + e.getMessage());
        }
        return list;
    }

    // ==========================================
    // 2. INSPECTIONS FILE HANDLING
    // ==========================================

    public static void saveAllInspections(List<InspectionRecord> inspections) {
        ensureDataDirExists();
        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(INSPECTIONS_FILE))) {
            for (InspectionRecord r : inspections) {
                String line = String.join(",",
                        escapeCsv(r.recordId), escapeCsv(r.motorcycleId), escapeCsv(r.date),
                        escapeCsv(r.phase), escapeCsv(r.odometer), escapeCsv(r.fuel),
                        escapeCsv(r.tires), escapeCsv(r.brakes), escapeCsv(r.headlight),
                        escapeCsv(r.horns), escapeCsv(r.mirrors), escapeCsv(r.body),
                        escapeCsv(r.engine), escapeCsv(r.condition), escapeCsv(r.readiness),
                        escapeCsv(r.notes)
                );
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error saving inspections: " + e.getMessage());
        }
    }

    public static ArrayList<InspectionRecord> loadInspections() {
        ArrayList<InspectionRecord> list = new ArrayList<>();
        Path path = Paths.get(INSPECTIONS_FILE);
        if (!Files.exists(path)) return list;

        try (BufferedReader reader = Files.newBufferedReader(path)) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.trim().isEmpty()) continue;
                String[] d = line.split(",", -1);
                if (d.length >= 16) {
                    list.add(new InspectionRecord(
                            unescapeCsv(d[0]), unescapeCsv(d[1]), unescapeCsv(d[2]), unescapeCsv(d[3]),
                            unescapeCsv(d[4]), unescapeCsv(d[5]), unescapeCsv(d[6]), unescapeCsv(d[7]),
                            unescapeCsv(d[8]), unescapeCsv(d[9]), unescapeCsv(d[10]), unescapeCsv(d[11]),
                            unescapeCsv(d[12]), unescapeCsv(d[13]), unescapeCsv(d[14]), unescapeCsv(d[15])
                    ));
                }
            }
        } catch (IOException e) {
            System.err.println("Error loading inspections: " + e.getMessage());
        }
        return list;
    }

    // ==========================================
    // 3. MAINTENANCE FILE HANDLING
    // ==========================================

    public static void saveAllMaintenanceRecords(List<MaintenanceRecord> records) {
        ensureDataDirExists();
        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(MAINTENANCE_FILE))) {
            for (MaintenanceRecord r : records) {
                String line = String.join(",",
                        escapeCsv(r.recordId), escapeCsv(r.motorcycleId), escapeCsv(r.date),
                        escapeCsv(r.type), escapeCsv(r.category), escapeCsv(r.workPerformed),
                        escapeCsv(r.partsReplaced), escapeCsv(r.odometer), String.valueOf(r.cost),
                        escapeCsv(r.nextServiceMileage), escapeCsv(r.status),
                        escapeCsv(r.availability), escapeCsv(r.remarks)
                );
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error saving maintenance records: " + e.getMessage());
        }
    }

    public static ArrayList<MaintenanceRecord> loadMaintenanceRecords() {
        ArrayList<MaintenanceRecord> list = new ArrayList<>();
        Path path = Paths.get(MAINTENANCE_FILE);
        if (!Files.exists(path)) return list;

        try (BufferedReader reader = Files.newBufferedReader(path)) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.trim().isEmpty()) continue;
                String[] d = line.split(",", -1);
                if (d.length >= 13) {
                    double cost = d[8].isEmpty() ? 0.0 : Double.parseDouble(d[8]);
                    list.add(new MaintenanceRecord(
                            unescapeCsv(d[0]), unescapeCsv(d[1]), unescapeCsv(d[2]), unescapeCsv(d[3]),
                            unescapeCsv(d[4]), unescapeCsv(d[5]), unescapeCsv(d[6]), unescapeCsv(d[7]),
                            cost, unescapeCsv(d[9]), unescapeCsv(d[10]), unescapeCsv(d[11]), unescapeCsv(d[12])
                    ));
                }
            }
        } catch (IOException | NumberFormatException e) {
            System.err.println("Error loading maintenance records: " + e.getMessage());
        }
        return list;
    }

    // ==========================================
    // 4. RENTAL TRANSACTIONS FILE HANDLING
    // ==========================================

    public static void saveAllRentals(List<RentalTransaction> rentals) {
        ensureDataDirExists();
        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(RENTALS_FILE))) {
            for (RentalTransaction r : rentals) {
                RenterProfile p = r.renterProfile;
                String name = p != null ? p.getName() : "";
                String address = p != null ? p.getAddress() : "";
                String contact = p != null ? p.getContactNumber() : "";
                String license = p != null ? p.getLicenseNumber() : "";
                String age = p != null ? p.getAge() : "";

                String line = String.join(",",
                        escapeCsv(r.transactionId), escapeCsv(r.motorcycleId),
                        escapeCsv(name), escapeCsv(address), escapeCsv(contact),
                        escapeCsv(license), escapeCsv(age), String.valueOf(r.days),
                        String.valueOf(r.totalCost), String.valueOf(r.initialPayment),
                        escapeCsv(r.paymentType), escapeCsv(r.date),
                        escapeCsv(r.returnDate), escapeCsv(r.status)
                );
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error saving rentals: " + e.getMessage());
        }
    }

    public static ArrayList<RentalTransaction> loadRentals() {
        ArrayList<RentalTransaction> list = new ArrayList<>();
        Path path = Paths.get(RENTALS_FILE);
        if (!Files.exists(path)) return list;

        try (BufferedReader reader = Files.newBufferedReader(path)) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.trim().isEmpty()) continue;
                String[] d = line.split(",", -1);
                if (d.length >= 14) {
                    RenterProfile profile = new RenterProfile(
                            unescapeCsv(d[2]), unescapeCsv(d[3]), unescapeCsv(d[4]),
                            unescapeCsv(d[5]), unescapeCsv(d[6])
                    );
                    int days = Integer.parseInt(d[7]);
                    double totalCost = Double.parseDouble(d[8]);
                    double initialPayment = Double.parseDouble(d[9]);

                    list.add(new RentalTransaction(
                            unescapeCsv(d[0]), unescapeCsv(d[1]), profile, days,
                            totalCost, initialPayment, unescapeCsv(d[10]),
                            unescapeCsv(d[11]), unescapeCsv(d[12]), unescapeCsv(d[13])
                    ));
                }
            }
        } catch (IOException | NumberFormatException e) {
            System.err.println("Error loading rentals: " + e.getMessage());
        }
        return list;
    }

    // ==========================================
    // 5. DAMAGE REPORTS FILE HANDLING
    // ==========================================

    public static void saveAllDamageReports(List<String> reports) {
        ensureDataDirExists();
        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(DAMAGE_REPORTS_FILE))) {
            for (String report : reports) {
                String singleLineRecord = report.replace("\n", "||");
                writer.write(singleLineRecord);
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error saving damage reports: " + e.getMessage());
        }
    }

    public static ArrayList<String> loadDamageReports() {
        ArrayList<String> list = new ArrayList<>();
        Path path = Paths.get(DAMAGE_REPORTS_FILE);
        if (!Files.exists(path)) return list;

        try (BufferedReader reader = Files.newBufferedReader(path)) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    list.add(line.replace("||", "\n"));
                }
            }
        } catch (IOException e) {
            System.err.println("Error loading damage reports: " + e.getMessage());
        }
        return list;
    }
}