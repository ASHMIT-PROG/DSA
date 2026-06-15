import java.util.Scanner;

public class max_element_ii_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the size of number of elements");
        int n = input.nextInt();
        int max = Integer.MIN_VALUE;
        if(n<=0){
            System.out.println("array is empty");
            return;
        }
        System.out.println("enter the elements");
        for (int i = 0 ;i<n;i++){
            int current_element = input.nextInt();
            max = Math.max(max,current_element);

        }

        System.out.println(max);
            input.close();
    }
}
