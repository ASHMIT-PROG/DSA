import java.util.*;

public class main_1 {

    public static void main(String[] args) {

        // Queue using LinkedList
        Queue<Integer> q = new LinkedList<>();

        // ---------------- offer() ----------------
        // Add element at the rear (Preferred over add())

        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offer(40);

        System.out.println(q);

        // ---------------- add() ----------------
        // Also adds element (Throws exception if insertion fails)

        q.add(50);

        System.out.println(q);

        // ---------------- peek() ----------------
        // View front element without removing

        System.out.println("Front : " + q.peek());

        // ---------------- element() ----------------
        // Returns front element
        // Throws exception if queue is empty

        System.out.println("Front : " + q.element());

        // ---------------- poll() ----------------
        // Remove front element
        // Returns null if queue is empty

        System.out.println("Removed : " + q.poll());

        System.out.println(q);

        // ---------------- remove() ----------------
        // Remove front element
        // Throws exception if queue is empty

        System.out.println("Removed : " + q.remove());

        System.out.println(q);

        // ---------------- size() ----------------
        // Returns total number of elements

        System.out.println("Size : " + q.size());

        // ---------------- contains() ----------------
        // Check whether element exists

        System.out.println(q.contains(40));

        // ---------------- isEmpty() ----------------
        // Check whether queue is empty

        System.out.println(q.isEmpty());

        // ---------------- iterator() ----------------
        // Traverse the queue

        Iterator<Integer> iterator = q.iterator();

        while (iterator.hasNext()) {
            System.out.println("Element : " + iterator.next());
        }

        // ---------------- toArray() ----------------
        // Convert Queue into Array

        Object[] arr = q.toArray();

        System.out.println(Arrays.toString(arr));

        // ---------------- addAll() ----------------
        // Add another collection

        Queue<Integer> q2 = new LinkedList<>();

        q2.offer(100);
        q2.offer(200);

        q.addAll(q2);

        System.out.println(q);

        // ---------------- removeAll() ----------------
        // Remove all matching elements

        q.removeAll(q2);

        System.out.println(q);

        // ---------------- clear() ----------------
        // Remove all elements

        q.clear();

        System.out.println(q);

        // ---------------- isEmpty() ----------------

        System.out.println(q.isEmpty());

    }
}