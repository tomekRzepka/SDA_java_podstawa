package zajecia.oop.Quiz;

import java.util.Arrays;

/**
 * Created by RENT on 2017-04-25.
 */
public class Question {
    private String question;
    private int correctAnsewr;
    private String[] answer;

    public Question(String question,int correctAnsewr,String[]answer){
        this.question=question;
        this.correctAnsewr=correctAnsewr;
        this.answer=answer;
    }

    public boolean checkAnswer(int answer){
        return this.correctAnsewr==answer;
    }
    public String[] getAnswer() {
        return answer;
    }

    public String getQuestion() {

        return question;
    }

    @Override
    public String toString() {
        return "Question{" +
                "question='" + question + '\'' +
                ", answer=" + Arrays.toString(answer) +
                '}';
    }
}
