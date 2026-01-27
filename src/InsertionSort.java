import java.util.Scanner;

public class InsertionSort {
    /*
    İkinci sayıdan başlar ilk sayı ile karşılaştırarak ilerler
    7-3-5-1-2
    [7-3]-5-1-2 -> [3-7]-5-1-2
    [3-7-5]-1-2 -> [3-5-7]-1-2
    [3-5-7-1]-2 -> [1-3-5-7]-2
    [1-3-5-7-2] -> [1-2-3-5-7]
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("kaç adet sayı istersiniz:");
        int n = scan.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("sayı :");
            array[i] = scan.nextInt();
        }

        insertionSort(array,n);
        System.out.println("Sıralama işlemi sonrası:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i]+" ");;
        }
    }

    private static void insertionSort(int[] array, int n) {
        for (int i=1; i<n;i++){
            for (int j=i; j>0; j--){
                if (array[j]<array[j-1]){
                    int temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
            }
        }
    }
}
