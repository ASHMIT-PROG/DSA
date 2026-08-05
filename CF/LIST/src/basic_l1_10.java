import java.util.ArrayList;
import java.util.Scanner;

public class basic_l1_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // find the minimum number
        int n = input.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(input.nextInt());
        }
        int curr_nu = list.get(0);
        for (int i = 0; i < list.size(); i++) {

                if (curr_nu>list.get(i)){
                    curr_nu = list.get(i);
                }




        }
        System.out.println(curr_nu);
    }
}
