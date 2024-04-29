package com.github.mrsemyon;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        System.out.println("First exercise:");
        System.out.println(isStringContainsSameLetterCount("ooxx", 'o','x'));
        System.out.println(isStringContainsSameLetterCount("xooxx", 'o','x'));
        System.out.println(isStringContainsSameLetterCount("ooxXm", 'o','x'));
        System.out.println(isStringContainsSameLetterCount("zpzpzpp", 'o','x'));
        System.out.println(isStringContainsSameLetterCount("zzoo", 'o','x'));
    }

    public static boolean isStringContainsSameLetterCount(String str, Character firstCh, Character secondCh){
        str = str.toLowerCase();
        long firstChCount = str.chars()
                .filter(s -> s == firstCh)
                .count();
        long secondChCount = str.chars()
                .filter(s -> s == secondCh)
                .count();
        return firstChCount == secondChCount;
    }
}