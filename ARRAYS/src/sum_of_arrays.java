import java.util.Scanner;

public class sum_of_arrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] arr = {1,2,34,432,24234};
        System.out.println(sum_of_array_elements(arr));
    }
    static int sum_of_array_elements(int [] num){
        int sum =0;// yaha pe mai sum=num[0] bhi le sakta tha aur mujhe pehle condition bhi lagani padti ki num.length!=0
        for (int i=0;i<=num.length-1;i++){// agar mai sum=num[0] leta toh i=1
            sum=sum+num[i];
        }
        return sum;
    }
}
