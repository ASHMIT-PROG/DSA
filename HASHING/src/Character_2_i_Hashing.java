import java.util.Scanner;

public class Character_2_i_Hashing {

    // Global frequency array
    // Index 0 = a
    // Index 1 = b
    // Index 2 = c
    // ...
    // Index 25 = z
    static int[] hash = new int[26];

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input string
        String s = input.next();

        // Precompute frequency
        for (int i = 0; i < s.length(); i++) {

            char current = s.charAt(i);

            hash[current - 'a']++;
        }

        // Number of queries
        int q = input.nextInt();

        // Answer queries
        while (q-- > 0) {

            char character = input.next().charAt(0);

            // Fetch frequency
            System.out.println(hash[character - 'a']);
        }

        input.close();
    }
}