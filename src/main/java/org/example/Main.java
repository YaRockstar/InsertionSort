package org.example;

import java.util.Arrays;

public class Main {
    public static void swap(int[] arr, int i, int j) {
        if (i == j) {
            return;
        }

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                for (int j = i; j >= 0; j--) {
                    if (arr[j] > arr[j + 1]) {
                        swap(arr, j, j + 1);
                    } else {
                        break;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {4, 2, 1, 9, 0, 1, 7, 6, 3, 5, 8, 3};
        System.out.println("Before: " + Arrays.toString(array));
        insertionSort(array);
        System.out.println("After: " + Arrays.toString(array));
    }
}