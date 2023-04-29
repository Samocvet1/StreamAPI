package com.example.StreamAPI.SixthEx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> str = new ArrayList<String>();
        Collections.addAll(str,"J","a","v","a");
        String joined = str.stream().collect(Collectors.joining(", "));
        System.out.println(joined);
    }
}
