package com.hackerrank.solutions.interviewprepkit.warmupchallenges;

/**
 * https://www.hackerrank.com/challenges/repeated-string/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
 * https://www.youtube.com/watch?v=d5xLkTvJDWY
 */
public class RepeatedString {

    static int getLetterACount(String s, long strLength) {
        int count = 0;
        for (int i = 0; i < strLength; i++) {
            if (s.charAt(i) == 'a') count++;
        }
        return count;
    }

    static long repeatedString(String s, long n) {
        long stringSize = s.length();
        long q = n / stringSize;
        long r = n % stringSize;
        long partialStrLen = (r == 0) ? 0 : r;
        long noOfA =  q * (getLetterACount(s, stringSize)) + (getLetterACount(s, partialStrLen));
        return noOfA;
    }

    public static void main(String[] args) {
        System.out.println(repeatedString("abcac", 10)); // 4
        System.out.println(repeatedString("aba", 10)); //7
        System.out.println(repeatedString_notEfficient("aba", 10)); //7
        System.out.println(repeatedString("a", 10000000000l));
    }

    static long repeatedString_notEfficient(String s, long n) {
        long size = s.length();
        long noOfA = 0;

        for (long i = 0; i < n; i++) {
            if (s.charAt( (int) (i % size)) == 97) {
                noOfA++;
            }
        }

        return noOfA;
    }

}
