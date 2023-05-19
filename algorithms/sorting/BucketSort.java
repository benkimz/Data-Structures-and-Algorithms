import java.util.*;

public class BucketSort {
    
    public static void sort(double[] arr) {
        int n = arr.length;

        // Create a list of buckets
        List<Double>[] buckets = new List[n];
        for (int i = 0; i < n; i++) {
            buckets[i] = new ArrayList<Double>(); 
        }

        // Assign elements to the appropriate bucket
        for (int i = 0; i < n; i++) {
            int bucketIndex = (int) (n * arr[i]);
            buckets[bucketIndex].add(arr[i]);
        }

        // Sort each bucket and concatenate the sorted buckets
        int index = 0;
        for (int i = 0; i < n; i++) {
            Collections.sort(buckets[i]);
            for (double element : buckets[i]) {
                arr[index++] = element;
            }
        }
    }

    public static void main(String[] args) {
        double[] arr = {0.4, 0.7, 0.1, 0.3, 0.9, 0.2, 0.8, 0.6, 0.5};
        sort(arr);
        for (double d : arr) {
            System.out.print(d + " ");
        }
    }
}
