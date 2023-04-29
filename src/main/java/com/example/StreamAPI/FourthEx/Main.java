package com.example.StreamAPI.FourthEx;


import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<String> books = Stream.of("Мертвые души","Капитанская дочка","Война и мир","Капитанская дочка");
        books.distinct().forEach(s -> System.out.println(s));
    }
}
