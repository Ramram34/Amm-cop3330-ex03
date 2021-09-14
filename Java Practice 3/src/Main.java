/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Rami Amm
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char mark = '"';

        Scanner sc = new Scanner(System.in);
        System.out.println("What is the quote?");
        String x = sc.nextLine();

        System.out.println("Who said it?");
        String y = sc.nextLine();

        System.out.println(y + " said, " + mark + x + mark);
    }
}
