

package edu.campusnum.visualsort.sort;

import edu.campusnum.visualsort.model.ObservableArray;


/**
 * Created by Web 74 all right reserved
 * User: vincent
 * Date: 27/07/2023
 * Time: 16:31
 */
public class MergeSort implements SortAlgorithm {
    @Override
    public void sort(ObservableArray array) {
//        mergeSort(array);
    }

//    public ObservableArray mergeSort(ObservableArray array) {
//
//        int n = array.getLength();
//        int mid = n / 2;
//        if (n == 1) {
//            return array;
//        } else {
//            ObservableArray left = array.slice(0, mid);
//            ObservableArray right = array.slice(mid + 1, n - mid); //count is ok for end of array?
//
//            left = mergeSort(left);
//            right = mergeSort(right);
//
//            int i = 0, j = 0;
//            while (i < left.getLength() && j < right.getLength()) {
//                if (left.get(0) > right.get(0)) {
////                    add b0 to end of array c
////                    remove b0 from right
//                } else {
////                 add a0 to end of array c
////                 remove a0 from left
//                }
//            }
//            while (0 < left.getLength()) {
////                 add a0 to end of array c
////                 remove a0 from left
//            }
//            while (0 < right.getLength()) {
////                add b0 to end of array c
////                remove b0 from right
//            }
//
//            return array c;
//        }
//    }
}
