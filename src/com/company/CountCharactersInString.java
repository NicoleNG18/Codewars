package com.company;

import java.util.LinkedHashMap;
import java.util.Map;

//The main idea is to count all the occurring characters in a string.
//If you have a string like aba, then the result should be {'a': 2, 'b': 1}.
//What if the string is empty? Then the result should be empty object literal, {}.

public class CountCharactersInString {
    public static void main(String[] args) {
        count("abbav");
    }

    public static Map<Character, Integer> count(String str) {
        Map<Character, Integer> charactersCount = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++) {
            charactersCount.putIfAbsent(str.charAt(i), 0);
            charactersCount.put(str.charAt(i), charactersCount.get(str.charAt(i)) + 1);
        }
        return charactersCount;
    }

}