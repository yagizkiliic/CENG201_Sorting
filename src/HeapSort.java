public class HeapSort {

    private int[] heap;
    private int size;
    private int capacity;

    public HeapSort(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.heap = new int[capacity + 1];
    }

    // (Insertion)
    public void insert(int value) {
        if (size >= capacity) return;

        size++;
        heap[size] = value;

        int i = size;
        while (i > 1 && heap[i] < heap[i / 2]) {
            swap(i, i / 2);
            i = i / 2;
        }
    }


    public int deleteMin() {
        if (size == 0) return -1;

        int min = heap[1];
        heap[1] = heap[size];
        size--;

        heapify(1);
        return min;
    }

    //  (Heapify)
    private void heapify(int i) {
        int left = 2 * i;
        int right = 2 * i + 1;
        int smallest = i;

        if (left <= size && heap[left] < heap[smallest]) {
            smallest = left;
        }
        if (right <= size && heap[right] < heap[smallest]) {
            smallest = right;
        }

        if (smallest != i) {
            swap(i, smallest);
            heapify(smallest);
        }
    }

    //HEAP SORT

    public void buildHeap(int[] array) {
        this.size = array.length;
        for (int i = 0; i < array.length; i++) {
            heap[i + 1] = array[i];
        }

        for (int i = size / 2; i >= 1; i--) {
            heapify(i);
        }
    }

    public void sort(int[] array) {
        buildHeap(array);

        int originalSize = size;
        for (int i = 1; i <= originalSize; i++) {

            int min = deleteMin();
            array[i - 1] = min;
        }
    }

    private void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    public static void main(String[] args) {
        int[] data = {45, 10, 25, 5, 12, 1};
        HeapSort sorter = new HeapSort(data.length);

        sorter.sort(data);

        System.out.print("Sıralanmış Dizi: ");
        for (int val : data) System.out.print(val + " ");
    }
}