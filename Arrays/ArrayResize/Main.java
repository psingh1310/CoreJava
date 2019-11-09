package com.prashant;
//Resize the Array
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static int[] baseData = new int[10];
    public static void main(String[] args) {
        System.out.println("Enter the 10 numbers");
        getInput();
        printArray(baseData);
        resizeArray();
//        System.out.println("Enter the 12 numbers");
//        getInput();

        baseData[10] = 44;
        baseData[11] = 45;
        printArray(baseData);
    }

    private static void getInput(){
        for (int i = 0; i < baseData.length; i++){
            baseData[i] = scanner.nextInt();
        }
    }
    private static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
            System.out.println();
        }
    }

    private static void resizeArray(){
        int[] original = baseData;
        baseData = new int[12];
        for (int i = 0; i < original.length; i++){
            baseData[i] = original[i];
        }
    }
}
