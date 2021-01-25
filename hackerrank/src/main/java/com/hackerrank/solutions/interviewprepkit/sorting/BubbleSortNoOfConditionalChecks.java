package com.hackerrank.solutions.interviewprepkit.sorting;

/**
 * https://www.hackerrank.com/challenges/ctci-bubble-sort/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=sorting
 * https://www.hackerearth.com/practice/algorithms/sorting/bubble-sort/visualize/
 */
public class BubbleSortNoOfConditionalChecks {

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void countSwaps(int[] a) {
        int count = 0;
        int n = a.length;

        //bubble sort
        for (int i = 0; i < n - 1; i++) {
            // (n-i-1) is for ignoring comparisons of elements which have already been compared in earlier iterations
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j+1]) {
                    swap(a, j, j+1);
                    count++;
                }
            }
        }

        System.out.println("Array is sorted in " + count + " swaps.");
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[n-1]);
    }

    public static void main(String[] args) {
//        bubbleSort(new int[] {4,3,2,1,0});
        countSwaps(new int[] {3,2,1});
        countSwaps(new int[] {1,2,3});
    }

}
