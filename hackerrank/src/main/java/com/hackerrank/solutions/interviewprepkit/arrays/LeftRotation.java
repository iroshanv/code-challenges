package com.hackerrank.solutions.interviewprepkit.arrays;

import java.util.Arrays;

/**
 * https://www.hackerrank.com/challenges/ctci-array-left-rotation/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays
 */
public class LeftRotation {

    static int[] rotLeft(int[] a, int d) {

        int arrSize = a.length;
        int[] newArr = new int[arrSize];
        int noOfRot = d;

        // shift all items (not part of rotation) to new array from starting index
        for (int i = noOfRot, j=0;
             i < arrSize && j < arrSize - noOfRot && d != 0;
             i++, j++)
        {

            newArr[j] = a[i];
        }

        // shift all items (part of rotation) to new array from where we left (arrSize-noOfRot should tell us where to start)
        for (int i = arrSize - noOfRot, j=0;
             j < noOfRot && i < arrSize && d != 0;
             i++, j++)
        {
            newArr[i]  = a[j];
        }
        return d !=0 ? newArr : a;
    }

    public static void main(String[] args) {
        System.out.println( Arrays.toString(rotLeft(new int[]{33, 47, 70, 37, 8, 53, 13, 93, 71, 72, 51, 100, 60, 87, 97}, 13)));
    }

    /**
     * editor answer
     * @param arr
     * @param noOfRot
     * @return rotatedArray
     */
    public static int[] rotateArray(int[] arr, int noOfRot){
        // Because the constraints state d < n, we need not concern ourselves with shifting > n units.
        int arrSize = arr.length;

        // Create new array for rotated elements:
        int[] newArr = new int[arrSize];

        // Copy segments of shifted elements to rotated array:
        System.arraycopy(arr, noOfRot, newArr, 0, arrSize - noOfRot);
        System.arraycopy(arr, 0, newArr, arrSize - noOfRot, noOfRot);

        return newArr;
    }
}
