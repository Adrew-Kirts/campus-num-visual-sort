package edu.campusnum.visualsort.sort;

import edu.campusnum.visualsort.model.ObservableArray;
import edu.campusnum.visualsort.model.Order;

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
        int c = 1;
        while (tri > 0) {
            tri = 0;
            for (int i = 0; i < n - c; i++) {
//                int x = array.get(i);
//                int y = array.get(i + 1);
//                if (x > y) {
                if (array.compare(i, i+1).equals(Order.Higher)){
                    array.swap(i, i + 1);
                    tri++;
                }
            }
            c++;
        }
    }
}