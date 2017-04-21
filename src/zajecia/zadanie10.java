package zajecia;

import java.io.*;
import java.util.Scanner;

/**
 * Created by RENT on 2017-04-21.
 */
public class zadanie10 {
    public static void main(String[] args) throws IOException {
        //File Tekstowy = new File("C:\\Users\\RENT\\IdeaProjects\\SDA_java_podstawa\\Tekstowy.txt");
       // readFromFileTest(Tekstowy);
        File file= new File("C:\\Users\\RENT\\IdeaProjects\\SDA_java_podstawa\\file");
    }

    public static int[] readIntegersFromFiles(File file) throws FileNotFoundException {
        Scanner scanner= new Scanner(file);
        int size=getLine(file);

        int[]array = new int[size];
        for (int i = 0; i <array.length ; i++) {
            array[i]= scanner.nextInt();

        }
        return array;
    }
    public static int getLine(File file) throws FileNotFoundException{
        Scanner scanner= new Scanner(file);
        int counter=0;
        while (scanner.hasNext()){
            counter++;
            scanner.nextLine();

        }
        return counter;
    }
    public static void readFromFileTest(File tekstowy) throws FileNotFoundException {
        Scanner scanner = new Scanner(tekstowy);
        while(scanner.hasNext()){
            System.out.println(scanner.nextLine());
        }
    }

    public static void writeToFileTest(File file, String message) throws IOException{
        try (FileWriter fw=new FileWriter(file,true);
             BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter out = new PrintWriter(bw)){
            out.println(message);
        }
    }
}
