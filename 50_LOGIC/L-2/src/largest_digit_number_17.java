public class largest_digit_number_17 {

    public static int largest(int n) {
        int digit;
        int max_digit = 0;

        while (n > 0) {
            digit = n % 10;

            if (digit > max_digit) {
                max_digit = digit;
            }

            n = n / 10;
        }

        return max_digit;
    }

    public static void main(String[] args) {
        System.out.println(largest(3543));
    }
}