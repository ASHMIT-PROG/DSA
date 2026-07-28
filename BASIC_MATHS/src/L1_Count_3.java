import java.util.Scanner;

public class L1_Count_3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Count odd digits
        System.out.println("Enter the number:");
        int w = input.nextInt();

        int n = w;
        int count = 0;

        while (n > 0) {

            // Get last digit
            int last_digit = n % 10;

            // Check whether digit is odd
            if (last_digit % 2 != 0) {
                System.out.println("Odd digit = " + last_digit);
                count++;
            }

            // Remove last digit
            n = n / 10;
        }

        System.out.println("Total odd digits = " + count);
    }
}