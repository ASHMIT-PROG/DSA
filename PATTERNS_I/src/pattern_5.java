public class pattern_5 {

    // Function to print the inverted star pattern
    static void pattern_5(int n) {

        // Outer loop controls the number of rows
        // i starts from 1 and runs till n-1
        for (int i = 1; i < n; i++) {

            // Inner loop prints stars in each row
            // Number of stars decreases as i increases
            // Formula: Stars = n - i + 1
            for (int j = 1; j < n - i +1; j++) {

                // Print one star
                System.out.print("*");
            }

            // Move to the next line after printing one row
            System.out.println();
        }
    }

    public static void main(String[] args) {

        // Call the pattern function
        pattern_5(5);
    }
}