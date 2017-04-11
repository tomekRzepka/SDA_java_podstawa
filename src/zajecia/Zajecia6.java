package zajecia;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by RENT on 2017-04-11.
 */
public class Zajecia6 {
    public static void main(String[] args) {
//        int number=5;
//        int counter=0;
//        Random random = new Random();
//        int number= random.nextInt();
//        while (number>0 ){
//            //System.out.println("hello World");
//            counter++;
//            number -=random.nextInt(3);
//        }
//        System.out.println(counter);
        //printPowersOf2(35);
       // printPowersOf2(number);
        //int [] array={1,2,3,4,5,6,7,8,9};
        //int number= 30;
        //sumUntil(array,number);
        //game();

        numberOfDigits(354);
    }
    //**************************************************************

//    public static int sumOfDigits(int number){
//        int counter=0;
//        while(number !=0){
//            number /=10;
//            counter++;
//        }
//    }

    //*************************************************************
    public static int numberOfDigits(int number){
        int position=0;
        while(number!=0){
            number/=10;
            position++;
        }
        System.out.println(position);
        return position;
    }

    //**************************************************************
    public static int game(){
        Scanner scanner= new Scanner(System.in);
        Random random = new Random();
        int number= random.nextInt(100);
        int userNumber=-1;
        int i=0;
        while(userNumber!=number){
            System.out.println("Insert a number");
            userNumber= random.nextInt(100);
            System.out.println(userNumber);
            if(userNumber>number){
                System.out.println("It's too big. Try again!!");
            }else if(userNumber<number){
                System.out.println("It's too small. Try again!!");
            }
            i++;

        }

        System.out.println("Brawo!! Liczba prób " + i);
        return i;
    }


    //**************************************************************
    public static boolean avgUntil(int [] array, int avg){
        int arraySum=array[0];
        int i=1;
        while (arraySum/i<avg&& i<array.length){
            arraySum+=array[i];
            i++;
        }
        return arraySum/i>=avg;
    }



    //************************************************************
    public static boolean sumUntil(int [] array, int sum){
        int arraySum=0;
        int i=0;
        while (arraySum<sum&&i<array.length){
            arraySum+=array[i];
            i++;

        }

       return arraySum >= sum;

    }


    //****************************************************************

    public static void printPowersOf2(int number){
        int value =1;
        System.out.println(value);
        while (value<number/2) {
            value *= 2;
            System.out.println(value);
        }

    }

}
