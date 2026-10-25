import java.util.ArrayList;
import java.util.List;

public class TrimotoSystem {
    // Centralized data repositories
    public static final List<Motorcycle> motorcycles = new ArrayList<>();
    public static final List<InspectionRecord> inspections = new ArrayList<>();
    public static final List<MaintenanceRecord> maintenanceRecords = new ArrayList<>();
    public static final List<RentalTransaction> rentals = new ArrayList<>();
    public static final List<String> damageReports = new ArrayList<>();

    // Static block starts clean without hardcoded sample data
    static {
        // Default sample motorcycles removed. System starts fresh.
    }

    // Helper method to look up a motorcycle by ID
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

// --- Data Model Classes ---

class Motorcycle {
    String id, brand, model, type, status;
    int year, mileage;
    double dailyRate;

    public Motorcycle(String id, String brand, String model, int year, String type, int mileage, double dailyRate) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.type = type;
        this.mileage = mileage;
        this.dailyRate = dailyRate;
        this.status = "Available"; // Default status upon creation
    }

    @Override
    public String toString() {
        return id + " - " + brand + " " + model;
    }
}

class InspectionRecord {
    String motorcycleId, date, phase, odometer, fuel, tires, brakes, headlight, horns, mirrors, body, engine, condition, readiness, notes;

    public InspectionRecord(String motorcycleId, String date, String phase, String odometer, String fuel,
                            String tires, String brakes, String headlight, String horns, String mirrors,
                            String body, String engine, String condition, String readiness, String notes) {
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

// Replace the existing MaintenanceRecord class with this:
class MaintenanceRecord {
    String motorcycleId, date, type, category, workPerformed, partsReplaced, odometer, nextServiceMileage, status, availability, remarks;
    double cost;

    public MaintenanceRecord(String motorcycleId, String date, String type, String category, String workPerformed,
                              String partsReplaced, String odometer, double cost, String nextServiceMileage,
                              String status, String availability, String remarks) {
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
    public String renter;
    public String address;
    public String contactNumber;
    public String licenseNumber;
    public int days;
    public double totalCost;
    public double initialPayment;
    public String paymentType;
    public String date;
    public String returnDate;
    public String status;

    public RentalTransaction(String transactionId, String motorcycleId, String renter, 
                             String address, String contactNumber, String licenseNumber, 
                             int days, double totalCost, double initialPayment, 
                             String paymentType, String date, String returnDate, String status) {
        this.transactionId = transactionId;
        this.motorcycleId = motorcycleId;
        this.renter = renter;
        this.address = address;
        this.contactNumber = contactNumber;
        this.licenseNumber = licenseNumber;
        this.days = days;
        this.totalCost = totalCost;
        this.initialPayment = initialPayment;
        this.paymentType = paymentType;
        this.date = date;
        this.returnDate = returnDate;
        this.status = status;
    }
}