import java.util.*;

public class array_list_methods_cf_1 {

    public static void main(String[] args) {

        // Create an ArrayList
        ArrayList<Integer> list = new ArrayList<>();

        // add() -> Add element at the end
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list); // [10, 20, 30]

        list.add(40);
        System.out.println(list);

        // remove(index) -> Remove element at given index
        list.remove(0);
        System.out.println(list);

        // ---------------- addAll() ----------------
        // Add all elements of another collection

        List<Integer> list2 = new ArrayList<>();

        list2.add(101);
        list2.add(102);

        list.addAll(list2);

        System.out.println(list); // [20, 30, 40, 101, 102]

        // ---------------- removeAll() ----------------
        // Remove all elements present in another collection

        list.removeAll(list2);

        System.out.println(list); // [20, 30, 40]

        // ---------------- size() ----------------
        // Returns total number of elements

        System.out.println(list.size());

        // ---------------- clear() ----------------
        // Remove all elements

        System.out.println("Before clear : " + list2);

        list2.clear();

        System.out.println("After clear  : " + list2);

        // ---------------- iterator() ----------------
        // Used to traverse any collection

        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()) {
            System.out.println("Element : " + iterator.next());
        }

        // ---------------- get() ----------------
        // Get element using index

        List<Integer> list3 = new ArrayList<>();

        list3.add(11);
        list3.add(12);
        list3.add(26);

        System.out.println(list3.get(1));

        // ---------------- set() ----------------
        // Replace element at given index

        list3.set(0, 100);

        System.out.println(list3);

        // ---------------- toArray() ----------------
        // Convert List into Array

        Object[] arr = list3.toArray();

        System.out.println(Arrays.toString(arr));

        // ---------------- contains() ----------------
        // Check whether element exists

        System.out.println(list3.contains(220));

        // ---------------- sort() ----------------
        // Sort in ascending order

        list3.add(232);
        list3.add(653521);
        list3.add(23);

        Collections.sort(list3);

        System.out.println("Ascending : " + list3);

        // ---------------- reverseOrder() ----------------
        // Sort in descending order

        Collections.sort(list3, Collections.reverseOrder());

        System.out.println("Descending : " + list3);

        // ---------------- clone() ----------------
        // Creates a shallow copy

        ArrayList<Integer> newList = (ArrayList<Integer>) list.clone();

        System.out.println(newList);

        // ---------------- ensureCapacity() ----------------
        // Increase internal capacity (performance optimization)

        ArrayList<Integer> marks = new ArrayList<>();

        marks.ensureCapacity(100);

        // ---------------- isEmpty() ----------------
        // Returns true if list has no elements

        System.out.println(list3.isEmpty());

        // ---------------- indexOf() ----------------
        // Returns first index of element, -1 if not found

        System.out.println(list3.indexOf(23));
        // --------------LINKED LIST ---------------------



















    }
}