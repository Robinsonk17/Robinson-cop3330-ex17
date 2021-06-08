package oop.exercises;
import java.util.Scanner;
/*
 * UCF cop3330 Summer 2021 Assignment 1 solutions
 * Copyright 2021 Keondez Robinson
 */
public class Main
{
    public static void main(String[] args) {
        int hours, weight, drinks;
        double bac, ratio;
        String gender;
        Scanner input;

        input = new Scanner(System.in);

        System.out.print("What is your weight? ");
        weight = input.nextInt();
        System.out.print("What is your gender (M or F)? ");
        gender = input.next();
        System.out.print("How many ounces of alcohol did you have? ");
        drinks = input.nextInt();
        System.out.print("How long has it been since your last drink? ");
        hours = input.nextInt();

        ratio = gender.equals("M") ? 0.73 : 0.66;
        bac = ((drinks * 5.14) / (weight * ratio)) - (0.015 * hours);

        System.out.println("Your BAC is " + bac);
        if (bac < 0.12) {
            System.out.println("It is legal for you to drive.");
        } else {
            System.out.println("It is not legal for you to drive.");
        }
    }
}
