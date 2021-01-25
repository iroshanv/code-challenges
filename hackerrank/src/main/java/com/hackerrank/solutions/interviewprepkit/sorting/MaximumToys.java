package com.hackerrank.solutions.interviewprepkit.sorting;

import java.util.Arrays;

/**
 * https://www.hackerrank.com/challenges/mark-and-toys/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=sorting
 */
public class MaximumToys {

    static int maximumToys(int[] prices, int k) {
        int toysCount = 0;
        int remainingAmount = k;

        Arrays.sort(prices);
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < remainingAmount) {
                remainingAmount -= prices[i];
                toysCount++;
            } else {
                // prices[i] > k
                break;
            }
        }
        return toysCount;
    }

    public static void main(String[] args) {
        System.out.println(maximumToys(new int[]{1,12,5,111,200,1000,10}, 50));
    }
}
