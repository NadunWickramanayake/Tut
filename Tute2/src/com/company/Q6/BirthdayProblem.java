package com.company.Q6;

public class BirthdayProblem {
    public static void main(String[] args) {

        boolean birthdayInRoom[] = new boolean[365];
        // how many people have entered to the room so far
        int number_of_people = 0;
        while (true) {
            ++number_of_people; // another person has entered to the room

            /* generate a random birthday in the range [0,364] and how
            many people will have to enter before there is a match */

            int day = (int) (365 * Math.random()); //  Using random numbers
            if (birthdayInRoom[day]) // if its true
                break;
            else
                birthdayInRoom[day] = true;
        }
        System.out.println(number_of_people);
    }
}