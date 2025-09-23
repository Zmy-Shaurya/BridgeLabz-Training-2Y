class Student {
    private String name;
    private final int rollNumber;
    private String grade;

    private static String universityName = "Delhi University";
    private static int totalStudents = 0;

    public Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    public void displayDetails() {
        if (this instanceof Student) {
            System.out.println("University: " + universityName);
            System.out.println("Name: " + name + ", Roll No: " + rollNumber + ", Grade: " + grade);
        }
    }

    public static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Karan", 1, "A");
        Student s2 = new Student("Neha", 2, "B");

        s1.displayDetails();
        s2.displayDetails();
        Student.displayTotalStudents();
    }
}
