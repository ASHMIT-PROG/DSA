package QUESTIONS;

public class count_occurances {

    public static void main(String[] args) {

        int[] arr = {1,2,2,2,3};
        int target = 2;

        int first = search(arr, target, true);
        int last = search(arr, target, false);

        if (first == -1) {
            System.out.println("Count: 0");
        } else {
            System.out.println("Count: " + (last - first + 1));
        }
    }

    static int search(int[] arr, int target, boolean findFirst) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                ans = mid;

                if (findFirst) {
                    end = mid - 1; // left me jao
                } else {
                    start = mid + 1; // right me jao
                }
            }
        }
        return ans;
    }
}