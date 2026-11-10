import java.util.ArrayList;
import java.util.List;

public class TrimotoSystem {
    // Encapsulated private static collections (Data Hiding)
    private static final List<Motorcycle> motorcycles = new ArrayList<>();
    private static final List<InspectionRecord> inspections = new ArrayList<>();
    private static final List<MaintenanceRecord> maintenanceRecords = new ArrayList<>();
    private static final List<RentalTransaction> rentals = new ArrayList<>();
    private static final List<DamageReport> damageReports = new ArrayList<>();
    
    static {
        motorcycles.addAll(FileManager.loadMotorcycles());
        inspections.addAll(FileManager.loadInspections());
        maintenanceRecords.addAll(FileManager.loadMaintenanceRecords());
        rentals.addAll(FileManager.loadRentals());
        damageReports.addAll(FileManager.loadDamageReports());
    }

    // --- ENCAPSULATED ACCESSORS (Defensive Copies) ---
    public static List<Motorcycle> getMotorcycles() {
        return new ArrayList<>(motorcycles);
    }

    public static List<InspectionRecord> getInspections() {
        return new ArrayList<>(inspections);
    }

    public static List<MaintenanceRecord> getMaintenanceRecords() {
        return new ArrayList<>(maintenanceRecords);
    }

    public static List<RentalTransaction> getRentals() {
        return new ArrayList<>(rentals);
    }

    public static List<DamageReport> getDamageReports() {
        return new ArrayList<>(damageReports);
    }

    // --- REPOSITORY MUTATOR METHODS ---
    public static void addMotorcycle(Motorcycle m) {
        if (m != null) {
            motorcycles.add(m);
            saveAllData();
        }
    }

    public static void addInspection(InspectionRecord r) {
        if (r != null) {
            inspections.add(r);
            saveAllData();
        }
    }

    public static void addMaintenanceRecord(MaintenanceRecord r) {
        if (r != null) {
            maintenanceRecords.add(r);
            saveAllData();
        }
    }

    public static void addRentalTransaction(RentalTransaction r) {
        if (r != null) {
            rentals.add(r);
            saveAllData();
        }
    }

    public static void addDamageReport(DamageReport r) {
        if (r != null) {
            damageReports.add(r);
            saveAllData();
        }
    }

    public static void removeRentalTransaction(String transactionId) {
        if (transactionId != null) {
            rentals.removeIf(r -> r.getTransactionId().equalsIgnoreCase(transactionId.trim()));
            saveAllData();
        }
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
    
    public double calculateRentalCost(int days) {
        return days * getDailyRate();
    }
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
    private String recordId;
    private String motorcycleId;
    private String date;
    private String phase;
    private String odometer;
    private String fuel;
    private String tires;
    private String brakes;
    private String headlight;
    private String horns;
    private String mirrors;
    private String body;
    private String engine;
    private String condition;
    private String readiness;
    private String notes;

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

    public String getRecordId() { 
        return recordId; 
    }
    
    public void setRecordId(String recordId) { 
        this.recordId = recordId; 
    }

    public String getMotorcycleId() { 
        return motorcycleId; 
    }
    
    public void setMotorcycleId(String motorcycleId) { 
        this.motorcycleId = motorcycleId; 
    }

    public String getDate() { 
        return date; 
    }
    
    public void setDate(String date) { 
        this.date = date; 
    }

    public String getPhase() { 
        return phase; 
    }
    
    public void setPhase(String phase) { 
        this.phase = phase; 
    }

    public String getOdometer() { 
        return odometer; 
    }
    
    public void setOdometer(String odometer) { 
        this.odometer = odometer; 
    }

    public String getFuel() { 
        return fuel; 
    }
    
    public void setFuel(String fuel) { 
        this.fuel = fuel; 
    }

    public String getTires() { 
        return tires; 
    }
    
    public void setTires(String tires) { 
        this.tires = tires; 
    }

    public String getBrakes() { 
        return brakes; 
    }
    
    public void setBrakes(String brakes) { 
        this.brakes = brakes; 
    }

    public String getHeadlight() { 
        return headlight; 
    }
    
    public void setHeadlight(String headlight) { 
        this.headlight = headlight; 
    }

    public String getHorns() { 
        return horns; 
    }
    
    public void setHorns(String horns) { 
        this.horns = horns; 
    }

    public String getMirrors() { 
        return mirrors; 
    }
    
    public void setMirrors(String mirrors) { 
        this.mirrors = mirrors; 
    }

    public String getBody() { 
        return body; 
    }
    
    public void setBody(String body) { 
        this.body = body; 
    }

    public String getEngine() { 
        return engine; 
    }
    
    public void setEngine(String engine) { 
        this.engine = engine; 
    }

    public String getCondition() { 
        return condition; 
    }
    
    public void setCondition(String condition) { 
        this.condition = condition; 
    }

    public String getReadiness() { 
        return readiness; 
    }
    
    public void setReadiness(String readiness) { 
        this.readiness = readiness; 
    }

    public String getNotes() { 
        return notes; 
    }
    
    public void setNotes(String notes) { 
        this.notes = notes; 
    }
}

class MaintenanceRecord {
    private String recordId;
    private String motorcycleId;
    private String date;
    private String type;
    private String category;
    private String workPerformed;
    private String partsReplaced;
    private String odometer;
    private double cost;
    private String nextServiceMileage;
    private String remarks;

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

    public String getRecordId() { 
        return recordId; 
    }
    
    public void setRecordId(String recordId) { 
        this.recordId = recordId; 
    }

    public String getMotorcycleId() { 
        return motorcycleId; 
    }
    
    public void setMotorcycleId(String motorcycleId) { 
        this.motorcycleId = motorcycleId; 
    }

    public String getDate() { 
        return date; 
    }
    
    public void setDate(String date) { 
        this.date = date; 
    }

    public String getType() { 
        return type; 
    }
    
    public void setType(String type) { 
        this.type = type; 
    }

    public String getCategory() { 
        return category; 
    }
    
    public void setCategory(String category) { 
        this.category = category; 
    }

    public String getWorkPerformed() { 
        return workPerformed; 
    }
    
    public void setWorkPerformed(String workPerformed) { 
        this.workPerformed = workPerformed; 
    }

    public String getPartsReplaced() { 
        return partsReplaced; 
    }
    
    public void setPartsReplaced(String partsReplaced) { 
        this.partsReplaced = partsReplaced; 
    }

    public String getOdometer() { 
        return odometer; 
    }
    
    public void setOdometer(String odometer) { 
        this.odometer = odometer; 
    }

    public double getCost() { 
        return cost; 
    }
    
    public void setCost(double cost) { 
        this.cost = cost; 
    }

    public String getNextServiceMileage() { 
        return nextServiceMileage; 
    }
    
    public void setNextServiceMileage(String nextServiceMileage) { 
        this.nextServiceMileage = nextServiceMileage; 
    }

    public String getRemarks() { 
        return remarks; 
    }
    
    public void setRemarks(String remarks) { 
        this.remarks = remarks; 
    }
}

class RentalTransaction {
    private String transactionId;
    private String motorcycleId;
    private RenterProfile renterProfile;
    private int days;
    private double totalCost;
    private double initialPayment;
    private String paymentType;
    private String date;
    private String returnDate;
    private String status;

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

    public String getTransactionId() { 
        return transactionId; 
    }
    
    public void setTransactionId(String transactionId) { 
        this.transactionId = transactionId; 
    }

    public String getMotorcycleId() { 
        return motorcycleId; 
    }
    
    public void setMotorcycleId(String motorcycleId) { 
        this.motorcycleId = motorcycleId; 
    }

    public RenterProfile getRenterProfile() { 
        return renterProfile; 
    }
    
    public void setRenterProfile(RenterProfile renterProfile) { 
        this.renterProfile = renterProfile; 
    }

    public int getDays() { 
        return days; 
    }
    
    public void setDays(int days) { 
        this.days = days; 
    }

    public double getTotalCost() { 
        return totalCost; 
    }
    
    public void setTotalCost(double totalCost) { 
        this.totalCost = totalCost; 
    }

    public double getInitialPayment() { 
        return initialPayment; 
    }
    
    public void setInitialPayment(double initialPayment) { 
        this.initialPayment = initialPayment; 
    }

    public String getPaymentType() { 
        return paymentType; 
    }
    
    public void setPaymentType(String paymentType) { 
        this.paymentType = paymentType; 
    }

    public String getDate() { 
        return date; 
    }
    
    public void setDate(String date) { 
        this.date = date; 
    }

    public String getReturnDate() { 
        return returnDate; 
    }
    
    public void setReturnDate(String returnDate) { 
        this.returnDate = returnDate; 
    }

    public String getStatus() { 
        return status; 
    }
    
    public void setStatus(String status) { 
        this.status = status; 
    }

    public String getRenterName() {
        return renterProfile != null ? renterProfile.getName() : "";
    }
}

class DamageReport {
    private String reportId;
    private String motorcycleId;
    private String date;
    private String location;
    private String type;
    private String description;
    private double estimatedCost;
    private String notes;

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

    public String getReportId() { 
        return reportId; 
    }
    
    public void setReportId(String reportId) { 
        this.reportId = reportId; 
    }

    public String getMotorcycleId() { 
        return motorcycleId; 
    }
    
    public void setMotorcycleId(String motorcycleId) { 
        this.motorcycleId = motorcycleId; 
    }

    public String getDate() { 
        return date; 
    }
    
    public void setDate(String date) { 
        this.date = date; 
    }

    public String getLocation() { 
        return location; 
    }
    
    public void setLocation(String location) { 
        this.location = location; 
    }

    public String getType() { 
        return type; 
    }
    
    public void setType(String type) { 
        this.type = type; 
    }

    public String getDescription() { 
        return description; 
    }
    
    public void setDescription(String description) { 
        this.description = description; 
    }

    public double getEstimatedCost() { 
        return estimatedCost; 
    }
    
    public void setEstimatedCost(double estimatedCost) { 
        this.estimatedCost = estimatedCost; 
    }

    public String getNotes() { 
        return notes; 
    }
    
    public void setNotes(String notes) { 
        this.notes = notes; 
    }
}