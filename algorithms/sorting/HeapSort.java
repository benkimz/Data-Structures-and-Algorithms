public class HeapSort {
    
    public static void sort(int[] arr) {
        int n = arr.length;

        // Build the heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // Extract elements from the heap in decreasing order
        for (int i = n - 1; i >= 0; i--) {
            // Move the root element to the end of the array 
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Re-heapify the heap with reduced size
            heapify(arr, i, 0);
        }
    }

    // Heapify the subtree rooted at index i
    private static void heapify(int[] arr, int n, int i) {
        int largest = i; // Initialize largest as root
        int left = 2 * i + 1; // Left child index
        int right = 2 * i + 2; // Right child index

        // If left child is larger than root
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        // If right child is larger than largest so far
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        // If largest is not root
        if (largest != i) {
            // Swap root with largest element
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 1, 9, 3, 7, 4, 8, 6, 2};
        sort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
