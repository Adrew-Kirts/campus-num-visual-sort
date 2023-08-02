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
//        int n = array.getLength();
//        int mid = n / 2;
//        if (n < 1) {
//            return array;
//        } else {
//            ObservableArray left = array.slice(0, mid);
//            ObservableArray right = array.slice(mid + 1, n);
//            return merge(mergeSort(left), mergeSort(right));
//        }
//    }

//    public ObservableArray merge(ObservableArray left, ObservableArray right) {
//        if (left.getLength() == 0) {
//            return right;
//        }
//        if (right.getLength() == 0) {
//            return left;
//        }
////        if (left.get(1) < right.get(1)) {
////            return; //A[1] ⊕ fusion(A[2, ..., a], B)
////        } else {
////            return; //B[1] ⊕ fusion(A, B[2, ..., b])
////        }
////    }
}

