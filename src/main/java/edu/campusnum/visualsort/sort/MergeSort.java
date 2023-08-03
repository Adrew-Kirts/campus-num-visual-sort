

package edu.campusnum.visualsort.sort;

import edu.campusnum.visualsort.model.ObservableArray;
import edu.campusnum.visualsort.model.Order;


/**
 * Created by Web 74 all right reserved
 * User: vincent
 * Date: 27/07/2023
 * Time: 16:31
 */
public class MergeSort implements SortAlgorithm {
    @Override
    public void sort(ObservableArray array) {
        if (array.getLength() > 1) {

            int n = array.getLength();
            int mid = n / 2;
            int i = 0;

            ObservableArray left = array.slice(i, mid);
            ObservableArray right = array.slice(mid, n - mid); //count is ok for end of array?

            sort(left);
            sort(right);

            while (mid - i > 0 && n - mid > 0) {
                if (array.compare(mid, i).equals(Order.Lower)) {
                    for (int x = mid; x > i; x--) {
                        array.swap(x, x - 1);
                    }
                    mid++;
                }
                i++;
            }
        }
    }
}

