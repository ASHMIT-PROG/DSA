import java.util.Scanner;

// Count even digits
public class L1_Count_2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int w = input.nextInt();

        int n = w;
        int count = 0;

        while (n > 0) {

            int lastdigit = n % 10;

            if (lastdigit % 2 == 0) {
                System.out.println(lastdigit);
                count++;
            }

            n = n / 10;
        }

        System.out.println("Even digits = " + count);
    }
}