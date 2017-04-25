package zajecia.oop.Quiz.result;

/**
 * Created by RENT on 2017-04-25.
 */
public class MockResultRepository {
    public Result [] getAllResults(){
        Result[]mockResults= new Result[2];
        mockResults[0]= new Result("Andrzej",3);
        mockResults[1]= new Result("Jan",2);
        return mockResults;
    }
}
