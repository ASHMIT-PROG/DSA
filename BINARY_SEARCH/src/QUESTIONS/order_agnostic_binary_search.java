package QUESTIONS;

import java.util.Scanner;

public class order_agnostic_binary_search {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int target = input.nextInt();

        int[] arr = {2, 3, 4, 5, 6, 7};

        System.out.println(search(arr, target));
    }

    static int search(int[] num, int target) {

        int start = 0;
        int end = num.length - 1;

        boolean isasc = num[start] < num[end];

        while (start <= end) {

            int mid_index = start + (end - start) / 2;

            if (num[mid_index] == target) {
                return mid_index;
            }

            if (isasc) {  // ascending

                if (target < num[mid_index]) {
                    end = mid_index - 1; // left jana hai
                } else {
                    start = mid_index + 1; // right jana hai
                }
            }

            else { // descending

                if (target > num[mid_index]) {
                    end = mid_index - 1; // left
                } else {
                    start = mid_index + 1;// right
                }
            }
        }

        return -1;
    }
}