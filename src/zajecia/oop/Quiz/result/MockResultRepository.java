package zajecia.oop.Quiz.result;

/**
 * Created by RENT on 2017-04-25.
 */
public class MockResultRepository {

    private Result[] result;
    public MockResultRepository(){
        result= new Result[2];
        result[0]= new Result("Andrzej",3);
        result[1]= new Result("Jan",2);
    }
    public Result [] getAllResults(){

        return result;
    }
    public Result[] getTopResults(int n){
        Result[] resultsToReturn= new Result[n];
        int loopSize=n<result.length?n:result.length;
        for (int i = 0; i <loopSize ; i++) {
            resultsToReturn[i]=result[i];
        }
        return resultsToReturn;
    }
}
