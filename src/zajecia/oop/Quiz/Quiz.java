package zajecia.oop.Quiz;

import zajecia.oop.Quiz.Question.MockQuestionsRepository;
import zajecia.oop.Quiz.Question.Question;
import zajecia.oop.Quiz.result.MockResultRepository;

/**
 * Created by RENT on 2017-04-25.
 */
public class Quiz {
    public static void main(String[] args) {
        MockQuestionsRepository questionsRepository=new MockQuestionsRepository();
        MockResultRepository resultRepository=new MockResultRepository();
        QuizInteface quizInteface= new QuizInteface();
        // int decision =0;
        //while {decision!=0)

        boolean gameFlag=true;
        while(gameFlag) {
            int decision = quizInteface.menu();
            switch (decision) {
                case 1:
                    String playerName = quizInteface.inserName();
                    quizInteface.beforStart();
                    Question[] questions = questionsRepository.getQuestions();
                    int correctAnswersCounter = 0;
                    for (int i = 0; i < questions.length; i++) {
                        boolean result = quizInteface.showQuestions(questions[i]);
                        if (result) {
                            quizInteface.correctAnswer();
                            correctAnswersCounter++;
                        } else {
                            quizInteface.incorrectAnswer();
                        }

                    }
                    quizInteface.showResult(playerName, correctAnswersCounter);
                break;

                case 2:
                    quizInteface.showTopResults(resultRepository.getTopResults(10));
                break;
                case 0:
                    gameFlag = false;
                break;
                default:
                    System.out.println("wrong decision");
            }
        }
    }



}
