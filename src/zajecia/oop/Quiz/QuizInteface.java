package zajecia.oop.Quiz;

import com.sun.org.apache.xpath.internal.SourceTree;
import zajecia.oop.Quiz.Question.Question;
import zajecia.oop.Quiz.result.Result;

import java.util.Scanner;

/**
 * Created by RENT on 2017-04-25.
 */
public class QuizInteface {
    private Scanner scanner;

    public QuizInteface(){
        this.scanner=new Scanner(System.in);
    }

    public int menu(){

        System.out.println("1.START");
        System.out.println("2.WYNIK");
        System.out.println("0.KONIEC");
        int answer = scanner.nextInt();
        this.scanner.nextLine();
        return answer;
    }

    public String inserName(){
        System.out.println("Insert your name :");
        return this.scanner.nextLine();
    }
    public void beforStart(){
        System.out.println("Press ENTER to start");
        this.scanner.nextLine();
    }

    public boolean showQuestions(Question question){

        System.out.println(question.getQuestion());
        String[] possibleAnswers = question.getAnswer();
        for (int i = 0; i < possibleAnswers.length ; i++) {
            System.out.println((i+1)+". "+ possibleAnswers[i]);
        }
        int answerFromUser=scanner.nextInt();
        scanner.nextLine();
        return question.checkAnswer(answerFromUser-1);
    }
    public void correctAnswer(){
        System.out.println("Correct answer!");
        scanner.nextLine();
    }
    public void incorrectAnswer(){
        System.out.println("Wrong answer");
        scanner.nextLine();
    }
    public void showResult(String name, int result){
        System.out.println("Congratulation "+name+"! You finished game with score: "+result);
    }
    public  void showResults(Result[] results){
        System.out.println("Hall of fame: ");
        for (int i = 0; i <results.length ; i++) {
            System.out.println((i+1)+". "+results[i].getPlayerName()+"\t"+results[i].getResult());

        }
        scanner.nextLine();
    }

}
