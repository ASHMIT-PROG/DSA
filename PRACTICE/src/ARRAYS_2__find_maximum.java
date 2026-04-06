import java.util.Scanner;

public class ARRAYS_2__find_maximum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] num = {1,2,3,4,5,6};
        System.out.println(find_max(num));
    }
    static int find_max(int [] arr){
        int max = arr[0];
        for (int i=0;i<=arr.length-1;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
