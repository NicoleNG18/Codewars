package com.company;

import java.util.*;

//You are given an array (which will have a length of at least 3, but could be very large) containing integers.
//The array is either entirely comprised of odd integers or entirely comprised of even integers except for a single integer N.
// Write a method that takes the array as an argument and returns this "outlier" N.
//
//        Examples
//        [2, 4, 0, 100, 4, 11, 2602, 36] -->  11 (the only odd number)
//
//        [160, 3, 1719, 19, 11, 13, -21] --> 160 (the only even number)

public class FindTheOutlier {
    static int find(int[] integers) {
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        for (int i : integers) {
            if (i % 2 == 0) {
                even.add(i);
            } else {
                odd.add(i);
            }
        }
        if (even.size() == 1) {
            return even.get(0);
        }
        return odd.get(0);
    }
}

