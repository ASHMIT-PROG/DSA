import java.util.Scanner;

public class max_element {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] arr = {1,2,3,4,5};
        System.out.println(max(arr));
    }
    static int max(int [] num){
        int max = num[0];
        for (int i =0;i<=num.length-1;i++){
            if (num[i]>max){
                max=num[i];
            }
        }
        return max;
    }
}
