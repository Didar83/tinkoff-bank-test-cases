package com.leetcode.level.easy;

import java.util.*;

public class RemoveDuplicatesInSortedArray {
    static public int removeDuplicates(int[] nums) {
        int currentPosition = 0;
        int previousNumber = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            if(previousNumber < nums[i]){
                nums[currentPosition++] = nums[i];
                previousNumber = nums[i];
            }
        }
        return currentPosition;
    }

    public static void main(String[] args) {
        int[] intArr = {1, 1, 2};
        System.out.println(Arrays.toString(intArr));
        System.out.println(removeDuplicates(intArr));
        System.out.println(Arrays.toString(intArr));

        int[] intArr2 = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(Arrays.toString(intArr2));
        System.out.println(removeDuplicates(intArr2));
        System.out.println(Arrays.toString(intArr2));
    }
}
