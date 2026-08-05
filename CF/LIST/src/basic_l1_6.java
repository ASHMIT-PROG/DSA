import java.util.*;

public class basic_l1_6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("enter the numbers to add");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        if (list.size() <= 0) {
            System.out.println(0);
            return;
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}