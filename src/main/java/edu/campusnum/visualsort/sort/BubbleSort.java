package edu.campusnum.visualsort.sort;

import edu.campusnum.visualsort.model.ObservableArray;

/**
 * Created by Web 74 all right reserved
 * User: vincent
 * Date: 27/07/2023
 * Time: 16:32
 */
public class BubbleSort implements SortAlgorithm {
    @Override
    public void sort(ObservableArray array) {

        int n = array.getLength();
        int tri = 1;
        while (tri > 0) {
            tri = 0;
            for (int i = 0; i < n - 1; i++) {
                int x = array.get(i);
                int y = array.get(i + 1);
                if (x > y) {
                    array.swap(i, i + 1);
                    tri++;
                }
            }
        }
    }
}