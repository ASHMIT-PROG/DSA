import java.util.Scanner;

public class L0_Count_2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Count Even Numbers from 1 to N
        System.out.println("Enter the value of n:");
        int n = input.nextInt();

        int count = 0;

        for (int i = 1; i <= n; i++) {

            if (i % 2 == 0) {

                System.out.println(i + " % 2 = 0");
                count++;

            } else {
                // return; likha toh poora main() terminate ho jayega
            }
        }

        System.out.println("The number of even numbers are " + count);
    }
}