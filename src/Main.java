import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    Questions questions = new Questions(0);

    public static void main(String[] args) {

        Main main = new Main();
        main.addEntries();

        System.out.println("============================= Welcome to FlashCard Quiz App =============================");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Type \"start\" to start your quiz :) ");
        String userSelection = scanner.nextLine();

        if (userSelection.trim().equalsIgnoreCase("start")){
            main.userInteract(scanner);
        }

        scanner.close();


    }

    public void addEntries(){

        questions.addEntry("Who invented Airplane?", "Wright Brothers");
        questions.addEntry("What is the capital of France?", "Paris");
        questions.addEntry("5 + 3", "8");
        questions.addEntry("What color do you get when you mix red and blue", "Purple");
        questions.addEntry("Who wrote Romeo and Juliet?", "William Shakespeare");

    }

    public void userInteract(Scanner scanner){

        ArrayList<String> questionList = questions.getQuestion();
        int questionListSize = questions.getQuestion().size();

        ArrayList<String> answerList = questions.getAnswer();

        for (int i = 0; i < questionListSize; i++){

            System.out.println("\n" + questionList.get(i));
            String userAnswer=  scanner.nextLine();

            if (i == answerList.indexOf(userAnswer)){
                questions.score += 1;
                System.out.println("correct");
            } else {
                System.out.println("wrong");
            }

        }

        System.out.println("\nYou got " + questions.score + "/" + questionListSize);

    }

}