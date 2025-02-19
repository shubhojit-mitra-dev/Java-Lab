public class Question3 {
    public static void main(String[] args) {
        DailyWorker dailyWorker = new DailyWorker("John", 20);
        SalariedWorker salariedWorker = new SalariedWorker("Jane", 15);

        System.out.println("Daily Worker's weekly pay: " + dailyWorker.computePay(40));
        System.out.println("Salaried Worker's weekly pay: " + salariedWorker.computePay(40));
    }
}

class Worker {
    String name;
    double salaryRate;

    public Worker(String name, double salaryRate) {
        this.name = name;
        this.salaryRate = salaryRate;
    }

    public double computePay(int hours) {
        // Default implementation, can be overridden by subclasses
        return 0;
    }
}

class DailyWorker extends Worker {
    public DailyWorker(String name, double salaryRate) {
        super(name, salaryRate);
    }

    public double computePay(int hours) {
        int daysWorked = hours / 8;
        return daysWorked * salaryRate;
    }
}

class SalariedWorker extends Worker {
    public SalariedWorker(String name, double salaryRate) {
        super(name, salaryRate);
    }

    public double computePay(int hours) {
        return 40 * salaryRate;
    }
}