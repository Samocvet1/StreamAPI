package com.example.StreamAPI.SeventhEx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(123,321,67,98,101);
        numbers.stream().filter(n -> n >100).forEach(n -> System.out.println(n));
    }
}
