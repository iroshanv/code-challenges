package com.hackerrank.solutions.interviewprepkit.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * https://www.hackerrank.com/challenges/2d-array/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays
 */
public class HourGlass {

    static int hourglassSum(int[][] arr) {
        int size = arr.length;
        List<Integer> list = new ArrayList<>();
        for (int r = 0; r < size-2; r++) {
            for (int c = 0; c < size-2; c++) {
                int sum =  arr[r][c] + arr[r][c +1] + arr[r][c +2] +
                                       arr[r +1][c + 1] +
                        arr[r + 2][c] + arr[r + 2][c + 1] + arr[r +2][c + 2];
                list.add(sum); // tip: instead of adding to list, you can check largest sum and return the same
            }
        }
        return Collections.max(list);
    }

    public static void main(String[] args) {
        System.out.println(hourglassSum(new int[][]{
                {1,1,1,0,0,0},
                {0,1,0,0,0,0},
                {1,1,1,0,0,0},
                {0,0,2,4,4,0},
                {0,0,0,2,0,0},
                {0,0,1,2,4,0}
        }));
    }

}
