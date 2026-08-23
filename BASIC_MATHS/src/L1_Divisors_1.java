import java.util.Scanner;

public class L1_Divisors_1 {

    public static int count_divisors(int n) {

        int count = 0;

        for (int i = 1; i * i <= n; i++) {

            if (n % i == 0) {

                if (i == n / i) {
                    count++;        // Perfect square divisor
                } else {
                    count += 2;     // i and n/i
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = input.nextInt();

        System.out.println("Number of divisors = " + count_divisors(n));

        input.close();
    }
}