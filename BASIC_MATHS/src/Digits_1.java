import java.util.Scanner;

public class Digits_1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number:");
        int w = input.nextInt();

        int n = w;
        int count = 0;

        while (n > 0) {

            int last_digit = n % 10; // last digit nialo

            System.out.println("Last digit: " + last_digit);

            count = count + 1;

            n = n / 10;// last digit hatao
        }

        System.out.println("Number of digits: " + count);
    }
}