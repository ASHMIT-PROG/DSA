import java.util.Scanner;

public class count_consequitive_max_occurances_i_10 {

    public static void main(String[] args) {

        // Taking input from user
        Scanner input = new Scanner(System.in);

        // Taking size of array
        System.out.println("Enter size of array:");
        int n = input.nextInt();

        // Creating array
        int[] arr = new int[n];

        // Taking array elements
        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        // Current consecutive count
        int count = 1;

        // Maximum consecutive count found so far
        int maxCount = 1;

        // Number having maximum consecutive occurrences
        int mostRepeated = arr[0];

        // Start from index 1 because we compare with previous element
        for (int i = 1; i < arr.length; i++) {

            // If current element is same as previous element
            if (arr[i] == arr[i - 1]) {

                // Increase current streak length
                count++;

                // If current streak becomes the largest streak
                if (count > maxCount) {

                    // Update maximum streak length
                    maxCount = count;

                    // Store the number responsible for this streak
                    mostRepeated = arr[i];
                }

            } else {

                // Sequence broken
                // Start counting new streak from 1
                count = 1;
            }
        }

        // Display result
        System.out.println("Number = " + mostRepeated);
        System.out.println("Consecutive Count = " + maxCount);

        input.close();
    }
}