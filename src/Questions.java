import java.util.ArrayList;

public class Questions {

    int score;
    private ArrayList<String> questions = new ArrayList<>();
    private ArrayList<String> answers = new ArrayList<>();

    public Questions(int score){
        this.score = score;
    }

    public void addEntry(String question, String answer) {
        this.questions.add(question);
        this.answers.add(answer);
    }

    public ArrayList<String> getQuestion(){
        return questions;
    }

    public ArrayList<String> getAnswer(){
        return answers;
    }

}
