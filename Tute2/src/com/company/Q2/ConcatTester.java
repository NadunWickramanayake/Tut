package com.company.Q2;

public class ConcatTester {

    public static void main(String[] args)
    {
        String animal1 = "quick brown fox";
        String animal2 = "lazy dog";
        String article = "the";
        String action = "jumps over";
//the quick brown fox jumps over the lazy dog using concat methord
        System.out.println(article.concat(" ").concat(animal1).concat(" ").concat(action).concat(" ").concat(animal2));
///the quick brown fox jumps over the lazy dog using "+" methord
        System.out.println(article +" " + animal1 +" " + action + " " + animal2);

    }

}
