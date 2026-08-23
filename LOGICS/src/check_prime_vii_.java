import java.util.Scanner;

public class check_prime_vii_ {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number:");
        int num = input.nextInt();

        int count = 0;

        for (int i = 1; i <= num; i++) {

            if (num % i == 0) {
                count++;
            }
        }

        if (count == 2) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }

        input.close();
    }
}