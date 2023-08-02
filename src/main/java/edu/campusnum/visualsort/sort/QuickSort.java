package edu.campusnum.visualsort.sort;

import edu.campusnum.visualsort.model.ObservableArray;

/**
 * Created by Web 74 all right reserved
 * User: vincent
 * Date: 27/07/2023
 * Time: 16:31
 */
public class QuickSort implements SortAlgorithm{

    @Override
    public void sort(ObservableArray array) {
        int first = array.get(0);
        int last = array.getLength(); //maybe -1??
        quicksort(array, first, last);
    }

    public void quicksort(ObservableArray array, int first, int last){

    }


}
