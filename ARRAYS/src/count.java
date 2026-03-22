import java.util.Arrays;

public class count {
    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 6, 7, 8};

        bubble(arr); // sort

        System.out.println(Arrays.toString(arr)); // print
    }

    static void bubble(int[] num) {
        boolean swapping;

        for (int i = 0; i < num.length - 1; i++) {
            swapping = false; // agar array pehle se sorted hai

            for (int j = 0; j < num.length - i - 1; j++) {
                if (num[j] > num[j + 1]) {// condition for swapping
                    int temp = num[j];// swapping
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                    swapping = true; // agar array pehle se sorted nahi hai toh
                }
            }

            // agar ek bhi swap nahi hua → already sorted
            if (!swapping) { // matlab agar sapping false hai toh if condition true hai and then the loop will break
                break;
            }
        }
    }
}
