import java.util.Scanner;

public class ARRAYS_3__find_minimum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] arr = {1,2,3,4,5,6};
        System.out.println(find_minimum(arr));
    }
    static int find_minimum(int[]num){
        int min = num[0];
        for (int i=0;i<=num.length-1;i++){
            if (min>num[i]){
                min=num[i];
            }
        }
        return min;
    }
}
