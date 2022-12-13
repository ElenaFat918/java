package HomeWork3;

import java.util.Arrays;

public class WorkOne {
    public void taskOne() {
        int array[] = { 56789, 3, 34, 876, 78765, 33, 55, 0, 0 };
        System.out.println("Первичный список целых чисел " + Arrays.toString(array));
        mergeSort(array, array.length);
        System.out.println("Cписок целых чисел после сортировки слиянием" + Arrays.toString(array));

    }

    public static void mergeSort(int[] array, int size) {
        if (size < 2)
            return;
        int half = size / 2;
        int[] array1 = new int[half];
        // System.out.println("создаем сокращенный array1 с размером половина от
        // исходного" + Arrays.toString(array1));

        int[] array2 = new int[size - half];
        // System.out.println("создаем сокращенный array2 с размером половина от
        // исходного путем удаления размера предидущ сокращенного массива" +
        // Arrays.toString(array2));

        System.arraycopy(array, 0, array1, 0, half);
        // System.out.println("копируем элементы в array1 от 0 до half" +
        // Arrays.toString(array1));

        System.arraycopy(array, half, array2, 0, size - half);
        // System.out.println("копируем элементы в array2 от середины до конца" +
        // Arrays.toString(array2));

        mergeSort(array1, half);
        // System.out.println("mergeSort array1" + Arrays.toString(array1));

        mergeSort(array2, size - half);
        // System.out.println("mergeSort array2" + Arrays.toString(array2));

        merge(array, array1, array2, half, size - half);
        // System.out.println("merge" + Arrays.toString(array));

    }

    public static void merge(int[] array, int[] array1, int[] array2, int size1, int size2) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < size1 && j < size2) {
            if (array1[i] <= array2[j]) {
                array[k++] = array1[i++];
            } else {
                array[k++] = array2[j++];
            }
        }
        while (i < size1) {
            array[k++] = array1[i++];
        }

        while (j < size2) {
            array[k++] = array2[j++];
        }

    }
}
// /*
// * Реализовать алгоритм сортировки слиянием.
// */