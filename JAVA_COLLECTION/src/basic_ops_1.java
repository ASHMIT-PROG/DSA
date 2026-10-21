import java.util.*;

public class basic_ops_1 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        // Add elements
      for (int i = 10;i<=50;i++){
          list.add(i);
      }

        // Insert
        list.add(2, 100);

        // Update
        list.set(3, 200);

        // Search
        System.out.println("Contains 40: " + list.contains(40));
        System.out.println("Index of 30: " + list.indexOf(30));

        // Remove
        list.remove(1);

        // Size
        System.out.println("Size: " + list.size());

        // Print ArrayList
        System.out.println("Final List: " + list);
    }
}