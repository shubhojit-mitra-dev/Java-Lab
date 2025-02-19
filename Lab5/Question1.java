// Write a Java program to demonstrate that a private member of a superclass cannot be accessed directly from a derived class. 

class SuperClass {
    private int num = 10;
}


class Question1 extends SuperClass{
    public static void main(String[] args) {
        // System.out.println(num); // Error: num has private access in SuperClass
    }
}

