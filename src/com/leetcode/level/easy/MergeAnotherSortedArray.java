package com.leetcode.level.easy;

import java.util.Arrays;
import java.util.SortedMap;

public class MergeAnotherSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        --m;
        --n;
        for(int i = nums1.length-1; i > 0; i--){
            if(m < 0){
                nums1[i] = nums2[n--];
            } else if (n < 0){
                nums1[i] = nums1[m--];
            } else {
                nums1[i] = nums1[m] > nums2[n] ? nums1[m--] : nums2[n--];
            }
        }
    }

    public static void main(String[] args) {
//        int[] arr1 = {1,2,3,0,0,0};
//        int[] arr2 = {2,5,6};
        int[] arr1 = {0};
        int[] arr2 = {1};
        merge(arr1, 0, arr2,1);
        System.out.println(Arrays.toString(arr1));
    }
}
