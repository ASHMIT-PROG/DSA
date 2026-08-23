import java.util.Scanner;

public class Character_2_ii_Hashing {

    // 256 possible ASCII characters
    // Index = ASCII value
    // Value = frequency
    static int[] hash = new int[256];

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input string
        String s = input.next();

        // Precompute frequency
        for (int i = 0; i < s.length(); i++) {

            char current = s.charAt(i);

            hash[current]++;
        }

        // Number of queries
        int q = input.nextInt();

        // Answer queries
        while (q-- > 0) {

            char character = input.next().charAt(0);

            // Fetch frequency
            System.out.println(hash[character]);
        }

        input.close();
    }
}