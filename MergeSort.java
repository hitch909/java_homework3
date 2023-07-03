// Реализовать алгоритм сортировки слиянием

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {

    public static void main(String[] args) {
        int counter, num;
        int[] arr;
        Scanner inp = new Scanner(System.in);
        System.out.println("введите количество элементов массива:  ");
        num = inp.nextInt();
        arr = new int[num];
        System.out.println("введите " + num + " чисел");
        for (counter = 0; counter < num; counter++) {
            arr[counter] = inp.nextInt();
        }
        inp.close();

        System.out.println("массив перед сортировкой: " + Arrays.toString(arr));
        int[] merged = mergeSort(arr, 0, arr.length - 1);
        System.out.println("массив после сортировки:  " + Arrays.toString(merged));
    }

    public static int[] mergeTwoSortedArrays(int[] one, int[] two) {
        int[] sorted = new int[one.length + two.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < one.length && j < two.length) {
            if (one[i] < two[j]) {
                sorted[k] = one[i];
                k++;
                i++;
            } else {
                sorted[k] = two[j];
                k++;
                j++;
            }
        }

        if (i == one.length) {
            while (j < two.length) {
                sorted[k] = two[j];
                k++;
                j++;
            }
        }

        if (j == two.length) {
            while (i < one.length) {
                sorted[k] = one[i];
                k++;
                i++;
            }
        }
        return sorted;
    }

    public static int[] mergeSort(int[] arr, int lo, int hi) {
        if (lo == hi) {
            int[] br = new int[1];
            br[0] = arr[lo];
            return br;
        }

        int mid = (lo + hi) / 2;
        int[] fh = mergeSort(arr, lo, mid);
        int[] sh = mergeSort(arr, mid + 1, hi);
        return mergeTwoSortedArrays(fh, sh);
    }
}

