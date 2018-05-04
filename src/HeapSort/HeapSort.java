package HeapSort;

/**
 * @file HeapSort.java
 * @date May 4, 2018 , 2:09:15 PM
 * @author Muhammet Alkan
 */
public class HeapSort {

    private int n;

    void heapSort(int[] array) {
        heapify(array);

        for (int i = n; i > 0; i--) {
            swap(array, 0, i);
            n--;
            maxHeap(array, 0);
        }
    }

    void heapify(int[] array) {
        n = array.length - 1;

        // control parent nodes
        for (int i = (n - 1) / 2; i >= 0; i--) {
            maxHeap(array, i);
        }
    }

    void maxHeap(int[] array, int k) {
        int left = 2 * k + 1;
        int right = 2 * k + 2;

        int max = k;

        if (left <= n && array[max] < array[left]) {
            max = left;
        }
        if (right <= n && array[max] < array[right]) {
            max = right;
        }

        if (max != k) {
            swap(array, k, max);
            maxHeap(array, max);
        }
    }

    void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
