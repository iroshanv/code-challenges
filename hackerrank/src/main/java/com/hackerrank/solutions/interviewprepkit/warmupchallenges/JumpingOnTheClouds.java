package com.hackerrank.solutions.interviewprepkit.warmupchallenges;

/**
 * https://www.hackerrank.com/challenges/jumping-on-the-clouds/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
 */
public class JumpingOnTheClouds {

    static int jumpingOnClouds(int[] c) {

        int noOfJumps = 0;
        for (int i = 0; i < c.length-1; i++) {

                // (i+2 != c.length) checks if we can double jump
                if ( (i+2 != c.length) && c[i+2] == 0 ) {
                    noOfJumps++;
                    i++;
                }else {
                    noOfJumps++;

                }
        }

        return noOfJumps;

    }

    public static void main(String[] args) {
        System.out.println(jumpingOnClouds(new int[] {0,1,0,0,0,1,0})); //3
        System.out.println(jumpingOnClouds(new int[] {0,0,1,0,0,1,0})); //4
        System.out.println(jumpingOnClouds(new int[] {0,0,0,0,1,0})); //3
        System.out.println(jumpingOnClouds(new int[] {0,0,0,1,0,0})); //3
    }
}
