import java.util.Arrays;

public class BubbleSortPasses {
    public static void main(String[] args) {

        int[] arr = {5, 3, 1, 4};

        int n = arr.length;
        int passes = 0;

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            passes++;

            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }

            // optimization (early stop)
            if (!swapped) {
                break;
            }
        }

        System.out.println("Sorted Array: " + Arrays.toString(arr));
        System.out.println("Passes needed: " + passes);
    }
}