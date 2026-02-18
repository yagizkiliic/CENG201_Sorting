public class MergeSort {

    public static int[][] split(int[] array) {
        int mid = array.length / 2;

        int[] firstPart = new int[mid];
        int[] secondPart = new int[array.length - mid];

        for (int i = 0; i < mid; i++) {
            firstPart[i] = array[i];
        }

        for (int i = mid; i < array.length; i++) {
            secondPart[i - mid] = array[i];
        }

        return new int[][] { firstPart, secondPart };
    }

    public static int[] merge(int[] array1, int[] array2) {
        int[] combined = new int[array1.length + array2.length];
        int index = 0;
        int i = 0;
        int j = 0;

        while (i < array1.length && j < array2.length) {
            if (array1[i] < array2[j]) {
                combined[index] = array1[i];
                i++;
            } else {
                combined[index] = array2[j];
                j++;
            }
            index++;
        }

        while (i < array1.length) {
            combined[index++] = array1[i++];
        }

        while (j < array2.length) {
            combined[index++] = array2[j++];
        }

        return combined;
    }
}
