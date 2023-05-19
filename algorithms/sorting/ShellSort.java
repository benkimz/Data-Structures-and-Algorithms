public class ShellSort {
    
    public static void sort(int[] arr) {
        int n = arr.length;
        
        // Start with a large gap and reduce it in each iteration
        for (int gap = n/2; gap > 0; gap /= 2) {
            
            // Do insertion sort for elements at positions i and i+gap 
            for (int i = gap; i < n; i++) {
                int temp = arr[i];
                int j;
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) {
                    arr[j] = arr[j - gap];
                }
                arr[j] = temp;
            }
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
