package zajecia;

import java.util.Scanner;

/**
 * Created by RENT on 2017-04-07.
 */
public class zajecia4 {
    public static void main(String[] args) {

      //  int day,month,year;
        //int []array ={1,9,2,8,3,7,4,6,5,15};
        /*Scanner scanner = new Scanner(System.in);

        System.out.println("Insert a day number");
        day = scanner.nextInt();
        System.out.println("Insert a month");
        month= scanner.nextInt();
        System.out.println("Insert year");
        year=scanner.nextInt();
        displayDate(13,2,19);
        displayDate(day,month,year);
        */
//      int minimum= minFromArray(array);
//       int maximum= maxFromArray(array);
//        System.out.println("Min "+minimum+ ", Max "+maximum);
//        int suma=sumOfElements(array);
//        double avg = avgOfArray(array);
//        System.out.println("Suma : "+ suma);
//        System.out.println("srednia : "+ avg);
//        int span= span(array);
//        System.out.println("Size of : "+ span);
//        reversArray(array);
       statistics(getArrayFromUser());
      //  getArrayFromUser();
     //   showArray(getArrayFromUser());
    }



    //**********************************************************

    public static void showArray(int [] array){
        for(int i=0; i< array.length;i++){
            if(i==array.length-1){
                System.out.print(array[i]);
            }else{
                System.out.print(array[i]+", ");
            }
        }

    }


    //****************************************

    public static int[]getArrayFromUser(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Insert size of new Array");
        int size=scanner.nextInt();
        int[] array = new int [size];
        for (int i=0;i<array.length;i++){
            System.out.println("Insert value of "+i + " element");
            array[i]=scanner.nextInt();
        }
        return  array;
    }

    //********************************************

    public static void  reversArray(int[]array){
        System.out.print("[");
        for(int i=array.length-1;i>=0;i--){
            System.out.print(array[i]);
            if(i!=0){
                System.out.print(", ");
            }

        }
        System.out.print("]");

    }


    //****************************************************
    public static void statistics (int[] array){
        System.out.println("Min "+ minFromArray(array) );
        System.out.println("Max " + maxFromArray(array));
        System.out.println("Sum " +sumOfElements(array) );
        System.out.println("Avg " + avgOfArray(array));
        System.out.println("Span " + spanOfArray(array));

        showArray(array);
        System.out.println();
        reversArray(array);
    }

    //*********************************************

    public static int abs(int number){
        if (number<0){
            number*=-1;
        }
        return number;
    }


    //********************************************

    public static int spanOfArray(int[]array){

//        int min=minFromArray(array);
//        int max=maxFromArray(array);
//        int wynik=0;
//        wynik=max-min;
//        int absWynik= abs(wynik);
//
//        return absWynik;
        return abs(maxFromArray(array)-minFromArray(array));



    }

    //***********************************************

    public static double avgOfArray(int [] array){
        int sum = sumOfElements(array);

        double avg=sum/(double)array.length;
        return avg;

    }

    //************************************************

    public static int sumOfElements(int [] array){
        int sum=array[0];
        for(int i=1;i<array.length;i++){
            sum+=array[i];
        }
        return sum;
    }



    //******************************************************
    public static int minFromArray(int [] array){

        int min=array[0];
        for (int i=1;i<array.length;i++){
            if(min >array[i]){
                min = array[i];
            }
        }
        return min;

    }
    //************************************************
    public static int maxFromArray(int[] array){
        int max= array[0];
        for (int i=1;i<array.length;i++){
            if(max<array[i]){
                max=array[i];
            }

        }
        return max;


    }


    //**********************************************************

    public static void displayDate(int day,int month,int year){

        if(day>=1 && day<=31 && month>0 && month<=12 && year>0 ){
            System.out.println("Actual date is: "+ day+"."+month+"."+year+"r");
        }else{
            System.out.println("Uncorrect data");
        }

    }


}
