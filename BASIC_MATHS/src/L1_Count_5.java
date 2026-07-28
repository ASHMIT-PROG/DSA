import java.util.Scanner;
// Count a specific digit target number
public class L1_Count_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number");
        int w = input.nextInt();
        int n = w;
        System.out.println("enter the target ");
        int target = input.nextInt();
        int count = 0 ;
        while (n>0){//jab tak number me digits bachi hui hai loop chalega
            int last_digit = n%10;
            if (last_digit== target){
                count++;// counter variable ko bashao agar condition satisfy ho gaya ho
            }
            n=n/10;
        }
        System.out.println(count);


    }
}
