class BankAccount {
    private double balance;  // private variable - only accessible within class

    public BankAccount() {
        balance = 0.0;
    }

    public void deposit(double amount) {  // public method - accessible everywhere
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
            checkBalance();
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    protected void withdraw(double amount) {  // protected method - accessible in same package and subclasses
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
            checkBalance();
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds");
        }
    }

    void checkBalance() {  // default access - only accessible within same package
        System.out.println("Current Balance: $" + balance);
    }
}

public class Lab4_2 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        
        // Demonstrating access levels
        account.deposit(1000);    // public method - accessible
        account.withdraw(500);    // protected method - accessible (same package)
        account.checkBalance();   // default method - accessible (same package)
        
        // This would cause error - private variable cannot be accessed
        // System.out.println(account.balance);  // Uncommenting this line will show error
    }
}
