public class L1Q8__Check_if_array_is_sorted {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7};
        System.out.println(check_sorting(arr));    }
    static String check_sorting(int[]num){
        boolean isAsc = true;
        boolean isDesc = true;
        for (int i= 0 ;i< num.length-1;i++){// agar mai yaha pe i<= num.length laga du toh error ayega yuki mai i+1 ko bhi le raha hoon
            if (num[i]<num[i+1]){
                isDesc = false;
            }
            if (num[i]>num[i+1]){
                isAsc=false;
            }

        }
        if (isAsc)return "Ascending";
        if (isDesc)return "Descending";
        else {
            return "not sorted";
        }
    }
}
