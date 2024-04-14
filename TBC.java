import java.util.Scanner;

public class TBC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input telephone number
        System.out.print("Enter telephone number: ");
        String num = scanner.nextLine();

        // Input number of calls
        System.out.print("Enter number of calls: ");
        int numofcall = scanner.nextInt();

        // Calculate bill amount
        double billAmount = calculateBillAmount(numofcall);

        // Display bill amount
        System.out.println("Telephone number: " + num);
        System.out.println("Bill amount: Rs. " + billAmount);

        scanner.close();
    }

    public static double calculateBillAmount(int numofcall) {
        final double RENT = 400.0;
        final int FREE_CALLS = 150;
        final double EXCESS_CALL_RATE = 0.80; // 80 paise

        double billAmount;

        if (numofcall <= FREE_CALLS) {
            billAmount = RENT;
        } else {
            int excessCalls = numofcall - FREE_CALLS;
            billAmount = RENT + (excessCalls * EXCESS_CALL_RATE);
        }

        return billAmount;
    }
}

