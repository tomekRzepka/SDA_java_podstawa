package zajecia.oop.Quiz;

/**
 * Created by RENT on 2017-04-25.
 */
public class Quiz {
    public static void main(String[] args) {
        MockQuestionsRepository questionsRepository=new MockQuestionsRepository();
        QuizInteface quizInteface= new QuizInteface();

        int decision = quizInteface.menu();
        if(decision==1){
            String playerName = quizInteface.inserName();
            quizInteface.beforStart();
            Question[] questions = questionsRepository.getQuestions();
            int correctAnswersCounter=0;
            for (int i = 0; i <questions.length ; i++) {
                boolean result = quizInteface.showQuestions(questions[i]);
                if(result){
                    quizInteface.correctAnswer();
                    correctAnswersCounter++;
                }else{
                    quizInteface.incorrectAnswer();
                }

            }
            quizInteface.showResult(playerName,correctAnswersCounter);


        }else if (decision==2){
            System.out.println("Result not yet supported");

        }else if (decision==3){
            System.out.println("End Game");
        }


    }



}
