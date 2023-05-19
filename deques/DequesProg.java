import java.util.Deque;
import java.util.ArrayDeque;

public class DequesProg{
    public static void main(String[] args) {

        Deque<Integer> deque = new ArrayDeque<>();

        // Add elements to the deque
        deque.addLast(1);
        deque.addLast(2);
        deque.addLast(3);

        // Get the first and last elements of the deque
        int firstElement = deque.peekFirst();
        int lastElement = deque.peekLast();
        System.out.println("First element: " + firstElement);
        System.out.println("Last element: " + lastElement);

        // Remove the first and last elements of the deque
        int removedFirstElement = deque.removeFirst();
        int removedLastElement = deque.removeLast();
        System.out.println("Removed first element: " + removedFirstElement);
        System.out.println("Removed last element: " + removedLastElement);

        // Add an element to the front and back of the deque
        deque.addFirst(0);
        deque.addLast(4);

        // Iterate over the elements in the deque
        System.out.print("Elements in deque: ");
        for (int element : deque) {
            System.out.print(element + " ");
        }
    }
}
