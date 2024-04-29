package com.github.mrsemyon;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        System.out.println("1st exercise:");
        System.out.println(isStringContainsSameLetterCount("ooxx", 'o','x'));
        System.out.println(isStringContainsSameLetterCount("xooxx", 'o','x'));
        System.out.println(isStringContainsSameLetterCount("ooxXm", 'o','x'));
        System.out.println(isStringContainsSameLetterCount("zpzpzpp", 'o','x'));
        System.out.println(isStringContainsSameLetterCount("zzoo", 'o','x'));

//        System.out.println("2nd exercise:");
//        squareEveryDigitNumber(123);

        System.out.println("3rd exercise:");
        System.out.println(upperCaseFirstSymbol("lol kek cheburek"));

        System.out.println("4st exercise:");
        System.out.println(maxString("alsdkfj", "pwoqefidk"));
    }

    public static boolean isStringContainsSameLetterCount(String str, Character firstCh, Character secondCh){
        str = str.toLowerCase();
        Stream<Character> firstStream
                = str.codePoints().mapToObj(c -> (char) c)
                .filter(c -> c == firstCh);
        Stream<Character> secondStream
                = str.codePoints().mapToObj(c -> (char) c)
                .filter(c -> c == secondCh);
        return firstStream.count() == secondStream.count();
    }

    public static Integer squareEveryDigitNumber(Integer number){
        ArrayList<String> list = new ArrayList<String>(List.of(number.toString().split("")));
        Stream<String> stream = list.stream()
                .map(s ->  Integer.parseInt(s) * Integer.parseInt(s))
                .map(Objects::toString)
                .collect(Collectors.joining()).lines();
        number = Integer.parseInt(stream.toString());
        return number;
    }

    public static String upperCaseFirstSymbol(String str){
        ArrayList<String> strList= new ArrayList<String>(List.of(str.split(" ")));
        return strList.stream()
                .map(c -> c.substring(0, 1).toUpperCase() + c.substring(1))
                .collect(Collectors.joining(" "));
    }

    public static String maxString(String str1, String str2){
        long firstStrCount = str1.codePoints()
                .count();
        long secondStrCount = str2.codePoints()
                .count();
        if (firstStrCount > secondStrCount) {
            return str1.codePoints()
                    .mapToObj(c -> (char) c)
                    .distinct()
                    .toString();
        } else {
            return str2.codePoints()
                    .mapToObj(c -> (char) c)
                    .distinct()
                    .toString();
        }
    }
}