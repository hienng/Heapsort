/*
    Autor: Hien Nguyen, Informatik 1 Java - Klausurvorbereitung
    Sortieralgorithmen: Heapsort;
    Control Flow statements: if, for, recursion, ...
 */

package sort.heap;

import sort.Sort;

public class HeapSort extends Sort {
    public static void sort(int [] arr) {
        // build a heap
        generateHeap(arr);
        //sort the heap
        sortHeap(arr);
    }

    private static void generateHeap(int[] arr) {
        // all nodes except leafs
        for(int i = arr.length / 2; i >= 0; i--) {
            // percolate nodes through whole tree
            percolate(arr, i, arr.length);
        }
    }

    private static void sortHeap(int[] arr) {
        // elements after i are already sorted, therefore no need to be heapified
        for(int i = arr.length - 1; i >= 1 ; i--) {
            // swap last tree node to root
            swap(arr, 0, i);
            // percolate root
            percolate(arr, 0, i);
        }
    }

    private static void percolate(int[] arr, int parent, int n) {
        int childLeft = childLeft(parent);
        int childRight = childRight(parent);

        int maxChild;

        // if 2 children exists
        if(childRight < n) {
            // get the largest of both
            if(arr[childLeft] < arr[childRight]) {
                maxChild = childRight;
            } else {
                maxChild = childLeft;
            }
            // if heap property not satisfied
            if(arr[parent] < arr[maxChild]) {
                // heapify
                swap(arr, maxChild, parent);
                percolate(arr, maxChild, n);
            }
        // if there is only leftChild
        } else if (childLeft < n) {
            // if heap property not satisfied
            if(arr[parent] < arr[childLeft]) {
                // swap -> heapify
                swap(arr, childLeft, parent);
            }
        }
    }

    // Tree representation by Array
    private static int childLeft(int parent) {
        return 2 * parent;
    }

    private static int childRight(int parent) {
        return (2 * parent) + 1;
    }
}