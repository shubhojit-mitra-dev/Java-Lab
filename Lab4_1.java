class Student {
    String name;
    int age;

    // Default constructor
    Student() {
        name = "Unknown";
        age = 18;
    }

    // Parameterized constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display student details
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println();
    }
}

public class Lab4_1 {
    public static void main(String[] args) {
        // Creating object using default constructor
        Student student1 = new Student();
        System.out.println("Student 1 (Default Constructor):");
        student1.displayDetails();

        // Creating object using parameterized constructor
        Student student2 = new Student("John Doe", 20);
        System.out.println("Student 2 (Parameterized Constructor):");
        student2.displayDetails();
    }
}
