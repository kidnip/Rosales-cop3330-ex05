package org.example;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Rosales Jeremy
 */
public class Math
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        Number a = new Number();
        Number b = new Number();

        System.out.print( "What is the first number? " );
        a.setC(input.next());
        System.out.print( "What is the second number? " );
        b.setC(input.next());

        int x = Integer.parseInt(a.getC());
        int y = Integer.parseInt(b.getC());

        System.out.printf("%d + %d = %d\n", x, y, x+y);
        System.out.printf("%d - %d = %d\n", x, y, x-y);
        System.out.printf("%d * %d = %d\n", x, y, x*y);
        System.out.printf("%d / %d = %d", x, y, x/y);

    }
}
