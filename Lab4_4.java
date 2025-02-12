// Create a student class that has a static bariable universityName and a non-static variable studentName. Include a static method to display the university name. Then create multiple student objects to demonstrate how the state variable is shared among all instances, while the non-static variable holds unique values for each object.

class Student {
    static String universityName = "My University"; // static variable shared by all instances
    String studentName;  // non-static variable unique to each instance

    // Constructor
    public Student(String name) {
        this.studentName = name;
    }

    // Static method to display university name
    public static void displayUniversity() {
        System.out.println("University: " + universityName);
    }

    // Non-static method to display student details
    public void displayDetails() {
        System.out.println("Student Name: " + studentName);
        System.out.println("University: " + universityName);
        System.out.println();
    }
}

public class Lab4_4 {
    public static void main(String[] args) {
        // Display university name using static method
        System.out.println("Calling static method:");
        Student.displayUniversity();
        System.out.println();

        // Create multiple student objects
        Student student1 = new Student("John Doe");
        Student student2 = new Student("Jane Smith");
        Student student3 = new Student("Bob Johnson");

        // Display initial details
        System.out.println("Initial Details:");
        student1.displayDetails();
        student2.displayDetails();
        student3.displayDetails();

        // Change university name (affects all instances)
        Student.universityName = "New University Name";
        
        System.out.println("After changing university name:");
        student1.displayDetails();
        student2.displayDetails();
        student3.displayDetails();
    }
}
