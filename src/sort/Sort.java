/*
    Autor: Hien Nguyen, Informatik 1 Java - Klausurvorbereitung
    Sortieralgorithmen: Heapsort;
    Control Flow statements: if, for, recursion, ...
 */

package sort;

public class Sort {
    protected static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
