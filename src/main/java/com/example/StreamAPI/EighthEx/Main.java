package com.example.StreamAPI.EighthEx;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(100,150,20,60,90);
        System.out.println( numbers.stream().mapToInt(n -> n).average().orElse(0));
    }
}
