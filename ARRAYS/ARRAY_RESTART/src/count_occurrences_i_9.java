import java.util.Scanner;

public class count_occurrences_i_9 {

    public static void main(String[] args) {

        // Scanner object for taking input from user
        Scanner input = new Scanner(System.in);

        // Taking size of array
        System.out.println("Enter size of array:");
        int n = input.nextInt();

        // Creating array of size n
        int[] arr = new int[n];

        // Taking array elements as input
        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        // Stores the highest frequency found so far
        int maxCount = 0;

        // Stores the element having the highest frequency
        int mostRepeated = arr[0];

        // OUTER LOOP:
        // Picks one element at a time whose frequency we want to calculate
        for (int i = 0; i < arr.length; i++) {

            // Frequency of current element
            int count = 0;

            // INNER LOOP:
            // Traverses entire array and counts occurrences of arr[i]
            for (int j = 0; j < arr.length; j++) {

                // If current element matches another element,
                // increase frequency count
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            // If current element's frequency is greater than
            // the maximum frequency found so far
            if (count > maxCount) {

                // Update maximum frequency
                maxCount = count;

                // Update most repeated element
                mostRepeated = arr[i];
            }
        }

        // Display most frequent element
        System.out.println("Most repeated number = " + mostRepeated);

        // Display its frequency
        System.out.println("Frequency = " + maxCount);

        input.close();
    }
}