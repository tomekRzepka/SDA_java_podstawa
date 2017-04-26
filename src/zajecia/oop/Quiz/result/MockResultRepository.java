package zajecia.oop.Quiz.result;

/**
 * Created by RENT on 2017-04-25.
 */
public class MockResultRepository {

    private Result[] result;
    private int resultsCouter;

    public MockResultRepository(){
        this.resultsCouter=0;
        this.result= new Result[100];
        addNewResult( new Result("Andrzej",3));
        addNewResult(new Result("Jan",2));

    }
    public Result [] getAllResults(){
        Result [] resultToReturn = new Result[resultsCouter];

            for (int i = 0; i <resultsCouter ; i++) {
                resultToReturn[i]=result[i];
            }

        return result;
    }
    public Result[] getTopResults(int n){
        Result[] resultsToReturn= new Result[n];
        int loopSize=n<resultsCouter ?n :resultsCouter;
        for (int i = 0; i <loopSize ; i++) {
            resultsToReturn[i]=result[i];
        }
        return resultsToReturn;
    }
    public void addNewResult(Result result){
        this.result[resultsCouter]=result;
        resultsCouter++;
    }
}
