// A student is developing a course registration system that allows students to enroll in courses. Each course has a course name and a course code. Implement a course class with appropriate attirbutes and use the 'this' keyword to differentiate between class attributes and constructor parameters during initialization. Create an object of the course class and display the course detail. Keep the variable name of formal arguments in constructor and instance variables same.

public class Lab4_5 {
    public static void main(String[] args) {
        Course course = new Course("Java Programming", "CS101");
        course.displayCourseDetails();
    }
}

class Course {
    private String courseName;
    private String courseCode;
    
    public Course(String courseName, String courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
    }
    
    public void displayCourseDetails() {
        System.out.println("Course Details:");
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Code: " + courseCode);
    }
}
