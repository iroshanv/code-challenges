package com.hackerrank.solutions.interviewprepkit.warmupchallenges;

/**
 * https://www.hackerrank.com/challenges/counting-valleys/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
 */
public class CountingValleys {

    public static int countingValleys(int steps, String path) {
        final String[] paths = path.toLowerCase().split("");
        int seaLevel = 0;
        int noOfValleys = 0;
        int UP = 0;

        for (int i = 0; i < steps; i++) {
            if (paths[i].equals("u")) {
                seaLevel += 1; // if 'U' increase by 1
                UP += 1;
                if (seaLevel + UP == 0) noOfValleys++; // (-1 + -1) == 0
            } else {
                seaLevel += (-1); // if 'D' decrease by 1
                UP += (-1);
            }

        }
        return noOfValleys;
    }

    public static void main(String[] args) {
        System.out.println(countingValleys(8, "UDDDUDUU")); // 1
        System.out.println(countingValleys(8, "DDUUUUDD")); // 1
        System.out.println(countingValleys(12, "DDUUDDUDUUUD")); // 2

    }

}
