import java.util.*;

public class sep_even_odd {

    public static void solve(int[] nums) {

        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        for (int num : nums) {

            if (num % 2 == 0) {
                even.add(num);
            } else {
                odd.add(num);
            }
        }

        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }

    public static void main(String[] args) {

        int[] nums = {-4, -1, 0, 3, 10};

        solve(nums);
    }
}