import java.util.Scanner;

public class L0_Count_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int count = 0;
        for (int i =0;i<n;i++){
            if (i%2!=0){
                System.out.println(i);
                count++;
            }
        }
        System.out.println(count);
    }
}
