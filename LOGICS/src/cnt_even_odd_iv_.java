import java.util.Scanner;

public class cnt_even_odd_iv_ {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = input.nextInt();

        int even = 0;
        int odd = 0;

        System.out.print("Even digits: ");

        while (num > 0) {

            int digit = num % 10;
            num = num / 10;

            if (digit % 2 == 0) {
                System.out.print(digit + " ");
                even++;
            } else {
                odd++;
            }
        }

        System.out.println();
        System.out.println("Even count = " + even);
        System.out.println("Odd count = " + odd);

        input.close();
    }
}