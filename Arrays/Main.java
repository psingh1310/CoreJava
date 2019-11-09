package com.prashant;

import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

	// int [] myIntArray = new int[5];
//	 myIntArray[1] = 20;
//	 myIntArray[2] = 40;
//	 myIntArray[4] = 60;

//     int [] myIntArray = {10,20,30,40,50};
//
//     for (int i = 0; i < myIntArray.length; i++) {
//         System.out.println(myIntArray[i]);
//     }


//     int [] myArrayList = new int[10];
//     for (int i = 0; i < myArrayList.length; i++){
//         myArrayList[i] = i*10;
//     }
////   for (int i = 0; i < myArrayList.length; i++){
////       System.out.println("Elements " +i + " value is " +myArrayList[i]);
////   }
//
//        printArray(myArrayList); //method calling
//
//    }
//
//    public static void printArray(int arr[]){
//
//           for (int i = 0; i < arr.length; i++){
//       System.out.println("Elements " +i + " value is " +arr[i]);
//   }

        int[] myIntegers = getIntegers(5);

        for (int i = 0; i < myIntegers.length; i++){
            System.out.println("Elements " +i + " typed value was "+myIntegers[i]);
        }

        //printing the average
        System.out.println("The average is: " +getAverage(myIntegers));


    }

    //return type is array (int[])
    public static int[] getIntegers(int number){
        System.out.println("Enter " +number + " Integer values.\r");
        int[] values = new int[number];  //creating array of five integers
        for (int i = 0; i < values.length; i++){
            values[i] = scan.nextInt();
        }
        return values;  //returning the array
    }

    public static double getAverage(int[] array){
        int sum = 0;
        for (int i = 0; i <array.length; i++){
            sum += array[i];
        }
        return (double) sum / (double) array.length;
    }
}
