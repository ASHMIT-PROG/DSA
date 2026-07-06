import java.util.Scanner;

public class count_occurrences_i_9 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("Array must contain at least one element.");
            input.close();
            return;
        }

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        // Highest frequency found so far
        int maxCount = 0;

        // Largest number having maximum frequency
        int mostRepeated = arr[0];

        // Stores one other number having same maximum frequency
        int samfreq = -1;

        // Pick every element
        for (int i = 0; i < arr.length; i++) {

            // Fresh frequency counter
            int count = 0;

            // Calculate frequency of arr[i]
            for (int j = 0; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            // CASE 1:
            // Higher frequency found
            if (count > maxCount) {

                maxCount = count;
                mostRepeated = arr[i];

                // Previous tie is now invalid
                samfreq = -1;
            }

            // CASE 2:
            // Same maximum frequency
            // but different number
            else if (count == maxCount && arr[i] != mostRepeated) {

                // Current tied number is larger
                if (arr[i] > mostRepeated) {

                    // Old winner becomes same-frequency number
                    samfreq = mostRepeated;

                    // Larger number becomes winner
                    mostRepeated = arr[i];

                } else {

                    // Current number is smaller
                    samfreq = arr[i];
                }
            }
        }

        System.out.println("Most repeated number = " + mostRepeated);

        System.out.println("Frequency = " + maxCount);

        if (samfreq != -1) {

            System.out.println(
                    "Another number with same frequency = "
                            + samfreq
                            + " with count = "
                            + maxCount
            );

        } else {

            System.out.println(
                    "No other number has the same maximum frequency."
            );
        }

        input.close();
    }
}