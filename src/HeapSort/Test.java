package HeapSort;

/**
 * @file Test.java
 * @date May 4, 2018 , 2:45:46 PM
 * @author Muhammet Alkan
 */
public class Test {

    public static void main(String[] args) {

        int array[] = new int[10];

        // random int array with 10 elements
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }

        HeapSort hSort = new HeapSort();

        System.out.println("unsorted array");
        printArray(array);

        System.out.println("after heapify");
        hSort.heapify(array);
        printArray(array);

        System.out.println("after sort");
        hSort.heapSort(array);
        printArray(array);
    }

    static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
