public class QuickSort {

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);

            // pivotun solu
            quickSort(arr, low, pivotIndex - 1);

            // pivotun sağı
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];      // pivot = ilk eleman
        int swapIndex = low;

        for (int i = low + 1; i <= high; i++) {
            if (arr[i] < pivot) {
                swapIndex++;
                swap(arr, i, swapIndex);
            }
        }
        

        // pivotu doğru yerine koy
        swap(arr, low, swapIndex);

        return swapIndex; // pivotun yeni yeri
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Test
    public static void main(String[] args) {
        int[] arr = {15, 89, 35, 14, 24, 5, 37, 13, 20, 7, 70};

        quickSort(arr, 0, arr.length - 1);

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}