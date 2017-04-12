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

        //numberOfDigits(354);
     //zajecia4.displayArray(numberToArray(356));


    }
    //**********************************************************************
    public static int arrayToNumber (int[]array){
//        int i=0;
        int sum=0;
        int valuetoMultiply=1;
//        while(i<array.length){
//            sum+= array[array.length-1-i]*valuetoMultiply;
//            valuetoMultiply*=10;
//            i++;
//         }

        for (int i =0;i<array.length;i++){
            sum+= array[array.length-1-i]*valuetoMultiply;
            valuetoMultiply*=10;
        }
            return sum;

    }


    //************************************************************
    public static int[]numberToArray (int number){

        int []array = new int[numberOfDigits(number)];
        int i=0;

        while(i<array.length){
            array[array.length-1-i]=number%10;
            number/=10;

            i++;

        }
//        for(int j=0;j<array.length;j++){
//            array[array.length-1-i]=number%10;
//            number/=10;
//        }

        return array;
    }


    //**************************************************************
    public static int sumOfRandom(int value){
        Random random = new Random();
        int sum=0;
        int i=0;
        while (sum <value){
            sum+= random.nextInt(30)-10;
            i++;
        }
        return i;

    }


    //**************************************************************

    public static int sumOfDigits(int number){
        int sum=0;
        while(number !=0){
            sum +=number%10;
            number /=10;
        }
        return sum;
    }

    //*************************************************************
    public static int numberOfDigits(int number){
        int position=0;
        while(number>0){
            number/=10;
            position++;
        }

        return position;
    }

    //**************************************************************
    public static int game(){
        Scanner scanner= new Scanner(System.in);
        Random random = new Random();
        int bound=100;
        int offset=0;
        int number= random.nextInt(100);
        int userNumber=-1;
        int i=0;
        while(userNumber!=number){
            System.out.println("Insert a number");
            userNumber= random.nextInt(bound-offset)+offset;
            System.out.println(userNumber);
            if(userNumber>number){
                System.out.println("It's too big. Try again!!");
                bound=userNumber;
            }else if(userNumber<number){
                System.out.println("It's too small. Try again!!");
                offset=userNumber;
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
