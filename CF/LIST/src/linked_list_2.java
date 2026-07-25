import java.util.*;

public class linked_list_2 {
    public static void main(String[] args) {

        // Create LinkedList
        LinkedList<Integer> list = new LinkedList<>();

        // ==========================
        // ADD METHODS
        // ==========================

        // add(E element)
        // Adds an element at the end of the LinkedList.
        list.add(10);
        list.add(20);
        list.add(30);

        // add(int index, E element)
        // Inserts an element at the specified index.
        list.add(1, 15);

        // addFirst(E element)
        // Adds an element at the beginning of the list.
        list.addFirst(5);

        // addLast(E element)
        // Adds an element at the end of the list.
        list.addLast(40);

        // offer(E element)
        // Adds an element at the end (Queue method).
        list.offer(50);

        // offerFirst(E element)
        // Adds an element at the front of the list.
        list.offerFirst(1);

        // offerLast(E element)
        // Adds an element at the end of the list.
        list.offerLast(60);

        System.out.println("After Add Operations: " + list);
        // Output: After Add Operations: [1, 5, 10, 15, 20, 30, 40, 50, 60]

        // ==========================
        // GET METHODS
        // ==========================

        // get(int index)
        // Returns the element present at the given index.
        System.out.println("get(2): " + list.get(2));
        // Output: get(2): 10

        // getFirst()
        // Returns the first element without removing it.
        System.out.println("getFirst(): " + list.getFirst());
        // Output: getFirst(): 1

        // getLast()
        // Returns the last element without removing it.
        System.out.println("getLast(): " + list.getLast());
        // Output: getLast(): 60

        // peek()
        // Returns the first(head) element without removing it.
        // Returns null if the list is empty.
        System.out.println("peek(): " + list.peek());
        // Output: peek(): 1

        // peekFirst()
        // Returns the first element without removing it.
        System.out.println("peekFirst(): " + list.peekFirst());
        // Output: peekFirst(): 1

        // peekLast()
        // Returns the last element without removing it.
        System.out.println("peekLast(): " + list.peekLast());
        // Output: peekLast(): 60

        // ==========================
        // UPDATE METHOD
        // ==========================

        // set(int index, E element)
        // Replaces the element at the specified index with a new value.
        list.set(2, 100);

        System.out.println("After set(): " + list);
        // Output: After set(): [1, 5, 100, 15, 20, 30, 40, 50, 60]

        // ==========================
        // SEARCH METHODS
        // ==========================

        // contains(Object obj)
        // Checks whether the specified element exists in the list.
        System.out.println("contains(100): " + list.contains(100));
        // Output: contains(100): true

        // indexOf(Object obj)
        // Returns the index of the first occurrence of the element.
        // Returns -1 if the element is not found.
        System.out.println("indexOf(100): " + list.indexOf(100));
        // Output: indexOf(100): 2

        // lastIndexOf(Object obj)
        // Returns the index of the last occurrence of the element.
        // Returns -1 if the element is not found.
        System.out.println("lastIndexOf(100): " + list.lastIndexOf(100));
        // Output: lastIndexOf(100): 2

        // ==========================
        // SIZE & EMPTY
        // ==========================

        // size()
        // Returns the total number of elements in the LinkedList.
        System.out.println("Size: " + list.size());
        // Output: Size: 9

        // isEmpty()
        // Returns true if the list has no elements.
        System.out.println("isEmpty(): " + list.isEmpty());
        // Output: isEmpty(): false

        // ==========================
        // ITERATION
        // ==========================

        // Enhanced for loop
        // Traverses all elements one by one.
        System.out.print("For-each Loop: ");
        for (Integer num : list) {
            System.out.print(num + " ");
        }
        System.out.println();
        // Output: For-each Loop: 1 5 100 15 20 30 40 50 60

        // Using index
        // Access each element using get(index).
        System.out.print("Using Index: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        // Output: Using Index: 1 5 100 15 20 30 40 50 60

        // ==========================
        // TO ARRAY
        // ==========================

        // toArray()
        // Converts the LinkedList into an Object array.
        Object[] arr = list.toArray();

        System.out.println("Array: " + Arrays.toString(arr));
        // Output: Array: [1, 5, 100, 15, 20, 30, 40, 50, 60]

        // ==========================
        // ADD ALL
        // ==========================

        LinkedList<Integer> list2 = new LinkedList<>();

        list2.add(200);
        list2.add(300);

        // addAll(Collection c)
        // Adds all elements of another collection to the end of this list.
        list.addAll(list2);

        System.out.println("After addAll(): " + list);
        // Output: After addAll(): [1, 5, 100, 15, 20, 30, 40, 50, 60, 200, 300]

        // ==========================
        // EQUALS
        // ==========================

        // equals(Object obj)
        // Compares two LinkedLists.
        // Returns true if both lists contain the same elements in the same order.
        System.out.println("equals(list2): " + list.equals(list2));
        // Output: equals(list2): false

        // ==========================
        // STACK METHODS
        // ==========================

        // push(E element)
        // Pushes an element onto the front of the list (Stack operation).
        list.push(999);

        System.out.println("After push(): " + list);
        // Output: After push(): [999, 1, 5, 100, 15, 20, 30, 40, 50, 60, 200, 300]

        // pop()
        // Removes and returns the first element (Stack operation).
        System.out.println("pop(): " + list.pop());
        // Output: pop(): 999

        System.out.println("After pop(): " + list);
        // Output: After pop(): [1, 5, 100, 15, 20, 30, 40, 50, 60, 200, 300]

        // ==========================
        // REMOVE METHODS
        // ==========================

        // remove(int index)
        // Removes the element at the specified index.
        list.remove(0);

        // remove(Object obj)
        // Removes the first occurrence of the specified element.
        list.remove(Integer.valueOf(20));

        // removeFirst()
        // Removes the first element from the list.
        list.removeFirst();

        // removeLast()
        // Removes the last element from the list.
        list.removeLast();

        System.out.println("After remove(): " + list);
        // Output: After remove(): [100, 15, 30, 40, 50, 60, 200]

        // ==========================
        // QUEUE REMOVE METHODS
        // ==========================

        // poll()
        // Removes and returns the first element.
        // Returns null if the list is empty.
        System.out.println("poll(): " + list.poll());
        // Output: poll(): 100

        // pollFirst()
        // Removes and returns the first element.
        System.out.println("pollFirst(): " + list.pollFirst());
        // Output: pollFirst(): 15

        // pollLast()
        // Removes and returns the last element.
        System.out.println("pollLast(): " + list.pollLast());
        // Output: pollLast(): 200

        System.out.println("After poll(): " + list);
        // Output: After poll(): [30, 40, 50, 60]

        // ==========================
        // CLEAR
        // ==========================

        // clear()
        // Removes all elements from the LinkedList.
        list.clear();

        System.out.println("After clear(): " + list);
        // Output: After clear(): []

        System.out.println("isEmpty(): " + list.isEmpty());
        // Output: isEmpty(): true

        // ==========================
        // CLONE
        // ==========================

        // clone()
        // Creates a shallow copy of the LinkedList.
        // Note: Cloning IS possible because LinkedList implements Cloneable.

        LinkedList<Integer> cloneList = (LinkedList<Integer>) list.clone();

        System.out.println("Cloned List: " + cloneList);
        // Output: Cloned List: []
    }
}