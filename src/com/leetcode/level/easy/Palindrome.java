package com.leetcode.level.easy;

import java.util.Collection;
import java.util.HashSet;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;

public class Palindrome {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        ConcurrentHashMap<String, Integer> concurrentHashMap = new ConcurrentHashMap<>();
        Scanner scanner = new Scanner(System.in);
        int trackQuantity = scanner.nextInt();
        String val = String.valueOf(trackQuantity);
        StringBuilder sb = new StringBuilder(val);
        sb.reverse();
        if (val.equals(sb.toString())) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
