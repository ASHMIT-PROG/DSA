import java.util.ArrayList;
import java.util.Scanner;

public class basic_l1_7 {
    public static void main(String[] args) {
// reverse a list
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the array size:");
        int n = input.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            list.add(input.nextInt());
        }

        System.out.println("Before reverse: " + list);

        ArrayList<Integer> reverseList = new ArrayList<>();

        for (int i = list.size() - 1; i >= 0; i--) {
            reverseList.add(list.get(i));
        }

        System.out.println("After reverse: " + reverseList);
    }
}