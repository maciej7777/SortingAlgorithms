package org.example.sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = {7, 2, 1, 8, 3, 2, 4};
        qsort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

    public static void qsort(int[] array, int start, int stop) {
        if (start >= stop) return;

        int middleElement = start + (stop - start)/2;
        int middleValue = array[middleElement];

        int i = start;
        int j = stop;

        while (i <= j) {
            while (array[i] < middleValue) i++;
            while (array[j] > middleValue) j--;

            if (i <= j) {
                swap(i, j, array);
                i++;
                j--;
            }
        }

        if (start < j) {
            qsort(array, start, j);
        }
        if (i < stop) {
            qsort(array, i, stop);
        }
    }

    private static void swap(int i, int j, int[] array) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

}
