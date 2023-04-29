package com.example.StreamAPI.ThirdEx;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Email> emailList = Arrays.asList(new Email("qwe1@gmail.com",Status.NEW),
                new Email("qwe2@gmail.com",Status.SEND),
                new Email("qwe3@gmail.com",Status.NEW),
                new Email("qwe4@gmail.com",Status.NEW));
        Collections.addAll(emailList);
        emailList.stream().filter(email -> email.getStatus() == Status.NEW).forEach(email -> System.out.println(email));
    }
}
