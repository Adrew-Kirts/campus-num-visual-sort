package edu.campusnum.visualsort.sort;

import edu.campusnum.visualsort.model.ObservableArray;

public class MergeSort implements SortAlgorithm {

    @Override
    public void sort(ObservableArray array) {
        int[] auxArray = new int[array.getLength()];
        mergesort(array, auxArray, 0, array.getLength() - 1);
    }

    private void mergesort(ObservableArray array, int[] auxArray, int first, int last) {
        if (first < last) {
            int mid = (first + last) / 2;
            mergesort(array, auxArray, first, mid);
            mergesort(array, auxArray, mid + 1, last);
            merge(array, auxArray, first, mid, last);
        }
    }

    private void merge(ObservableArray array, int[] auxArray, int first, int mid, int last) {
        // Copy elements to the auxiliary array
        for (int i = first; i <= last; i++) {
            auxArray[i] = array.get(i);
        }

        int i = first;
        int j = mid + 1;
        int k = first;

        while (i <= mid && j <= last) {
            if (auxArray[i] <= auxArray[j]) {
                array.swap(k, i);
                i++;
            } else {
                array.swap(k, j);
                j++;
            }
            k++;
        }

        while (i <= mid) {
            array.swap(k, i);
            i++;
            k++;
        }
    }
}
