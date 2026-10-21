import java.util.*;
public class sort_squared_array {
    public static ArrayList<Integer> sort(int [] nums){
        ArrayList<Integer>solve = new ArrayList<>(); // arraylist banaya

        for (int num:nums){
            solve.add(num);// array ko arraylist me convert kiya
        }

        for (int i=0;i<solve.size();i++){
            int value = solve.get(i);// list ko ek ek value li
            solve.set(i,(value*value)); // nati values dali on list

        }
        Collections.sort(solve);// sort kiya on the basis of new list

        return solve;
    }
    public static void main(String[] args) {
        int[] nums = {-5, 3, -8, 2, -1};

        ArrayList<Integer> result = sort(nums);// array ko arraylist me convert kiya

        int [] new_res = result.stream().mapToInt(Integer::intValue).toArray(); // arraylist ko array me kiya

        System.out.println(new_res.getClass().getSimpleName()); // datatype batata hai

        System.out.println(Arrays.toString(new_res)); // yaha pe mai agar array ko directly print karta toh hash value aaata
    }
}
