import java.util.Scanner;

public class L1Q9__Count_Ocurrances {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter target: ");
        int target = input.nextInt();

        int[] arr = {1,2,2,3,4,5,6,6,7};

        int result = occurances(arr, target);

        System.out.println("Occurrences of " + target + " = " + result);
    }

    static int occurances(int[] num, int target) {

        int count = 0;

        for (int i = 0; i < num.length-1; i++) {
            if (num[i] == target) {
                count++;
            }
        }

        return count;
    }
}