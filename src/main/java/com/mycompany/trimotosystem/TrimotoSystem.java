import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.time.LocalDate;
import java.util.ArrayList;



class Motorcycle {
    String id, brand, model, type, status;
    int year, mileage;
    double dailyRate;

    Motorcycle(String id, String brand, String model, int year, String type, int mileage, double dailyRate) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.type = type;
        this.mileage = mileage;
        this.dailyRate = dailyRate;
        this.status = "Available";
    }
}

class InspectionRecord {
    String motorcycleId, inspector, condition, damage, date;
    InspectionRecord(String motorcycleId, String inspector, String condition, String damage, String date) {
        this.motorcycleId = motorcycleId;
        this.inspector = inspector;
        this.condition = condition;
        this.damage = damage;
        this.date = date;
    }
}

class MaintenanceRecord {
    String motorcycleId, service, mechanic, date;
    double cost;
    MaintenanceRecord(String motorcycleId, String service, double cost, String mechanic, String date) {
        this.motorcycleId = motorcycleId;
        this.service = service;
        this.cost = cost;
        this.mechanic = mechanic;
        this.date = date;
    }
}

class RentalTransaction {
    String transactionId, motorcycleId, renter, date, status;
    int days;
    double totalCost;
    RentalTransaction(String transactionId, String motorcycleId, String renter, int days, double totalCost, String date, String status) {
        this.transactionId = transactionId;
        this.motorcycleId = motorcycleId;
        this.renter = renter;
        this.days = days;
        this.totalCost = totalCost;
        this.date = date;
        this.status = status;
    }
}