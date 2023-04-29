package com.example.StreamAPI.FirstEx;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> stationery = new ArrayList<String>();
        Collections.addAll(stationery, "Карандаш","Ручка","Пенал","Клей","Корректор");
        stationery.stream().filter(s -> s.startsWith("К")).forEach(s -> System.out.println(s));
    }
}
