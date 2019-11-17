package com.prashant;

import java.util.Scanner;

public class MyConsole {
    private static Scanner scanner = new Scanner(System.in);
    public static void print(Object obj){
        System.out.println(obj);
    }
    public static String getString(String question){
        print(question);
        return scanner.nextLine();
    }
    public static int getNumber(String question){
        return Integer.parseInt(getString(question));
    }
    public static double getDouble(String question){
        print(question);
        return scanner.nextDouble();
    }
}
