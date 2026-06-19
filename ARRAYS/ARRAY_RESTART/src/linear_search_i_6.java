import java.util.Scanner;

public class linear_search_i_6 {

    static int linearSearch(int[] arr, int target) {

        for(int i = 0; i < arr.length; i++) {

            if(arr[i] == target) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter size:");
        int n = input.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        for(int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        System.out.println("Enter target:");
        int target = input.nextInt();

        int result = linearSearch(arr, target);

        if(result != -1) {
            System.out.println("Element found at index " + result);
        }
        else {
            System.out.println("Element not found");
        }

        input.close();
    }
}