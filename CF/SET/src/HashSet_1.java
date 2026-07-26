import java.util.*;

public class HashSet_1 {

    // HashSet is used to store unique values

    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();

        // ==========================
        // ADD
        // ==========================
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);

        System.out.println("Set: " + set);


        // ==========================
        // DUPLICATE
        // ==========================
        set.add(20); // duplicate, add nahi hoga

        System.out.println("After duplicate: " + set);


        // ==========================
        // CONTAINS
        // ==========================
        // Check karta hai ek particular element present hai ya nahi

        System.out.println(set.contains(30));   // true
        System.out.println(set.contains(100));  // false


        // ==========================
        // ADD ALL
        // ==========================
        // Dusre collection ke saare elements set me add karta hai

        HashSet<Integer> set2 = new HashSet<>();

        set2.add(30);
        set2.add(40);
        set2.add(50);
        set2.add(60);

        set.addAll(set2);

        System.out.println("After addAll: " + set);


        // ==========================
        // CONTAINS ALL
        // ==========================
        // Check karta hai set2 ke SAARE elements set me present hain ya nahi

        System.out.println(set.containsAll(set2)); // true


        // ==========================
        // RETAIN ALL
        // ==========================
        // Sirf common elements ko rakhta hai
        // Baaki elements remove kar deta hai

        HashSet<Integer> set3 = new HashSet<>();

        set3.add(30);
        set3.add(40);
        set3.add(100);

        set.retainAll(set3);

        System.out.println("After retainAll: " + set);


        // ==========================
        // HASH CODE
        // ==========================
        // Set ka hash code return karta hai

        int hash = set.hashCode();

        System.out.println("HashCode: " + hash);


        // ==========================
        // REMOVE
        // ==========================
        set.remove(30);

        System.out.println("After remove: " + set);


        // ==========================
        // SIZE
        // ==========================
        System.out.println("Size: " + set.size());


        // ==========================
        // EMPTY CHECK
        // ==========================
        System.out.println("Is Empty: " + set.isEmpty());


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