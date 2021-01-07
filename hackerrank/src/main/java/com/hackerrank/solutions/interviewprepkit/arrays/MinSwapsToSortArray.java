package com.hackerrank.solutions.interviewprepkit.arrays;

import java.util.HashMap;

/**
 *
 * You are given an unordered array consisting of "consecutive integers" [1, 2, 3, ..., n] without any duplicates.
 * You are allowed to swap any two elements.
 * You need to find the minimum number of swaps required to sort the array in ascending order.
 *
 * https://www.hackerrank.com/challenges/minimum-swaps-2/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays
 * https://levelup.gitconnected.com/graphs-everywhere-finding-the-minimum-swaps-required-to-sort-an-array-b8dea0a3af52?gi=3ef04f27220a
 * https://www.youtube.com/watch?v=J9ikRMK8Yhs
 */
public class MinSwapsToSortArray {

    static int minimumSwaps(int[] arr) {
        boolean isVisited[] = new boolean[arr.length+1];
        HashMap<Integer, Integer> arrNode = new HashMap<>();
        int countSwap = 0;

        // put arr into map
        for (int i = 1; i <= arr.length; i++) {
            arrNode.put(i, arr[i - 1]);
        }

        for (int k = 1; k <= arrNode.size(); k++) {
            int nextNode;

            if (!isVisited[k]) {
                isVisited[k] = true;

                if (k == arrNode.get(k)) {
                    continue;
                } else {
                    // checking for cycle
                    int pos = arrNode.get(k);
                    while (!isVisited[pos])
                    {
                        isVisited[pos] = true;

                        nextNode = arrNode.get(pos);
                        pos = nextNode;
                        ++countSwap;
                    }
                }
            }
        }
        return countSwap;
    }

    public static void main(String[] args) {
        System.out.println(minimumSwaps(new int[]{4, 3, 1, 2}));
        System.out.println(minimumSwaps(new int[]{1, 3, 5, 2, 4, 6, 7}));
    }


    /*
     *
     * tough the below method works its not time efficient
     *
     * */
    static int minimumSwaps_notEfficient(int[] arr) {
        int size = arr.length;
        int gtBy; // greater By
        int noOfSwaps = 0;
        int indexToSwap = 0;

        for (int i = 0; i < size; i++) {
            gtBy = 0;
            for (int j = i + 1; j < size; j++) {
                int diffValue = arr[i] - arr[j];
                // we will swap the array item which has greater diff value
                if (diffValue > gtBy) {
                    gtBy = diffValue;
                    indexToSwap = j;
                }
            }

            if (gtBy > 0) {
                swap(arr, i, indexToSwap);
                noOfSwaps++;
            }

        }
//        System.out.println(Arrays.toString(arr));
        return noOfSwaps;
    }

    private static int[] swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return arr;
    }

}

