import java.util.ArrayList;
import java.util.Scanner;

// Find maximum element
public class basic_l1_9 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int n = input.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Enter the elements:");

        for (int i = 0; i < n; i++) {
            list.add(input.nextInt());
        }

        int curr_element = list.get(0);

        for (int i = 1; i < list.size(); i++) {

            if (list.get(i) > curr_element) {
                curr_element = list.get(i);
            }
        }

        System.out.println("Maximum element = " + curr_element);
    }
}