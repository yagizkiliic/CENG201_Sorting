import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {

        // en büyük değeri bulup en sona doğru taşır

        /*
        7 5 1 3 2
        5 1 3 2 7
        1 3 2 5 7
        1 2 3 5 7
        1 2 3 5 7 -> yine de kontrol edilir
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("kaç adet sayı istersiniz:");
        int n = scan.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("sayı :");
            array[i] = scan.nextInt();
        }

        bubbleSort(array,n);

        System.out.println("Sıralama işlemi sonrası:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i]+" ");;
        }

    }

    private static void bubbleSort(int[] array, int n) {

        for (int i = 0; i< n-1; i++){ // 5 adet sayıyı sıralamak için 4 kere döneriz o yüzden n-1
            for (int j = 0; j< n-i-1;j++){ //üst döngüde artık bir sayı sıralandı o yüzden iç döngü i eksik
                if (array[j]>array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
}
