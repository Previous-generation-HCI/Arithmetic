package com.explore.truth.universe.binarysearch.gzz;

public class BinarySearch {
    public static int search(int[] intArray, int target) {
        int result = -1;
        int start = 0;
        int end = intArray.length - 1;

        while (true) {
            if (target > intArray[start] && target < intArray[end]) {
                int mid = (start + end) / 2;
                if (mid <= start || mid >= end) {
                    break;
                }

                if (target < intArray[mid]) {
                    end = mid;
                } else if (target > intArray[mid]) {
                    start = mid;
                } else {
                    result = mid;
                    break;
                }
            } else if (target == intArray[start]) {
                result = start;
                break;
            } else if (target == intArray[end]) {
                result = end;
                break;
            } else {
                break;
            }

        }

        return result;
    }
}