public class L1Q5__count_even_numbers {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(counteven(arr));
    }

    static int counteven(int[] num) {
        if (num.length == 0) {
            return -1;
        }

        int count = 0;

        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                count++;// count = count + 1;
                System.out.println("EVEN NUMBER"+num[i]+"NUMBER"+count);
            }
        }

        return count;
    }
}