import java.util.Scanner;

public class count_occurances_ii_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter size of element");
        int n = input.nextInt();
        int [] arr = new int[n];

        System.out.println("enter your array");
        for (int i =0;i<n;i++){
            arr[i]= input.nextInt();
        }

        int maxcount = 0;
        int repeated_no = arr[0];

        for(int i=0;i<n;i++){
            int count = 0;
            for (int j=0;j<n;j++){
                if (arr[i]==arr[j]){
                    count++;
                }
            }
            if(count>maxcount){
                maxcount = count;
                repeated_no = arr[i];

            }   
        }
        System.out.println("maxcount"+maxcount);
        System.out.println("repeated number"+repeated_no);

    }
}
