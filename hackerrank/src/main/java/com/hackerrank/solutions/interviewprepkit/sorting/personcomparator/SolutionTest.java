package com.hackerrank.solutions.interviewprepkit.sorting.personcomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * https://www.hackerrank.com/challenges/ctci-comparator-sorting/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=sorting
 * https://www.baeldung.com/java-comparator-comparable
 */
public class SolutionTest {

    public static void main(String[] args) {
        Player amy = new Player("amy", 100);
        Player any = new Player("any", 100);
        Player david = new Player("david", 100);
        Player heraldo = new Player("heraldo", 50);
        Player aakansha = new Player("aakansha", 75);
        Player aleksa = new Player("aleksa", 150);

        List<Player> players = new ArrayList<>();
        players.add(amy);
        players.add(david);
        players.add(aakansha);
        players.add(heraldo);
        players.add(aleksa);
        players.add(any);

        Collections.sort(players, new Checker());

        System.out.println(players);

    }

}
