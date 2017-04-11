package zajecia;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by RENT on 2017-04-10.
 */
public class Zajecia5 {
    public static void main(String[] args) {
        //zajecia4.displayArray(getArray(10));


//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Insert a number");
//       int size = scanner.nextInt();
//        getArray(size);
//        displayArray(getArray(size));

        //randomTest();

//        Scanner scanner=new Scanner(System.in);
//        System.out.println("Insert size of array:");
//        int sizeArray =scanner.nextInt();
//        System.out.println("Insert size of bound:");
//        int boundArray = scanner.nextInt();
//        System.out.println("Insert size of offset:");
//        int offsetArray = scanner.nextInt();
//       // getRandomArray(10,5,3);
//
//        zajecia4.statistics(getRandomArray(sizeArray,boundArray,offsetArray));
//        System.out.println();
//        System.out.println();
//        zajecia4.statistics(getRandomArray(sizeArray,boundArray));
//        System.out.println();
//        System.out.println();
//        zajecia4.statistics(getRandomArray(sizeArray));
//        printSquare(5);
//        System.out.println();
//        printRectangle(10,3);
//        System.out.println();
        // printTriangle(5);
        //printMatrixOfNumber(5);
        // printMatrixOfBool(5);
      //  printEmptySquare(5);
        //System.out.println();
        //printChessBoard(5);
        //System.out.println();
       // printTree(5);
        //homeWork();
        lineOfNumbers(5);
    }
    //************************************************



    //************************************************
    public static void lineOfNumbers(int value){
        for (int i = 0; i < value; i++) {
            for (int j = 0; j < i  ; j++) {
                System.out.print("  ");

            }
            System.out.println(i+1);

        }
    }


    //************************************************
    public static void homeWork(){
        Random random = new Random();
        int size= random.nextInt(10)+15;
        getArray(size);
        zajecia4.statistics(getArray(size));
        printTree(size-12);
    }

    //**********************************************
    public static void printTree(int a) {
        for (int i = 0; i < a; i++) {

            for (int j = 0; j < a - i - 1; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();


        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a-1  ; j++) {
                System.out.print("  ");

            }
            System.out.println("*");

        }
    }

    //********************************************************************
    public static int[] getRandomArray(int size) {
        return getRandomArray(size, Integer.MAX_VALUE);
    }


    //********************************************************************
    public static int[] getRandomArray(int size, int bound, int offset) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(bound) + offset;
        }
        return array;
    }
    //**********************************************************


    public static int[] getRandomArray(int size, int bound) {
        return getRandomArray(size, bound, 0);

    }
    //****************************************************************

    public static void randomTest() {
        Random random = new Random();
        System.out.println(random.nextInt());
        System.out.println(random.nextInt(10) - 5);
        System.out.println(random.nextInt(15) + 5);
    }

    //********************************************
    public static void displayArray(int[] array) {
        System.out.println(array);
    }

    //********************************************

    public static int[] getArray(int value) {
        //int size= value/2+value%2;
        //int[]  array=new int[value/2+ value % 2];
        int[] array = new int[value / 2];
        for (int i = 0; i < array.length; i++) {
            array[i] = 2 * i + value % 2;
        }
        return array;

    }

    //*********************************************************************
    public static void printSquare(int a) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //***************************************************
    public static void printRectangle(int a, int b) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //**************************************************
    public static void printTriangle(int a) {
        for (int i = 1; i <= a; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //********************************************************
    public static void printMatrixOfNumber(int a) {
        int number = 1;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                // System.out.print(number+"  ");        -  zadanie domowe na podstawie ilości znakow to dodajemy ilosc spacji
                //number++;
                System.out.print((a * i) + (j + 1) + "  ");
            }
            System.out.println();
        }
    }

    //********************************************************
    public static void printMatrixOfBool(int a) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if (i == j) {
                    System.out.print(1 + " ");
                } else {
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }
    }

    //********************************************************
    public static void printEmptySquare(int a) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if ((i == 0) || i == (a - 1)||(j == 0) || j == (a - 1)) {
                    System.out.print(1);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    //********************************************************
    public static void printChessBoard(int a){
        for(int i=0;i<a;i++){
            for(int j=0;j<a;j++) {
                if ((i+j)%2==0) {
                    System.out.print(1);
                } else{
                    System.out.print(0);
            }
        }
        System.out.println();
    }
}
}



