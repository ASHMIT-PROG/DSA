import java.util.Arrays;

public class L1Q10__Copy_Array {
    public static void main(String[] args) {
            int []arr1 = {1,2,3,4,5,6};
            int [] arr2 = new int[arr1.length];// arr1 length ka ek arr 2 bana dega and arr2={0,0,0,0,0,0}
        for (int i=0;i<=arr1.length-1;i++){
            arr2[i]=arr1[i];
        }
        System.out.println(Arrays.toString(arr1));// arrays ko string me convert krr deta hai
        System.out.println(Arrays.toString(arr2));
    }
}
