import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter call duration in minutes:");
        int duration = scanner.nextInt();

        System.out.println("Enter call type (1 for Ordinary, 2 for Urgent, 3 for Lightning):");
        int type = scanner.nextInt();

        scanner.close();

        TrunkCall call;
        switch (type) {
            case 1:
                call = new OrdinaryCall(duration);
                break;
            case 2:
                call = new UrgentCall(duration);
                break;
            case 3:
                call = new LightningCall(duration);
                break;
            default:
                System.out.println("Invalid call type.");
                return;
        }

        System.out.println("Total charge: " + call.calculateCharge());
    }
}

class TrunkCall {
    int duration;

    public TrunkCall(int duration) {
        this.duration = duration;
    }

    public double calculateCharge() {
        return 0;
    }
}

class OrdinaryCall extends TrunkCall {
    public OrdinaryCall(int duration) {
        super(duration);
    }

    @Override
    public double calculateCharge() {
        return duration * 1.0; // Ordinary call rate is 1.0 per minute
    }
}

class UrgentCall extends TrunkCall {
    public UrgentCall(int duration) {
        super(duration);
    }

    @Override
    public double calculateCharge() {
        return duration * 1.5; // Urgent call rate is 1.5 per minute
    }
}

class LightningCall extends TrunkCall {
    public LightningCall(int duration) {
        super(duration);
    }

    @Override
    public double calculateCharge() {
        return duration * 2.0; // Lightning call rate is 2.0 per minute
    }
}