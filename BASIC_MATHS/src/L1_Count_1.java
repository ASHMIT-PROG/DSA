import java.util.Scanner;
// Count digits in a number
public class L1_Count_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number");
        int w = input.nextInt();
        int n=w;
        int count =0 ;
        while (n>0){
            int last_digit = n%10;
            count++;
            n = n/10;
        }
        System.out.println("the number of digits are"+count);
    }
}
