import java.util.Scanner;

public class PRIME_12 {

    public static void check_prime(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            int count = 0;

            for (int j = 1; j <= arr[i]; j++) {

                if (arr[i] % j == 0) {
                    count++;
                }

            }

            if (count == 2) {
                System.out.println(arr[i] + " is Prime");
            } else {
                System.out.println(arr[i] + " is Not Prime");
            }

        }

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = input.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        check_prime(arr);

        input.close();
    }
}