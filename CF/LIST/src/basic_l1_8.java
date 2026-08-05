import java.util.ArrayList;
import java.util.Scanner;
// Find the sum of all elements.
public class basic_l1_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum=0;
        ArrayList<Integer>list = new ArrayList<>();
        System.out.println("enter the size of the array");
        int n = input.nextInt();
        System.out.println("enter the elements of the array");
        for (int i = 0;i<n;i++){
            list.add(input.nextInt());

        }
        System.out.println(list);
        for (int i=0;i<list.size();i++){
            sum = sum+list.get(i);
        }
        System.out.println(sum);


    }
}
