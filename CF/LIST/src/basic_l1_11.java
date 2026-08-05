import java.util.ArrayList;
import java.util.Scanner;
// count even number
public class basic_l1_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // count even numbers
        System.out.println("enter the size of the array");
        ArrayList<Integer>list = new ArrayList<>();
        int n = input.nextInt();
        for (int i =0;i<n;i++){
            list.add(input.nextInt());
        }
        int count = 0;
        for (int i = 0;i<list.size();i++){
            if (list.get(i)%2==0){
                count++ ;
            }
        }
        System.out.println("the numbers that are even"+count);






    }
}
