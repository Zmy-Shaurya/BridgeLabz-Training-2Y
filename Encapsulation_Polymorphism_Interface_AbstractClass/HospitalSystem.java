import java.util.*;

abstract class Patient {
    private int patientId;
    private String name;
    private int age;

    public Patient(int id, String name, int age) {
        this.patientId = id;
        this.name = name;
        this.age = age;
    }

    public void getPatientDetails() {
        System.out.println("ID: " + patientId + ", Name: " + name + ", Age: " + age);
    }

    public abstract double calculateBill();
}

interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

class InPatient extends Patient implements MedicalRecord {
    private double roomCharges;
    private double treatmentCharges;
    private List<String> records = new ArrayList<>();

    public InPatient(int id, String name, int age, double room, double treatment) {
        super(id, name, age);
        this.roomCharges = room;
        this.treatmentCharges = treatment;
    }

    @Override
    public double calculateBill() { return roomCharges + treatmentCharges; }

    @Override
    public void addRecord(String record) { records.add(record); }

    @Override
    public void viewRecords() { System.out.println("Records: " + records); }
}

class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private List<String> records = new ArrayList<>();

    public OutPatient(int id, String name, int age, double fee) {
        super(id, name, age);
        this.consultationFee = fee;
    }

    @Override
    public double calculateBill() { return consultationFee; }

    @Override
    public void addRecord(String record) { records.add(record); }

    @Override
    public void viewRecords() { System.out.println("Records: " + records); }
}

public class HospitalSystem {
    public static void main(String[] args) {
        Patient p1 = new InPatient(1, "Ravi", 45, 5000, 8000);
        Patient p2 = new OutPatient(2, "Anita", 30, 500);

        p1.getPatientDetails();
        System.out.println("Bill: " + p1.calculateBill());
        ((MedicalRecord) p1).addRecord("Surgery done");
        ((MedicalRecord) p1).viewRecords();

        System.out.println("----");

        p2.getPatientDetails();
        System.out.println("Bill: " + p2.calculateBill());
        ((MedicalRecord) p2).addRecord("Consultation");
        ((MedicalRecord) p2).viewRecords();
    }
}
