package zajecia.oop.Quiz.Question;

/**
 * Created by RENT on 2017-04-25.
 */
public class MockQuestionsRepository implements QuestionsRepository{
    public Question[] getQuestions(){
        Question[] questions= new Question[3];
        String [] answers0={"22","32","54","42"};
        String [] answers1={"1","2","5","4"};
        String [] answers2={"Poznan","Moscow","Warsaw","Krakow"};
        questions[0]= new Question("Ile lat ma prezydent?",3,answers0);
        questions[1]= new Question("Ile jest 2*2?",3,answers1);
        questions[2]= new Question("Co jest stolica Wielkopolski?",1,answers2);
        return questions;
    }


}
