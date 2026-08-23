import java.util.*;

public class PRIME_iv_12 {

    public static boolean check_prime(int n) {

        int count = 0;

        for (int i = 1; i <= Math.sqrt(n); i++) {

            if (n % i == 0) {

                count++;

                if (n / i != i) {
                    count++;
                }
            }
        }

        return count == 2;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] arr = {7, 11, 12, 13, 15};

        for (int i = 0; i < arr.length; i++) {

            boolean result = check_prime(arr[i]);

            System.out.println(arr[i] + " : " + result);
        }
    }
}