package com.hackerrank.solutions.interviewprepkit.warmupchallenges;

import java.util.Arrays;

/**
 * https://www.hackerrank.com/challenges/sock-merchant/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
 */
public class SalesByMatch {

    static int sockMerchant(int n, int[] ar) {

        int pairOfSocks = 0;
        Arrays.sort(ar);
        for (int i = 0; i < n-1; i++) {
            if (ar[i] == ar[i+1]) {
                pairOfSocks++;
                i++;
            }
        }

        return pairOfSocks;

    }

    public static void main(String[] args) {
        System.out.println(sockMerchant(7, new int[]{1,2,1,2,1,3,2}));
        System.out.println(sockMerchant(9, new int[]{10,20,20, 10, 10, 30, 50, 10, 20}));
    }

}
