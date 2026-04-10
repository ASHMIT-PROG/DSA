public class SMALLEST_ELEMENT_3 {
    public static void main(String[] args) {
        int [] arr = {-1,2,3,4,5,6,7};
        smallest(arr);
    }
    static int smallest (int [] num){
         int smallest_element = Integer.MAX_VALUE;
        for (int i=0;i<=num.length-1;i++){
            if (num[i]<smallest_element){
                smallest_element=num[i];
            }
        }
        System.out.println(smallest_element);
        return smallest_element;
    }
}
