public class QuickSort{

    public static void main(String args[]){

        // An example array of integers to sort
        int data[] = {5, 9, 31, 45, 23, 17, 15, 52, 38, 20, 2, 78, 22, 3};

        // Sorting with the algorithm 
        int sortedData[] = quickSort(data);

        // Printing the output
        for(int num: sortedData){
            System.out.print("\t" + num + "\n");
        }
    }

    public static int[] quickSort(int[] arr){
        if (arr == null || arr.length == 0) {
            return arr;
        }
        
        return quickSortHelperMethod(arr, 0, arr.length - 1);
    }

    public static int[] quickSortHelperMethod(int[] arr, int start_point, int end_point) {
        if (start_point < end_point) {
            int pivot = partition(arr, start_point, end_point);

            quickSortHelperMethod(arr, start_point, pivot - 1);
            quickSortHelperMethod(arr, pivot + 1, end_point);
        }

        return arr;
    }

    public static int partition(int[] arr, int start_point, int end_point) {
        int pivot = arr[end_point];
        int i = start_point - 1;

        for (int j = start_point; j < end_point; j++) {
            if (arr[j] < pivot) {
                i++;
                int tmp_var = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp_var;
            }
        }

        int tmp_var = arr[i + 1];
        arr[i + 1] = arr[end_point];
        arr[end_point] = tmp_var;

        return i + 1;
    }
}