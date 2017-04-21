package zajecia;

import java.util.Scanner;

/**
 * Created by RENT on 2017-04-20.
 */
public class WheelAndCross {
    public static void main(String[] args) {
        char[][] gameBoard = {{'1', '2', '3'}, {'4', '5', '6'}, {'7', '8', '9'}};
        Scanner scanner = new Scanner(System.in);
        int i=0;
        while (!checkIsGameEnded(gameBoard,i)){

            displayBoard(gameBoard);
            int position = getPositionFromUser(gameBoard);
            int [] positions = convertPosition(position);
            gameBoard[positions[0]][positions[1]] = i % 2 == 0 ? 'X' : 'O';
            i++;
        }
        System.out.println("End of game");
        displayBoard(gameBoard);

    }

    public static int getPositionFromUser(char[][] gameBoard) {
        Scanner scanner =new Scanner(System.in) ; int i =0 ; boolean inputFromUserFlag =false ;
        int position = 0;
        while (!inputFromUserFlag) {


            System.out.println("insert sign position");
             position = scanner.nextInt();
            inputFromUserFlag = validatePositionFromUser(position, gameBoard);
            if (!inputFromUserFlag) {
                System.out.println("invalid date");
            }
        }
        return position;
    }

    public static boolean checkIsGameEnded(char[][] gameBoard , int gameStep) {
        return  checkRows(gameBoard) || checkColumns(gameBoard) || checkDiagonals(gameBoard)|| !(gameStep< 9) ;

    }

    public static boolean checkRows(char[][] gameBoard) {
        boolean end = false;
        int i = 0;
        while (!end && i < gameBoard.length) {
            end = gameBoard[i][0] == gameBoard[i][1] && gameBoard[i][1] == gameBoard[i][2];

            i++;
        }
        return end;

    }
    public static boolean checkColumns(char [][] gameBoard){
        boolean end=false;
        int i=0;
        while(!end&&i<gameBoard.length){
            if(gameBoard[0][i]==gameBoard[1][i]&&gameBoard[1][i]==gameBoard[2][i]){
                end = true;
            }
            i++;
        }
        return end;


    }
    public static boolean checkDiagonals(char [][] gameBoard){
        return !isFieldEmpty(gameBoard,1,1)&&(checkFirstDiagonal(gameBoard)||checkFirstSecond(gameBoard));
//        boolean end=false;
//        int i=0;
//        while(i<gameBoard.length && end==false){
//            if(gameBoard[0][0]==gameBoard[1][1]&&gameBoard[1][1]==gameBoard[2][2]||gameBoard[2][0]==gameBoard[1][1]&&gameBoard[1][1]==gameBoard[0][2]){
//                end = true;
//            }
//            i++;
//
//        }
//        return end;

    }

    public static boolean checkFirstDiagonal(char[][]gameBoard){
        return (gameBoard[0][0]==gameBoard[1][1]&&gameBoard[0][0]==gameBoard[2][2]);
    }
    public static boolean checkFirstSecond(char[][]gameBoard){
        return (gameBoard[0][2]==gameBoard[1][1]&&gameBoard[0][0]==gameBoard[2][0]);
    }

    public static boolean validatePositionFromUser(int positionFromUser, char[][]gameboard){
        int[] ints =convertPosition(positionFromUser);
        return(positionFromUser>0&&positionFromUser<10&&isFieldEmpty(gameboard,ints[0],ints [1]));
    }
    public static boolean isFieldEmpty(char[][]gameBoard,int i, int j){
        return !(isFieldEmpty(gameBoard, i, j));
    }


    public static int [] convertPosition(int positionFromUser){
        int [] position = new int[2];
        position[0]=(positionFromUser-1)/3;
        position[1]=(positionFromUser-1)%3;
        return position;
    }

    public static void displayBoard(char[][] gameBoard) {

        for (int i = 0; i < gameBoard.length; i++) {
            for (int j = 0; j < gameBoard[0].length; j++) {
                System.out.print(gameBoard[i][j]);
                if (j != gameBoard[0].length - 1) {
                    System.out.print("|");
                }
            }
            if (i != gameBoard.length - 1) {
                System.out.print("\n-----\n");
            }

        }
        System.out.println();
    }




}
