    /*
     *  UCF COP3330 Fall 2021 Assignment 5 Solution
     *  Copyright 2021 Blake Baez
     */
    package org.example;
import java.util.Scanner;

public class App 
{
    
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("What is the first number? ");
            String a = input.nextLine();
            System.out.print("What is the second number? ");
            String b = input.nextLine();

            int f = Integer.parseInt(a);
            int s = Integer.parseInt(b);

            System.out.println(f + " + " + s + " = " + (f+s) + "\r\n" + f + " - " + s + " = " + (f-s) + "\r\n" + f + " * " + s + " = " + (f*s) + "\r\n" + f + " / " + s + " = " + (f/s));
        }


    }