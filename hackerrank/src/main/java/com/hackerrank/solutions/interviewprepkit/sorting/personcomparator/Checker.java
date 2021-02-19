package com.hackerrank.solutions.interviewprepkit.sorting.personcomparator;

import java.util.Comparator;

public class Checker implements Comparator<Player> {
    @Override
    public int compare(Player a, Player b) {
        int res = Integer.compare(b.score, a.score);
        return (res == 0) ? a.name.compareTo(b.name) : res;
    }
}
