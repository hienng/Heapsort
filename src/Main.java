/*
    Autor: Hien Nguyen, Informatik 1 Java - Klausurvorbereitung
    Sortieralgorithmen: Heapsort;
    Control Flow statements: if, for, recursion, ...
 */

import sort.heap.*;
import java.util.Arrays;

public class Main extends MinHeapSort {

    public static void main(String[] args) {
        int[] arr = {4, 0, 7, 2, 8, 1};
        System.out.println(Arrays.toString(arr));

        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
