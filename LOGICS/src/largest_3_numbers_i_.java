import java.util.Scanner;

public class largest_3_numbers_i_ {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int num1 = input.nextInt();

        System.out.println("Enter the second number:");
        int num2 = input.nextInt();

        System.out.println("Enter the third number:");
        int num3 = input.nextInt();

        int largest = num1;

        if (num2 >largest) {
            largest = num2;
        }
        else if (num3 > largest ) {
            largest = num3;
        }


        System.out.println("Largest number = " + largest);

        input.close();
    }
}