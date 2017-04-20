package zajecia;

import java.util.Random;

/**
 * Created by RENT on 2017-04-20.
 */
public class zajecia9 {
    public static void main(String[] args) {

        System.out.println(multiplyDigits(1234));


    }
    public static double[][] avgTwoMatrix(int [][] matrix1,int [][] matrix2) {
        int rows = matrix1.length;
        int columns = matrix1[0].length;
        double[][] avgMatrix = new double[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                avgMatrix[i][j] = (matrix1[i][j] + matrix2[i][j]) / 2.0;

            }
        }
        return avgMatrix;
    }

    public static double avgMatrix(int [][] matrix){
        int sum=sumMatrix(matrix);
        int rows=matrix.length;
        int columns=matrix[0].length;
        return  sum/(double)(rows*columns);

    }


    public static int sumMatrix(int[][]matrix){

        int sum=0;
        int rows=matrix.length;
        int columns=matrix[0].length;
        for (int i = 0; i <rows; i++) {
            for (int j = 0; j <columns ; j++) {
                sum+=matrix[i][j];

            }

        }
        return sum;
    }


    public static int[][] randomMatrix (int size, int bounds , int offset){
        Random random = new Random();

        int[][] matrix = new int [size][size];
        for (int i = 0; i <size ; i++) {
            for (int j = 0; j <size ; j++) {
                matrix[i][j]=random.nextInt((bounds)+offset);
            }

        }
        return matrix;
    }

    public static int multiplyDigits(int number){
        int multi=1;
        while(number !=0){
            multi *=number%10;
            number /=10;
        }
        return multi;
    }

    public static void printStringStatistic(int [] array){

        for (int i = 0; i <array.length ; i++) {
            while ( array[i]!=0){
                System.out.print((char)(i+97));
                array[i]--;
            }


        }

    }

    public static int[] stringStatistics (String message) {

                char [] charArray= message.toCharArray();
                int [] alphabetArray= new int[26];
        for (int i = 0; i <charArray.length ; i++) {
            char charInLowerCase = toLowerCase(charArray[i]);
            if(charArray[i]>=97 && charArray[i]<= 122){
                alphabetArray[charInLowerCase-97]++;
            }


        }

        return alphabetArray;



    }

    public static int find(String message, char sentence ){
        char [] charArray = message.toCharArray();

        int i=0;
        while (charArray[i] == sentence && i < charArray.length) {
            i++;
        }


        return i==charArray.length ? -1:i;



    }

//    public static  int find(String message, String sentence ){
//        char [] charArray = message.toCharArray();
//        char [] sentenceArray = sentence.toCharArray();
//        int position = 0;
//
//        while()
//

//        }
//
//    }
    public static  int countAll(String message, char sentence ) {
        char[] charArray = message.toCharArray();
        int counter=0;
        for (int i = 0; i <charArray.length ; i++) {
            if (charArray[i] == sentence) {
                counter++;

            }

        }

        return counter;

    }
        public static char toLowerCase(char a) {
            if(a>=65 && a<=90){
                a+=32;
        }
        return a;
        }
}

