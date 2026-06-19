import java.util.Scanner;

public class check_sorted_array_i_8 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("INPUT SIZE OF ARRAY");
        int n = input.nextInt();

        int[] arr = new int[n];

        System.out.println("give the input of the array");

        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        boolean result = check_sorted(arr);

        System.out.println(result);
    }

    static boolean check_sorted(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }

        return true;
    }
}