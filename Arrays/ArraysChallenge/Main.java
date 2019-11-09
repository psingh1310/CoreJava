package com.prashant;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        int [] myIntegers = getIntegers(5);
        int [] sorted = sortIntegers(myIntegers);
        printArray(sorted);
    }

    public static int[] getIntegers(int number){
        System.out.println("Enter the " +number+ " Integer values\r");
        int values[] = new int[number];
        for (int i = 0; i < values.length; i++){
            values[i] = scan.nextInt();
        }
        return values;
    }

    public static void printArray(int array[]){
        for (int i = 0; i < array.length; i++){
            System.out.println("Elements " +i + " contains "+ array[i]);
        }
    }
   //creating the copy of the arrays that is passed
    public static int[] sortIntegers(int array[]){
//        int[] sortedArray = new int[array.length];
//        for (int i = 0; i < array.length; i++){
//            sortedArray[i] = array[i];
//        }

        //creating copy of array using the inbuilt function

        int[] sortedArray = Arrays.copyOf(array,array.length);

        boolean flag = true;
        int temp;
        while (flag){
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++){
                if (sortedArray[i] < sortedArray[i + 1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }
}
