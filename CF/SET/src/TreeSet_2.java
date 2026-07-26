import java.util.*;

public class TreeSet_2 {
    public static void main(String[] args) {

        // TreeSet stores UNIQUE elements
        // Elements are automatically stored in SORTED order

        TreeSet<Integer> set = new TreeSet<>();


        // ==========================
        // ADD
        // ==========================
        set.add(40);
        set.add(10);
        set.add(30);
        set.add(20);

        System.out.println("Set: " + set);
        // [10, 20, 30, 40]


        // ==========================
        // DUPLICATE
        // ==========================
        set.add(20); // duplicate, add nahi hoga

        System.out.println("After duplicate: " + set);


        // ==========================
        // CONTAINS
        // ==========================
        // Check karta hai element present hai ya nahi

        System.out.println(set.contains(30));   // true
        System.out.println(set.contains(100));  // false


        // ==========================
        // ADD ALL
        // ==========================
        // Dusre collection ke saare elements add karta hai

        TreeSet<Integer> set2 = new TreeSet<>();

        set2.add(30);
        set2.add(40);
        set2.add(50);
        set2.add(60);

        set.addAll(set2);

        System.out.println("After addAll: " + set);
        // [10, 20, 30, 40, 50, 60]


        // ==========================
        // CONTAINS ALL
        // ==========================
        // Check karta hai set2 ke saare elements
        // set mein present hain ya nahi

        System.out.println(set.containsAll(set2)); // true


        // ==========================
        // REMOVE
        // ==========================
        set.remove(20);

        System.out.println("After remove: " + set);


        // ==========================
        // REMOVE ALL
        // ==========================
        // Dusre collection ke elements ko remove karta hai

        TreeSet<Integer> removeSet = new TreeSet<>();

        removeSet.add(50);
        removeSet.add(60);

        set.removeAll(removeSet);

        System.out.println("After removeAll: " + set);


        // ==========================
        // RETAIN ALL
        // ==========================
        // Sirf common elements ko rakhta hai

        TreeSet<Integer> set3 = new TreeSet<>();

        set3.add(30);
        set3.add(40);
        set3.add(100);

        set.retainAll(set3);

        System.out.println("After retainAll: " + set);
        // [30, 40]


        // ==========================
        // HASH CODE
        // ==========================
        int hash = set.hashCode();

        System.out.println("HashCode: " + hash);


        // ==========================
        // SIZE
        // ==========================
        System.out.println("Size: " + set.size());


        // ==========================
        // EMPTY CHECK
        // ==========================
        System.out.println("Is Empty: " + set.isEmpty());


        // ==========================
        // FIRST
        // ==========================
        // Smallest element

        System.out.println("First: " + set.first());


        // ==========================
        // LAST
        // ==========================
        // Largest element

        System.out.println("Last: " + set.last());


        // ==========================
        // HIGHER
        // ==========================
        // Given value se strictly greater element

        System.out.println("Higher than 30: " + set.higher(30));


        // ==========================
        // LOWER
        // ==========================
        // Given value se strictly smaller element

        System.out.println("Lower than 40: " + set.lower(40));


        // ==========================
        // CEILING
        // ==========================
        // value >= given value

        System.out.println("Ceiling of 30: " + set.ceiling(30));


        // ==========================
        // FLOOR
        // ==========================
        // value <= given value

        System.out.println("Floor of 40: " + set.floor(40));


        // ==========================
        // LOOP
        // ==========================
        for (int value : set) {
            System.out.println(value);
        }


        // ==========================
        // CLEAR
        // ==========================
        set.clear();

        System.out.println("After clear: " + set);
    }
}