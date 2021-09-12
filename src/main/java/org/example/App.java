package org.example;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Christian Williams
 */

public class App
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        final int legalAge = 16;

        System.out.println("What is your age? ");
        int age = input.nextInt();

        System.out.println((age >= 16) ? "You are old enough to legally drive" : "You are not old enough to legally drive.");
    }
}