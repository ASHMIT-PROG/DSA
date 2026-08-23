import java.util.Scanner;
// it basically count the frequency of elements
public class Basic_1_array {

    // Global / static frequency array
    // Index = number
    // Value = frequency of that number
    static int[] hash = new int[10_000_001];
// static ka purpose hai ki array class ko global access dena
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Step 1: Take size of array
        int n = sc.nextInt();

        // Step 2: Create input array
        int[] arr = new int[n];

        // Step 3: Take array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Step 4: Precompute frequency
        for (int i = 0; i < n; i++) {
            hash[arr[i]]++;
        }

        // Step 5: Take number of queries - mujhe 5 questions ans karne hai jo array ke hai
        int q = sc.nextInt();

        // Step 6: Answer every query
        while (q-- > 0) {
            // current query ka number
            int number = sc.nextInt();

            // Fetch frequency
            System.out.println(hash[number]);
        }

        sc.close();
    }
}