public class LARGEST_ELEMENT_1 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7};
        find_largest(arr);
    }
    static int find_largest(int[]num){
        int largest_element = Integer.MIN_VALUE;//-infinite
        for (int i=0;i<=num.length-1;i++){
            if (num[i]>largest_element){
                largest_element=num[i];
            }
        }
        if (largest_element==Integer.MIN_VALUE){// this is to avoid duplicate characters
            return -1;
        }
        System.out.println("largest element"+largest_element);
        return largest_element;
    }
}