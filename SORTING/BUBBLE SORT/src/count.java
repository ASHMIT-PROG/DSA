import java.util.Scanner;
import java.util.Arrays;

public class count {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = {1, 2, 33, 44, 1, 4};

        count(arr);

        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    static void count(int[] num) {
        int count = 0;

        for (int i = 0; i < num.length - 1; i++) {
            boolean swapping = false;

            for (int j = 0; j < num.length - i - 1; j++) {
                if (num[j] > num[j + 1]) {
                    // swap
                    int temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;

                    count++;
                    swapping = true;
                }
            }

            // agar ek bhi swap nahi hua → already sorted
            if (!swapping) {
                break;
            }
        }

        System.out.println("Total swaps: " + count);
    }
}