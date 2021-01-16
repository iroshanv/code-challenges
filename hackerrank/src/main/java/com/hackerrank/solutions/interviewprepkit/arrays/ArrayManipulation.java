package com.hackerrank.solutions.interviewprepkit.arrays;

import java.util.Arrays;

/**
 * reference:
 * pre-fix sum algorithm
 * https://www.youtube.com/watch?v=scD312I7kkE
 * https://www.youtube.com/watch?v=pVS3yhlzrlQ
 * https://www.youtube.com/watch?v=hDhf04AJIRs&t=237s&pbjreload=101
 *
 * https://www.hackerrank.com/challenges/crush/problem
 */
public class ArrayManipulation {

    static long arrayManipulation(int n, int[][] queries) {
        long[] newArr = new long[n+2];

        for (int i = 0; i < queries.length; i++) {
            int a = queries[i][0];
            int b = queries[i][1];
            int k = queries[i][2];

            newArr[a] += k;
            newArr[b+1] -= k;
        }

        long largest = getMax(newArr);
        return largest;
    }

    private static long getMax(long[] array) {
        long max = Long.MIN_VALUE;
        long sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            max = Math.max(sum, max);
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(arrayManipulation(5, new int[][] {
                {1,2,100},
                {2,5,100},
                {3,4,100}
        }));

        System.out.println(arrayManipulation(10, new int[][] {
                {1,5,3},
                {4,8,7},
                {6,9,1}
        }));

        System.out.println(arrayManipulation(10, new int[][] {
                {2,6,8},
                {3,5,7},
                {1,8,1},
                {5,9,15}
        }));
    }

    // brute-force
    static long arrayManipulation_notEfficient(int n, int[][] queries) {
        int qSize = queries.length;
        long[][] newArr = new long[qSize][n+1];

        for (int i = 0; i < qSize; i++) {
            for (int j = queries[i][0]; j <= queries[i][1]; j++) {
                newArr[i][j] += queries[i][2];
            }
            if( i != qSize-1)
                System.arraycopy(newArr[i], 0, newArr[i+1], 0, n+1);
        }
        return Arrays.stream(newArr[qSize-1]).max().getAsLong();
    }
}
