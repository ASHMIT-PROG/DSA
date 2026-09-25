import java.util.*;

public class replace_neg_to_abs {

    public static ArrayList<Integer> solve(int[] nums) {

    ArrayList <Integer> replace = new ArrayList<>();

    for (int num:nums){
        replace.add(num);
    }
    for (int i=0 ; i<replace.size();i++){
       int value =  replace.get(i);
       if (value<0){
           replace.set(i,-value);
       }

    }
    return replace;
    }

    public static void main(String[] args) {

        int[] nums = {-5, 3, -8, 2, -1};

        ArrayList<Integer> result = solve(nums);

        System.out.println(result);
    }
}