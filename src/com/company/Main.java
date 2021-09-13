/*
 *  UCF COP3330 Fall 2021 Assignment 15 Solution
 *  Copyright 2021 Diego Santiago
 */


package com.company;
import java.util.Scanner;
import java.text.*;

public class Main {

    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        System.out.print("What is the password? ");
        String s1 = x.nextLine();

        if(s1.equals("abc$123"))
        {
            System.out.println("Welcome!");
            System.exit(0);
        }else{
            System.out.println("I don't know you");
            System.exit(0);
        }
        System.exit(0);
    }
}