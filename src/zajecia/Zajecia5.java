package zajecia;

import java.util.Scanner;

/**
 * Created by RENT on 2017-04-10.
 */
public class Zajecia5 {
    public static void main(String[] args) {
        zajecia4.displayArray(getArray(10));


        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert a number");
       int size = scanner.nextInt();
        getArray(size);
        displayArray(getArray(size));
    }








    //********************************************
    public static void displayArray(int [] array){
        System.out.println(array);
    }

    //********************************************

    public static int[] getArray(int value){
       //int size= value/2+value%2;
      //int[]  array=new int[value/2+ value % 2];
        int [] array=new int[value/2];
        for(int i=0;i<array.length;i++){
          array[i]= 2*i + value % 2 ;
        }
        return array;


    }

}

