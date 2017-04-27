package zajecia.oop.Quiz.result;

/**
 * Created by RENT on 2017-04-27.
 */
public interface ResultsRepository {
     Result[] getAllResults();
     Result[] getTopResults(int n);
     void add(Result result);
}
