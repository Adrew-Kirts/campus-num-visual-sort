package edu.campusnum.visualsort.sort;

import edu.campusnum.visualsort.model.ObservableArray;

/**
 * Created by Web 74 all right reserved
 * User: vincent
 * Date: 27/07/2023
 * Time: 16:31
 */
public class QuickSort implements SortAlgorithm {

    @Override
    public void sort(ObservableArray array) {
        int first = 0;
        int last = array.getLength()-1;
        quicksort(array, first, last);
    }

    public void quicksort(ObservableArray array, int first, int last) {
        if (last - first < 1) {
            return;
        }
        int pi = partition(array, first, last);
        quicksort(array, first, pi - 1);
        quicksort(array, pi + 1, last);
    }

    public int partition(ObservableArray array, int first, int last) {
        int pivot = array.get(last);
        int j = first - 1;
        for (int i = first; i <= last -1; i++) {
            if (array.get(i) <= pivot) {
                j++;
                array.swap(i, j);
            }
        }
        array.swap(last, j+1);
        return j+1;
    }

}
