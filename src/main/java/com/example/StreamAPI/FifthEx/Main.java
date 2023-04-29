package com.example.StreamAPI.FifthEx;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> workers = new ArrayList<String>();
        Collections.addAll(workers, "Бакыт","Эмил","Арген","Адилет","Тимур");
        boolean work = workers.stream().noneMatch(s -> s=="Бакыт");
        System.out.println(work);
    }
}
