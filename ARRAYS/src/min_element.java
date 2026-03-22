import java.util.Scanner;

public class min_element {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] arr = {1,2,3,4,5};
        System.out.println(min(arr));
    }
    static int min(int [] num){
        int min = num[0];
        for (int i =0;i<=num.length-1;i++){
            if (num[i]<min){
                min=num[i];
            }
        }
        return min;
    }
}

