class Patient {
    private String name;
    private int age;
    private String ailment;
    private final int patientID;

    private static String hospitalName = "Apollo Hospital";
    private static int totalPatients = 0;

    public Patient(String name, int age, String ailment, int patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }

    public void displayDetails() {
        if (this instanceof Patient) {
            System.out.println("Hospital: " + hospitalName);
            System.out.println("Patient ID: " + patientID + ", Name: " + name + ", Age: " + age + ", Ailment: " + ailment);
        }
    }

    public static void getTotalPatients() {
        System.out.println("Total Patients: " + totalPatients);
    }

    public static void main(String[] args) {
        Patient p1 = new Patient("Ramesh", 40, "Fever", 1001);
        Patient p2 = new Patient("Geeta", 30, "Cold", 1002);

        p1.displayDetails();
        p2.displayDetails();
        Patient.getTotalPatients();
    }
}
