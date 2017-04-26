package zajecia.oop.Quiz.result;

/**
 * Created by RENT on 2017-04-26.
 */
public class TEST {
    public static void main(String[] args) {
        FileResultsRepository repository = new FileResultsRepository("C:\\Users\\RENT\\IdeaProjects\\SDA_java_podstawa\\Results.txt");
        Result[] allResults = repository.getAllResults();
        repository.add(new Result("Zbyszek",7));
        Result[] allResults1 =repository.getAllResults();
        Result[] topResults=repository.getTopResults(10);
    }
}
