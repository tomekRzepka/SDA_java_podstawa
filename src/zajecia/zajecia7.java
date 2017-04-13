package zajecia;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by RENT on 2017-04-12.
 */
public class zajecia7 {
    public static void main(String[] args) {
//       int [][] matrixStatic= {{1,3,4,5,6},
//                                {3,4,5,6,7}};
//        safeToMatrixTest();
//        printMatrix(safeToMatrixTest());
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Insert number of rows: ");
//        int rows=scanner.nextInt();
//        System.out.println("Insert number of columns: ");
//        int columns=scanner.nextInt();
//        printMatrix(fillWithRandomNumbers(rows,columns));
//        printMatrix(fillWithNumbersFromUser(4,5));
//        printMatrix(fillWithRandomNumbers(3,4));
        //  printMatrix(addTwoArrays(fillWithRandomNumbers(3,4),fillWithRandomNumbers(3,4)));
        // printMatrix(multiplyBy(fillWithRandomNumbers(3,4),4));
        //System.out.println( sumOfElements(fillWithRandomNumbers(3,3)));
        //  System.out.println(indexOfHighestSum(fillWithRandomNumbers(6,3)));
        //printMatrix(flip(fillWithNumbersFromUser(rows,columns)));
      //  printMatrix(biggerValues(fillWithRandomNumbers(3, 3), fillWithRandomNumbers(3, 3)));
       // System.out.println(maxValue(fillWithRandomNumbers(3,3)));
       // printMatrix(product(fillWithRandomNumbers(3,2),fillWithRandomNumbers(2,3)));
        int [][] matrix = fillWithRandomNumbers(3,3);
        for (int i = 0; i <100 ; i++) {
            matrix=biggerValues(matrix,fillWithRandomNumbers(3,3));
            if(i%10==0){
                printMatrix(matrix);
            }

        }
        printMatrix(matrix);


    }


    //***************************Mnożenie macierzy***********************************
    public static int [][]product(int [][] matrix1,int [][]matrix2) {
        printMatrix(matrix1);
        System.out.println();
        printMatrix(matrix2);
        System.out.println();

        int rows = matrix1.length;
        int columns = matrix2[0].length;
        int[][] newMatrix = new int[rows][columns];
        if(matrix1[0].length==matrix2.length){
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                for (int k = 0; k < matrix2.length; k++) {
                    newMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                }

            }

        }}else{
            System.out.println("You cannot myltiply this matrix");
        }
        return newMatrix;
    }

    //********************************************************
    public static int maxValue(int[][] matrix) {
        printMatrix(matrix);
        System.out.println();
        int max = matrix[0][0];
        int rows = matrix.length;
        int columns = matrix[0].length;
        int[][] biggerValuesMatrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }

        }
        return max;
    }

    //**********************************************************************
    public static int[][] biggerValues(int[][] matrix1, int[][] matrix2) {
        printMatrix(matrix1);
        System.out.println();
        printMatrix(matrix2);
        System.out.println();
        int rows = matrix1.length;
        int columns = matrix1[0].length;
        int[][] biggerValuesMatrix = new int[columns][rows];
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                if (matrix1[i][j] > matrix2[i][j]) {
                    biggerValuesMatrix[i][j] = matrix1[i][j];
                } else {
                    biggerValuesMatrix[i][j] = matrix2[i][j];
                }


            }
        }
        return biggerValuesMatrix;


    }


    //**********************************************************************
    public static int[][] flip(int[][] matrix) {
        printMatrix(matrix);
        System.out.println();
        int rows = matrix.length;
        int columns = matrix[0].length;
        int[][] flipMatrix = new int[columns][rows];
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                flipMatrix[i][j] = matrix[j][i];

            }
        }
        return flipMatrix;
    }


    //*********************************************************************

    public static int indexOfHighestSum(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int sum = 0;
        int oldSum = 0;
        int index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sum += matrix[i][j];
                if (sum > oldSum) {
                    index = i;
                } else {
                    oldSum = sum;

                }
            }
        }
        return index;
    }


    //*******************************************************************
    public static int sumOfElements(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int sum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }


    //********************************************************************
    public static int[][] multiplyBy(int[][] matrix, int value) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int[][] multiByMatrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                multiByMatrix[i][j] = (matrix[i][j]) * value;

            }
        }
        return multiByMatrix;

    }

    //*****************************************************************************
    public static int[][] fillWithNumbersFromUser(int rows, int columns) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Number [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
                System.out.println();
            }
        }
        return matrix;

    }

    public static int[][] addTwoMatrix(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int columns = matrix1[0].length;
        int[][] sumMatrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sumMatrix[i][j] = (matrix1[i][j]) + (matrix2[i][j]);
            }
        }
        return sumMatrix;
    }


    //******************************************************************

    public static int[][] fillWithRandomNumbers(int rows, int columns) {
        Random random = new Random();
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = random.nextInt((30) - 15);

            }
        }
        return matrix;

    }

    //****************************************************************

    public static int[][] safeToMatrixTest() {
        int rows = 2;
        int columns = 4;
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = i + j;
            }
        }
        return matrix;

    }

    //***********************************************************
    public static void printMatrix(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        for (int i = 0; i < rows; i++) {
            System.out.print("|");
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");//read
                if (j != columns - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("|");
        }

    }
}

