import java.util.*;

public class vector_3 {

    public static void main(String[] args) {

        // Create a Vector
        Vector<Integer> vector = new Vector<>();

        // ---------------- add() ----------------
        // Add element at the end

        vector.add(10);
        vector.add(20);
        vector.add(30);

        System.out.println(vector); // [10, 20, 30]

        vector.add(40);
        System.out.println(vector);

        // ---------------- remove() ----------------
        // Remove element at given index

        vector.remove(0);

        System.out.println(vector); // [20, 30, 40]

        // ---------------- addAll() ----------------
        // Add all elements of another collection

        Vector<Integer> vector2 = new Vector<>();

        vector2.add(101);
        vector2.add(102);

        vector.addAll(vector2);

        System.out.println(vector); // [20, 30, 40, 101, 102]

        // ---------------- removeAll() ----------------
        // Remove all matching elements

        vector.removeAll(vector2);

        System.out.println(vector); // [20, 30, 40]

        // ---------------- size() ----------------
        // Returns total number of elements

        System.out.println(vector.size());

        // ---------------- clear() ----------------
        // Remove all elements

        System.out.println("Before clear : " + vector2);

        vector2.clear();

        System.out.println("After clear  : " + vector2);

        // ---------------- iterator() ----------------
        // Traverse the Vector

        Iterator<Integer> iterator = vector.iterator();

        while (iterator.hasNext()) {
            System.out.println("Element : " + iterator.next());
        }

        // ---------------- get() ----------------
        // Access element using index

        Vector<Integer> vector3 = new Vector<>();

        vector3.add(11);
        vector3.add(12);
        vector3.add(26);

        System.out.println(vector3.get(1));

        // ---------------- set() ----------------
        // Replace element at given index

        vector3.set(0, 100);

        System.out.println(vector3);

        // ---------------- toArray() ----------------
        // Convert Vector into Array

        Object[] arr = vector3.toArray();

        System.out.println(Arrays.toString(arr));

        // ---------------- contains() ----------------
        // Check whether element exists

        System.out.println(vector3.contains(220));

        // ---------------- sort() ----------------
        // Sort in ascending order

        vector3.add(232);
        vector3.add(653521);
        vector3.add(23);

        Collections.sort(vector3);

        System.out.println("Ascending : " + vector3);

        // ---------------- reverseOrder() ----------------
        // Sort in descending order

        Collections.sort(vector3, Collections.reverseOrder());

        System.out.println("Descending : " + vector3);

        // ---------------- clone() ----------------
        // Creates a shallow copy

        Vector<Integer> newVector = (Vector<Integer>) vector.clone();

        System.out.println(newVector);

        // ---------------- ensureCapacity() ----------------
        // Increase internal capacity

        Vector<Integer> marks = new Vector<>();

        marks.ensureCapacity(100);

        // ---------------- isEmpty() ----------------
        // Returns true if Vector is empty

        System.out.println(vector3.isEmpty());

        // ---------------- indexOf() ----------------
        // Returns first index of element

        System.out.println(vector3.indexOf(23));

        // ---------------- firstElement() ----------------
        // Returns first element

        System.out.println(vector3.firstElement());

        // ---------------- lastElement() ----------------
        // Returns last element

        System.out.println(vector3.lastElement());

        // ---------------- capacity() ----------------
        // Returns current capacity

        System.out.println("Capacity : " + marks.capacity());

        // ---------------- setSize() ----------------
        // Changes the size of Vector

        marks.setSize(5);

        System.out.println(marks);

    }
}