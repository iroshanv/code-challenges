package com.hackerrank.solutions.interviewprepkit.arrays;

/**
 * https://www.hackerrank.com/challenges/new-year-chaos/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays
 * https://www.youtube.com/watch?v=YWYF6bOhPW8
 */
public class NewYearChaos {

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void minimumBribes(int[] queue) {
        int swapCount = 0;

        for (int p = queue.length-1; p >= 0 ; p--) {

            if (queue[p] != (p+1)) { // check if bribe happened
                if ( ((p-1) >= 0) && queue[p-1] == (p+1) ) {
                    swapCount++;
                    swap(queue, p, p-1);
                }else if ( ((p-2)>=0) && queue[p-2] == (p+1) ) {
                    swapCount+=2;
                    swap(queue, p-2, p-1);
                    swap(queue, p-1, p);
                }else {
                    // q[i-1] != (i+1) && q[i-2] != (i+1)
                    System.out.println("Too chaotic");
                    return;
                }
            }

        }
        System.out.println(swapCount);
    }

    public static void main(String[] args) {
        minimumBribes(new int[]{2, 1, 5, 3, 4}); // 3
        minimumBribes(new int[]{1, 2, 5, 3, 7, 8, 6, 4}); // 7
        minimumBribes(new int[]{1,2,3,5,4,6,7,8}); // 1
        minimumBribes(new int[]{4,1,2,3}); // Too chaotic
        minimumBribes(new int[]{2, 5, 1, 3, 4}); // too chaotic
    }

    // linear approach - time outs on large inputs
    static void minimumBribes_linear(int[] q) {
        int sumOfBribes=0;
        for (int i = 0; i < q.length; i++) {
            if (q[i] != (i+1)) { // check if bribe happened
                int bc = q[i] - (i + 1);

                if (bc >= 3) {
                    System.out.println("Too chaotic");
                    return;
                }

                for (int j = i; j < q.length; j++) {
                    if (q[i] > q[j]) sumOfBribes++;
                }
            }
        }
        System.out.println(sumOfBribes);
    }
}
