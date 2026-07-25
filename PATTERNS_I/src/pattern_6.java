// Class containing the pattern function
class Solution {

    // Function to print Pattern 6
    public void pattern_6(int N) {

        // ==========================
        // OUTER LOOP (Rows)
        // ==========================
        // Runs from i = 0 to i = N-1
        // Total rows = N
        for (int i = 0; i < N; i++) {

            // ==========================
            // INNER LOOP (Columns)
            // ==========================
            // j starts from N and decreases by 1 every iteration.
            // The loop runs until j > i.
            //
            // Number of iterations:
            // Row 1 -> 5 times
            // Row 2 -> 4 times
            // Row 3 -> 3 times
            // Row 4 -> 2 times
            // Row 5 -> 1 time
            for (int j = N; j > i; j--) {

                // ==========================
                // PRINTING THE NUMBER
                // ==========================
                //
                // j values are:
                // 5,4,3,2,1
                //
                // But we want to print:
                // 1,2,3,4,5
                //
                // Formula:
                // N - j + 1
                //
                // Example (N = 5):
                //
                // j = 5 -> 5-5+1 = 1
                // j = 4 -> 5-4+1 = 2
                // j = 3 -> 5-3+1 = 3
                // j = 2 -> 5-2+1 = 4
                // j = 1 -> 5-1+1 = 5

                System.out.print((N - j + 1) + " ");
            }

            // Move cursor to next line after one row
            System.out.println();
        }
    }
}

// Main class
public class pattern_6 {

    public static void main(String[] args) {

        // Create object of Solution class
        Solution sol = new Solution();

        // Size of the pattern
        int N = 5;

        // Call the pattern function
        sol.pattern_6(N);
    }
}