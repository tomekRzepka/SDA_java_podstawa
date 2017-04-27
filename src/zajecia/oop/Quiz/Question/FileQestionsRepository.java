package zajecia.oop.Quiz.Question;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by RENT on 2017-04-27.
 */
public class FileQestionsRepository implements QuestionsRepository {
    private String pathToFile;

    private File fileWithResults;

    public FileQestionsRepository(String pathToFile){
        this.pathToFile=pathToFile;
        this.fileWithResults=new File(pathToFile);
    }
    public int getSize(){
        int counter=0;
        try {
            Scanner scanner = new Scanner(fileWithResults);

            while(scanner.hasNextLine()){
                counter++;
                scanner.nextLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return counter/6;
    }

    @Override
    public Question[] getQuestions() {
        Question[] qestions= null;
        try {
            Scanner scanner = new Scanner(fileWithResults);
            qestions=new Question[getSize()];
            int index=0;
            while(scanner.hasNextLine()){
                String questionText = scanner.nextLine();           // pobiera linie
                String [] answers=new String[4];                    //pobrać odpowiedzi
                for (int i = 0; i <answers.length ; i++) {
                    answers[i]=scanner.nextLine();

                }
                int correctAnswer=scanner.nextInt();                // pobrac poprawna odp
                scanner.nextLine();
                qestions[index]=map(questionText,answers,correctAnswer);
                index++;
             }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return qestions;
    }

    public Question map(String qestionTex, String[] answers,int correctAnswer){
        return new Question(qestionTex,correctAnswer,answers);
    }

}
