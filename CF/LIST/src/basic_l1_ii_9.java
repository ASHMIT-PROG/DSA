import java.util.ArrayList;
import java.util.Scanner;

public class basic_l1_ii_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // find max element
        System.out.println("enter the size of array");
        int n = input.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("enter the elements ");

        for (int i = 0;i<n;i++){
            list.add(input.nextInt());
        }
        int curr_element = list.get(0);


        for (int i = 0;i< list.size();i++){
            if (list.get(i)>curr_element){
                curr_element = list.get(i);

            }

        }
        System.out.println(curr_element);





    }
}
