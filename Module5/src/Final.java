import java.util.Arrays;

public class Final {
    public static void main(String[] args) {
        int[] array1 = {-2, 45, 0, 11, -9};
        int[] array2 = {-2, 45, 0, 11, -9};

        System.out.println("Пузырьковая сортировка:");
        System.out.println(Arrays.toString(array1));
        bubbleSort(array1);
        System.out.println(Arrays.toString(array1));
        System.out.println();

        System.out.println("Быстрая сортировка:");
        System.out.println(Arrays.toString(array2));
        quickSort(array2, 0, array2.length - 1);
        System.out.println(Arrays.toString(array2));
    }

    public static void bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pi = partition(array, low, high);
            quickSort(array, low, pi - 1);
            quickSort(array, pi + 1, high);
        }
    }

    private static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        return i + 1;
    }
}
