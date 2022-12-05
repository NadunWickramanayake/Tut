package com.company.Q1;

import java.util.Locale;

public class Question1{

    public static void main(String[] args) {

        String river = "Mississippi";
        String bigRiver = river.toUpperCase();
        String smallRiver = river.toLowerCase(Locale.ROOT);

        System.out.println(bigRiver);
        System.out.println(smallRiver);

    }
}
