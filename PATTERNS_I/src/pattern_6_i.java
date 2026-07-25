import java.util.Scanner;

public class pattern_6_i {

    // Function to print Pattern 6
    public void pattern6(int n) {

        // ==========================================
        // OUTER LOOP -> Controls the ROWS
        // ==========================================
        // i starts from 1 and goes till (n-1)
        //
        // Example (n = 5):
        // i = 1
        // i = 2
        // i = 3
        // i = 4
        //
        // Total rows printed = n - 1
        for (int i = 1; i < n; i++) {

            // ==========================================
            // INNER LOOP -> Controls the COLUMNS
            // ==========================================
            //
            // j starts from n and decreases by 1
            //
            // Condition:
            // Continue looping while j > i
            //
            // Number of iterations:
            //
            // i = 1  -> j = 5,4,3,2  -> 4 iterations
            // i = 2  -> j = 5,4,3    -> 3 iterations
            // i = 3  -> j = 5,4      -> 2 iterations
            // i = 4  -> j = 5        -> 1 iteration
            //
            // Therefore, every new row prints one less number.
            for (int j = n; j > i; j--) {

                // ==========================================
                // PRINTING THE VALUE
                // ==========================================
                //
                // Current j values:
                // 5 4 3 2
                //
                // But we want to print:
                // 1 2 3 4
                //
                // Formula:
                // n - j + 1
                //
                // Example (n = 5):
                //
                // j = 5  -> 5-5+1 = 1
                // j = 4  -> 5-4+1 = 2
                // j = 3  -> 5-3+1 = 3
                // j = 2  -> 5-2+1 = 4
                //
                // So although j is decreasing,
                // the printed numbers are increasing.

                System.out.print(n - j + 1);
            }

            // After one row is completed,
            // move the cursor to the next line.
            System.out.println();
        }
    }

    public static void main(String[] args) {

        // Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Create object because pattern6() is a non-static method
        pattern_6_i patt = new pattern_6_i();

        // Ask the user for the size of the pattern
        System.out.print("Enter the value of n: ");
        int n = input.nextInt();

        // Call the pattern function
        patt.pattern6(n);

        // Close the Scanner
        input.close();
    }
}