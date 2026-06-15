import java.util.Scanner;

public class max_element_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // array size declaration
        int n = input.nextInt();
        int[] arr = new int[n];
        int max_value = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (max_value > arr[i]) {
                arr[i] = max_value;
                System.out.println(max_value);
                i++;
            }
        }


    }
}




