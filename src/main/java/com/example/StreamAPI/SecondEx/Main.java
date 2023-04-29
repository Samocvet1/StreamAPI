package com.example.StreamAPI.SecondEx;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class  Main {
    public static void main(String[] args) {
        ArrayList<String> books = new ArrayList<String>();
        Collections.addAll(books,"Война и мир","Азазель","Адвокат дьявола","Капитанская дочка","Мертвые души");
        books.stream().sorted().forEach(s -> System.out.println(s));
    }
}
