import java.util.Scanner;

public class SelectionSort {
    /* en küçük sayıyı bul başa taşı
    7 3 5 1 2
    [7] 3 5 1 2 ->  [1] 3 5 7 2
    1 [3] 5 7 2 ->  1 [2] 5 7 3
    1 2 [5] 7 3 ->  1 2 [3] 7 5
    1 2 3 [7] 5 ->  1 2 3 [5] 7     

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

        selectionSort(array,n);
        System.out.println("Sıralama işlemi sonrası:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i]+" ");;
        }
    }

    private static void selectionSort(int[] array, int n) {
        for (int i=0; i<n-1;i++) {
            int min = i;
            for (int j=i; j<n-1; j++) {
                if (array[min] > array[j] ){
                    min = j;
                }
            }
            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }
    }
}
