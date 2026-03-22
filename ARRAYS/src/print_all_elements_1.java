import java.util.Scanner;

public class print_all_elements_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [] arr= {1,2,3,4};
        print_all_elements(arr);
    }
    static void print_all_elements(int[]num){
        if (num.length==0){
            System.out.println("array is empty");
            return;
        }
        else {
            for (int i=0;i<=num.length-1;i++){
                System.out.println(num[i]);
            }
        }
    }
}