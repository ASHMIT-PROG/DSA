import java.util.*;

public class array_dequeue_2 {

    public static void main(String[] args) {

        // Create ArrayDeque using Deque interface
        Deque<Integer> q = new ArrayDeque<>();

        // ---------------- offer() ----------------
        // Add element at the rear

        q.offer(10);
        q.offer(15);
        q.offer(36);
        q.offer(21);

        System.out.println(q); // [10, 15, 36, 21]


        // ---------------- offerFirst() ----------------
        // Add element at the front

        q.offerFirst(5);

        System.out.println(q); // [5, 10, 15, 36, 21]


        // ---------------- offerLast() ----------------
        // Add element at the rear

        q.offerLast(50);

        System.out.println(q); // [5, 10, 15, 36, 21, 50]


        // ---------------- peekFirst() ----------------
        // Access front element without removing

        System.out.println("Front : " + q.peekFirst()); // 5


        // ---------------- peekLast() ----------------
        // Access last element without removing

        System.out.println("Last : " + q.peekLast()); // 50


        // ---------------- peek() ----------------
        // Access front element without removing

        System.out.println("Front : " + q.peek()); // 5


        // ---------------- pollFirst() ----------------
        // Remove element from front

        System.out.println("Removed from front : " + q.pollFirst());

        System.out.println(q);


        // ---------------- pollLast() ----------------
        // Remove element from rear

        System.out.println("Removed from rear : " + q.pollLast());

        System.out.println(q);


        // ---------------- poll() ----------------
        // Remove front element

        System.out.println("Removed : " + q.poll());

        System.out.println(q);


        // ---------------- size() ----------------
        // Returns total number of elements

        System.out.println("Size : " + q.size());


        // ---------------- contains() ----------------
        // Check whether element exists

        System.out.println(q.contains(36));


        // ---------------- isEmpty() ----------------
        // Check whether deque is empty

        System.out.println(q.isEmpty());


        // ---------------- iterator() ----------------
        // Traverse from front to rear

        Iterator<Integer> iterator = q.iterator();

        while (iterator.hasNext()) {
            System.out.println("Element : " + iterator.next());
        }


        // ---------------- descendingIterator() ----------------
        // Traverse from rear to front

        Iterator<Integer> reverseIterator = q.descendingIterator();

        while (reverseIterator.hasNext()) {
            System.out.println("Reverse Element : " + reverseIterator.next());
        }


        // ---------------- toArray() ----------------
        // Convert Deque into Array

        Object[] arr = q.toArray();

        System.out.println(Arrays.toString(arr));


        // ---------------- clear() ----------------
        // Remove all elements

        q.clear();

        System.out.println(q); // []


        // Check after clear
        System.out.println("Is Empty : " + q.isEmpty()); // true
    }
}