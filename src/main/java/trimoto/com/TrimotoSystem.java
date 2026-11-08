import java.util.ArrayList;
import java.util.List;

public class TrimotoSystem {
    public static final List<Motorcycle> motorcycles = new ArrayList<>();
    public static final List<InspectionRecord> inspections = new ArrayList<>();
    public static final List<MaintenanceRecord> maintenanceRecords = new ArrayList<>();
    public static final List<RentalTransaction> rentals = new ArrayList<>();
    public static final List<DamageReport> damageReports = new ArrayList<>();
    
     static {
        motorcycles.addAll(FileManager.loadMotorcycles());
        inspections.addAll(FileManager.loadInspections());
        maintenanceRecords.addAll(FileManager.loadMaintenanceRecords());
        rentals.addAll(FileManager.loadRentals());
        damageReports.addAll(FileManager.loadDamageReports());
    }

    public static Motorcycle findMotorcycleById(String id) {
        if (id == null) return null;
        for (Motorcycle m : motorcycles) {
            if (m.getId().equalsIgnoreCase(id.trim())) {
                return m;
            }
        }
        return null;
    }
    public static void saveAllData() {
        FileManager.saveAllMotorcycles(motorcycles);
        FileManager.saveAllInspections(inspections);
        FileManager.saveAllMaintenanceRecords(maintenanceRecords);
        FileManager.saveAllRentals(rentals);
        FileManager.saveAllDamageReports(damageReports);
    }
}

class MotorcycleFactory {
    public static Motorcycle createMotorcycle(String type, String id, String plate, String brand, String model, int year, 
                                              String transmission, int mileage, double dailyRate, 
                                              double spec1, double spec2, double spec3) {
        switch (type.trim()) {
            case "Scooter":
                return new Scooter(id, plate, brand, model, year, transmission, mileage, dailyRate, (int) spec1, spec2, spec3);
            case "Adventure Bike":
                return new AdventureBike(id, plate, brand, model, year, transmission, mileage, rateToDouble(dailyRate), (int) spec1, spec2, spec3, 220.0);
            case "Standard Bike":
                return new StandardBike(id, plate, brand, model, year, transmission, mileage, dailyRate, (int) spec1, spec2);
            case "Sports Bike":
                return new SportsBike(id, plate, brand, model, year, transmission, mileage, dailyRate, (int) spec1, spec2, spec3);
            case "Electric Bike":
                return new ElectricBike(id, plate, brand, model, year, mileage, dailyRate, spec1, spec2, spec3);
       
        }
        return null;
    }

    private static double rateToDouble(double rate) { return rate; }
}

abstract class Motorcycle {
    private String id;
    private String plate;
    private String brand;
    private String model;
    private int year;
    private String type;
    private String transmissionType;
    private int mileage;
    private double dailyRate;
    private String status;

    public Motorcycle(String id, String plate, String brand, String model, int year, String type, String transmissionType, int mileage, double dailyRate) {
        this.id = id;
        this.plate = plate;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.type = type;
        this.transmissionType = transmissionType;
        this.mileage = mileage;
        this.dailyRate = dailyRate;
        this.status = "Available";
    }

    public String getId() { 
        return id; 
    }
    
    public void setId(String id) { 
        this.id = id; 
    }

    public String getPlate() { 
        return plate; 
    }
    
    public void setPlate(String plate) { 
        this.plate = plate; 
    }
    
    public String getBrand() { 
        return brand; 
    }
    
    public void setBrand(String brand) { 
        this.brand = brand; 
    }

    public String getModel() { 
        return model; 
    }
    
    public void setModel(String model) { 
        this.model = model; 
    }

    public int getYear() { 
        return year; 
    }
    
    public void setYear(int year) { 
        this.year = year; 
    }

    public String getType() { 
        return type; 
    }
    
    public void setType(String type) { 
        this.type = type; 
    }

    public String getTransmissionType() { 
        return transmissionType; 
    }
    
    public void setTransmissionType(String transmissionType) { 
        this.transmissionType = transmissionType; 
    }

    public int getMileage() { 
        return mileage; 
    }
    
    public void setMileage(int mileage) { 
        this.mileage = mileage; 
    }

    public double getDailyRate() { 
        return dailyRate; 
    }
    
    public void setDailyRate(double dailyRate) { 
        this.dailyRate = dailyRate; 
    }

    public String getStatus() { 
        return status; 
    }
    
    public void setStatus(String status) { 
        this.status = status; 
    }

    public abstract String displayMotorcycleInfo();
    public abstract double calculateRentalCost(int days);
}

class Scooter extends Motorcycle {
    private int engineDisplacement;
    private double storageCapacity;
    private double fuelCapacity;

    public Scooter(String id, String plate, String brand, String model, int year, String transmissionType, int mileage, double dailyRate, int engineDisplacement, double storageCapacity, double fuelCapacity) {
        super(id, plate, brand, model, year, "Scooter", transmissionType, mileage, dailyRate);
        this.engineDisplacement = engineDisplacement;
        this.storageCapacity = storageCapacity;
        this.fuelCapacity = fuelCapacity;
    }
    
    
public int getEngineDisplacement() {
    return engineDisplacement;
}

public double getStorageCapacity() {
    return storageCapacity;
}

public double getFuelCapacity() {
    return fuelCapacity;
}


    @Override
    public String displayMotorcycleInfo() {
        return "Engine Displacement: " + engineDisplacement + " cc\n" +
               "Compartment Capacity: " + storageCapacity + " L\n" +
               "Fuel Capacity: " + fuelCapacity + " L\n";
    }

    @Override
    public double calculateRentalCost(int days) {
        return days * getDailyRate();
    }
}

class AdventureBike extends Motorcycle {
    private int engineDisplacement;
    private double storageCapacity;
    private double fuelCapacity;
    private double groundClearance;

    public AdventureBike(String id, String plate, String brand, String model, int year, String transmissionType, int mileage, double dailyRate, int engineDisplacement, double storageCapacity, double fuelCapacity, double groundClearance) {
        super(id, plate, brand, model, year, "Adventure Bike", transmissionType, mileage, dailyRate);
        this.engineDisplacement = engineDisplacement;
        this.storageCapacity = storageCapacity;
        this.fuelCapacity = fuelCapacity;
        this.groundClearance = groundClearance;
    }
    
    public int getEngineDisplacement() {
    return engineDisplacement;
}

public double getStorageCapacity() {
    return storageCapacity;
}

public double getFuelCapacity() {
    return fuelCapacity;
}

public double getGroundClearance() {
    return groundClearance;
}

    @Override
    public String displayMotorcycleInfo() {
        return "Engine Displacement: " + engineDisplacement + " cc\n" +
               "Compartment Capacity: " + storageCapacity + " L\n" +
               "Fuel Capacity: " + fuelCapacity + " L\n" +
               "Ground Clearance: " + groundClearance + " mm\n";
    }

    @Override
    public double calculateRentalCost(int days) {
        return (days * getDailyRate()); 
    }
}

class StandardBike extends Motorcycle {
    private int engineDisplacement;
    private double fuelCapacity;

    public StandardBike(String id, String plate, String brand, String model, int year, String transmissionType, int mileage, double dailyRate, int engineDisplacement, double fuelCapacity) {
        super(id, plate, brand, model, year, "Standard Bike", transmissionType, mileage, dailyRate);
        this.engineDisplacement = engineDisplacement;
        this.fuelCapacity = fuelCapacity;
    }

    public int getEngineDisplacement() {
    return engineDisplacement;
}

public double getFuelCapacity() {
    return fuelCapacity;
}
    
    @Override
    public String displayMotorcycleInfo() {
        return "Engine Displacement: " + engineDisplacement + " cc\n" +
               "Fuel Capacity: " + fuelCapacity + " L\n";
    }

    @Override
    public double calculateRentalCost(int days) {
        return days * getDailyRate();
    }
}

class SportsBike extends Motorcycle {
    private int engineDisplacement;
    private double fuelCapacity;
    private double powerOutput;

    public SportsBike(String id, String plate, String brand, String model, int year, String transmissionType, int mileage, double dailyRate, int engineDisplacement, double fuelCapacity, double powerOutput) {
        super(id, plate, brand, model, year, "Sports Bike", transmissionType, mileage, dailyRate);
        this.engineDisplacement = engineDisplacement;
        this.fuelCapacity = fuelCapacity;
        this.powerOutput = powerOutput;
    }

    public int getEngineDisplacement() {
    return engineDisplacement;
}

public double getFuelCapacity() {
    return fuelCapacity;
}

public double getPowerOutput() {
    return powerOutput;
}
    
    @Override
    public String displayMotorcycleInfo() {
        return "Engine Displacement: " + engineDisplacement + " cc\n" +
               "Fuel Capacity: " + fuelCapacity + " L\n" +
               "Power Output: " + powerOutput + " HP\n";
    }

    @Override
    public double calculateRentalCost(int days) {
        return (days * getDailyRate()) ; 
    }
}

class ElectricBike extends Motorcycle {
    private double motorPower;
    private double batteryCapacity;
    private double chargingTime;

    public ElectricBike(String id, String plate, String brand, String model, int year, int mileage, double dailyRate, double motorPower, double batteryCapacity, double chargingTime) {
        super(id, plate, brand, model, year, "Electric Bike", "Automatic", mileage, dailyRate);
        this.motorPower = motorPower;
        this.batteryCapacity = batteryCapacity;
        this.chargingTime = chargingTime;
    }

    public double getMotorPower() {
    return motorPower;
}

public double getBatteryCapacity() {
    return batteryCapacity;
}

public double getChargingTime() {
    return chargingTime;
}
    
    @Override
    public String displayMotorcycleInfo() {
        return "Motor Power: " + motorPower + " W\n" +
               "Battery Capacity: " + batteryCapacity + " Ah\n" +
               "Charging Time: " + chargingTime + " hrs\n";
    }

    @Override
    public double calculateRentalCost(int days) {
        return (days * getDailyRate()); 
    }
}

class RenterProfile {
    private String name;
    private String address;
    private String contactNumber;
    private String licenseNumber;
    private String age;

    public RenterProfile(String name, String address, String contactNumber, String licenseNumber, String age) {
        this.name = name;
        this.address = address;
        this.contactNumber = contactNumber;
        this.licenseNumber = licenseNumber;
        this.age = age;
    }
    

    public String getName() { 
        return name; 
    }
    
    public void setName(String name) { 
        this.name = name; 
    }

    public String getAddress() { 
        return address; 
    }
    
    public void setAddress(String address) { 
        this.address = address; 
    }

    public String getContactNumber() { 
        return contactNumber; 
    }
    
    public void setContactNumber(String contactNumber) { 
        this.contactNumber = contactNumber; 
    }

    public String getLicenseNumber() { 
        return licenseNumber; 
    }
    
    public void setLicenseNumber(String licenseNumber) { 
        this.licenseNumber = licenseNumber; 
    }

    public String getAge() { 
        return age; 
    }
    
    public void setAge(String age) { 
        this.age = age; 
    }
}

class InspectionRecord {
    String recordId, motorcycleId, date, phase, odometer, fuel, tires, brakes, headlight, horns, mirrors, body, engine, condition, readiness, notes;

    public InspectionRecord(String recordId, String motorcycleId, String date, String phase, String odometer, String fuel,
                            String tires, String brakes, String headlight, String horns, String mirrors,
                            String body, String engine, String condition, String readiness, String notes) {
        this.recordId = recordId;
        this.motorcycleId = motorcycleId;
        this.date = date;
        this.phase = phase;
        this.odometer = odometer;
        this.fuel = fuel;
        this.tires = tires;
        this.brakes = brakes;
        this.headlight = headlight;
        this.horns = horns;
        this.mirrors = mirrors;
        this.body = body;
        this.engine = engine;
        this.condition = condition;
        this.readiness = readiness;
        this.notes = notes;
    }
}

class MaintenanceRecord {
    public String recordId;
    public String motorcycleId;
    public String date;
    public String type;
    public String category;
    public String workPerformed;
    public String partsReplaced;
    public String odometer;
    public double cost;
    public String nextServiceMileage;
    public String remarks;

    public MaintenanceRecord(String recordId, String motorcycleId, String date, 
                             String type, String category, String workPerformed, 
                             String partsReplaced, String odometer, double cost, 
                             String nextServiceMileage, String remarks) {
        this.recordId = recordId;
        this.motorcycleId = motorcycleId;
        this.date = date;
        this.type = type;
        this.category = category;
        this.workPerformed = workPerformed;
        this.partsReplaced = partsReplaced;
        this.odometer = odometer;
        this.cost = cost;
        this.nextServiceMileage = nextServiceMileage;
        this.remarks = remarks;
    }
}

class RentalTransaction {
    public String transactionId;
    public String motorcycleId;
    public RenterProfile renterProfile;
    public int days;
    public double totalCost;
    public double initialPayment;
    public String paymentType;
    public String date;
    public String returnDate;
    public String status;

    public RentalTransaction(String transactionId, String motorcycleId, RenterProfile renterProfile, 
                             int days, double totalCost, double initialPayment, 
                             String paymentType, String date, String returnDate, String status) {
        this.transactionId = transactionId;
        this.motorcycleId = motorcycleId;
        this.renterProfile = renterProfile;
        this.days = days;
        this.totalCost = totalCost;
        this.initialPayment = initialPayment;
        this.paymentType = paymentType;
        this.date = date;
        this.returnDate = returnDate;
        this.status = status;
    }

    public String getRenterName() {
        return renterProfile != null ? renterProfile.getName() : "";
    }
}

class DamageReport {
    public String reportId;
    public String motorcycleId;
    public String date;
    public String location;
    public String type;
    public String description;
    public double estimatedCost;
    public String notes;

    public DamageReport(String reportId, String motorcycleId, String date, 
                        String location, String type, String description, 
                        double estimatedCost, String notes) {
        this.reportId = reportId;
        this.motorcycleId = motorcycleId;
        this.date = date;
        this.location = location;
        this.type = type;
        this.description = description;
        this.estimatedCost = estimatedCost;
        this.notes = notes;
    }
}