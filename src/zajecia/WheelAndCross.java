package zajecia;

import java.util.Scanner;

/**
 * Created by RENT on 2017-04-20.
 */
public class WheelAndCross {
    public static void main(String[] args) {
        char [][]gameBoard={{'1','2','3'},{'4','5','6'},{'7','8','9'}};
        Scanner scanner=new Scanner(System.in);
        displayBoard(gameBoard);
        for (int i = 0; i <9 ; i++) {

            System.out.println("insert sign position");
            int position=scanner.nextInt();
            int[]positions=convertPosition(position);
            gameBoard[positions[0]][positions[1]]=i%2==0?'X':'O';
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();

        }
        System.out.println("End of game");
        displayBoard(gameBoard);

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
