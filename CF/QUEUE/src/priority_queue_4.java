import java.util.*;

public class priority_queue_4 {
// (BY DEFAULT)SMALLEST VALUE -> MORE PRIORITY (INTEGER)
    public static void main(String[] args) {

        // Create PriorityQueue
        // By default smallest element gets highest priority
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Add elements
        pq.offer(30);
        pq.offer(10);
        pq.offer(50);
        pq.offer(20);
        pq.offer(5);

        System.out.println(pq);

        // Access highest priority element
        // For Integer -> smallest element
        System.out.println("Top : " + pq.peek());

        // Remove highest priority element
        System.out.println("Removed : " + pq.poll());

        // New smallest element becomes top
        System.out.println("New Top : " + pq.peek());
    }
}