import java.util.Queue;
import java.util.LinkedList;

public class QueuesProg{
    public static void main(String[] args) {
        
        Queue<String> queue = new LinkedList<>();

        // Add elements to the queue
        queue.add("Alice");
        queue.add("Bob");
        queue.add("Charlie");

        // Get the first element in the queue
        String firstElement = queue.peek();
        System.out.println("First element: " + firstElement);

        // Remove the first element from the queue
        String removedElement = queue.remove();
        System.out.println("Removed element: " + removedElement);

        // Get the size of the queue
        int size = queue.size();
        System.out.println("Size of queue: " + size);

        // Check if the queue contains a specific element
        boolean containsBob = queue.contains("Bob");
        System.out.println("Does queue contain Bob? " + containsBob);

        // Iterate over the elements in the queue
        System.out.print("Elements in queue: ");
        for (String element : queue) {
            System.out.print(element + " ");
        }
    }
}
