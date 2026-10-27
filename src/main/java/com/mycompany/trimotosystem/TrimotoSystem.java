import java.util.ArrayList;
import java.util.List;

public class TrimotoSystem {
    public static final List<Motorcycle> motorcycles = new ArrayList<>();
    public static final List<InspectionRecord> inspections = new ArrayList<>();
    public static final List<MaintenanceRecord> maintenanceRecords = new ArrayList<>();
    public static final List<RentalTransaction> rentals = new ArrayList<>();
    public static final List<String> damageReports = new ArrayList<>();

    public static Motorcycle findMotorcycleById(String id) {
        if (id == null) return null;
        for (Motorcycle m : motorcycles) {
            if (m.id.equalsIgnoreCase(id.trim())) {
                return m;
            }
        }
        return null;
    }
}


abstract class Motorcycle {
    public String id;
    public String brand;
    public String model;
    public int year;
    public String type;
    public String transmissionType;
    public int mileage;
    public double dailyRate;
    public String status;

    public Motorcycle(String id, String brand, String model, int year, String type, String transmissionType, int mileage, double dailyRate) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.type = type;
        this.transmissionType = transmissionType;
        this.mileage = mileage;
        this.dailyRate = dailyRate;
        this.status = "Available";
    }
}

// Scooter Subclass
class Scooter extends Motorcycle {
    public int engineDisplacement;
    public double storageCapacity; // Compartment Capacity
    public double fuelCapacity;

    public Scooter(String id, String brand, String model, int year, String transmissionType, int mileage, double dailyRate, int engineDisplacement, double storageCapacity, double fuelCapacity) {
        super(id, brand, model, year, "Scooter", transmissionType, mileage, dailyRate);
        this.engineDisplacement = engineDisplacement;
        this.storageCapacity = storageCapacity;
        this.fuelCapacity = fuelCapacity;
    }
}

class AdventureBike extends Motorcycle {
    public int engineDisplacement;
    public double storageCapacity; // Compartment Capacity
    public double fuelCapacity;
    public double groundClearance;

    public AdventureBike(String id, String brand, String model, int year, String transmissionType, int mileage, double dailyRate, int engineDisplacement, double storageCapacity, double fuelCapacity, double groundClearance) {
        super(id, brand, model, year, "Adventure Bike", transmissionType, mileage, dailyRate);
        this.engineDisplacement = engineDisplacement;
        this.storageCapacity = storageCapacity;
        this.fuelCapacity = fuelCapacity;
        this.groundClearance = groundClearance;
    }
}

// StandardBike Subclass
class StandardBike extends Motorcycle {
    public int engineDisplacement;
    public double fuelCapacity;

    public StandardBike(String id, String brand, String model, int year, String transmissionType, int mileage, double dailyRate, int engineDisplacement, double fuelCapacity) {
        super(id, brand, model, year, "Standard Bike", transmissionType, mileage, dailyRate);
        this.engineDisplacement = engineDisplacement;
        this.fuelCapacity = fuelCapacity;
    }
}

// SportsBike Subclass
class SportsBike extends Motorcycle {
    public int engineDisplacement;
    public double fuelCapacity;

    public SportsBike(String id, String brand, String model, int year, String transmissionType, int mileage, double dailyRate, int engineDisplacement, double fuelCapacity) {
        super(id, brand, model, year, "Sports Bike", transmissionType, mileage, dailyRate);
        this.engineDisplacement = engineDisplacement;
        this.fuelCapacity = fuelCapacity;
    }
}

// ElectricBike Subclass
class ElectricBike extends Motorcycle {
    public double motorPower;
    public double batteryCapacity;
    public double chargingTime;

    public ElectricBike(String id, String brand, String model, int year, int mileage, double dailyRate, double motorPower, double batteryCapacity, double chargingTime) {
        super(id, brand, model, year, "Electric Bike", "Automatic", mileage, dailyRate);
        this.motorPower = motorPower;
        this.batteryCapacity = batteryCapacity;
        this.chargingTime = chargingTime;
    }
}

class RenterProfile {
    public String name;
    public String address;
    public String contactNumber;
    public String licenseNumber;
    public String age;

    public RenterProfile(String name, String address, String contactNumber, String licenseNumber, String age) {
        this.name = name;
        this.address = address;
        this.contactNumber = contactNumber;
        this.licenseNumber = licenseNumber;
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
    String recordId, motorcycleId, date, type, category, workPerformed, partsReplaced, odometer, nextServiceMileage, status, availability, remarks;
    double cost;

    public MaintenanceRecord(String recordId, String motorcycleId, String date, String type, String category, String workPerformed,
                              String partsReplaced, String odometer, double cost, String nextServiceMileage,
                              String status, String availability, String remarks) {
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
        this.status = status;
        this.availability = availability;
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
        return renterProfile != null ? renterProfile.name : "";
    }

    public String getAddress() {
        return renterProfile != null ? renterProfile.address : "";
    }

    public String getContactNumber() {
        return renterProfile != null ? renterProfile.contactNumber : "";
    }

    public String getLicenseNumber() {
        return renterProfile != null ? renterProfile.licenseNumber : "";
    }
}