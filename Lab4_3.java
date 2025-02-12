// Create a calculator class that contains a method add() to perform additions Overload the add() method to handle different types and numbers of parameters, such as adding two integers, two doubles and three integers. Create an object of the class and demonstrate all method variations.

class Calculator {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add two doubles
    public double add(double a, double b) {
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Lab4_3 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Demonstrating different add methods
        System.out.println("Adding two integers (5 + 3): " + 
            calc.add(5, 3));

        System.out.println("Adding two doubles (3.5 + 2.7): " + 
            calc.add(3.5, 2.7));

        System.out.println("Adding three integers (4 + 3 + 2): " + 
            calc.add(4, 3, 2));
    }
}
