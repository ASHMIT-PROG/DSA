import java.awt.image.RasterOp;

public class FIND_SECOND_LARGEST_ELEMENT_1 {
    public static void main(String[] args) {
        int [] arr ={1,2,3,4,5,6};
        largest_secondlargest(arr);
    }
    static int largest_secondlargest(int[]num){
        int largest_element= Integer.MIN_VALUE;
        int second_largest_element=Integer.MIN_VALUE;
        for (int i=0;i<=num.length-1;i++){
            if (num[i]>largest_element){
                second_largest_element = largest_element;
                largest_element=num[i];
            }
            else if (largest_element>num[i]&&second_largest_element<num[i]) {
                second_largest_element = num[i];
            }


        }
        if (second_largest_element==Integer.MIN_VALUE){// avoiding duplicate values or single values
            return -1;
        }
        System.out.println("largest element"+largest_element);
        System.out.println("second largest element"+second_largest_element);
        return -1;
    }
}
