public class second_smallest_element_4 {
    public static void main(String[] args) {
        int [] arr ={1,2,3,4,5,6};
        second_smallest(arr);
    }
    static int second_smallest(int [] num){
        int smallest = Integer.MAX_VALUE;
        int second_smallest = Integer.MAX_VALUE;
        for (int i=0;i<=num.length-1;i++){
        if (num[i]<smallest){
            second_smallest=smallest;
            smallest=num[i];
        }
        else if(num[i]>smallest&&num[i]<second_smallest){// smallest se bada aur second smallest se chota
            second_smallest=num[i];
            second_smallest = smallest;
        }

        }
        if (second_smallest==Integer.MIN_VALUE){
            return -1;
        }
        System.out.println(second_smallest);
        return second_smallest;
    }
}
