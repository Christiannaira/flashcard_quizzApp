import java.util.Scanner;

public class Main {

    Questions questions = new Questions(0);

    public static void main(String[] args) {

        System.out.println("============================= Welcome to FlashCard Quiz App =============================");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Type \"start\" to start your quiz :) ");
        String userSelection = scanner.nextLine();

        if (userSelection.trim().equalsIgnoreCase("start")){
            System.out.println("begin");
        }

        Main main = new Main();
        main.addEntries();
        main.getEntries();

    }

    public void addEntries(){

        questions.addEntry("Who invented Airplane?", "Wright Brothers");
        questions.addEntry("What is the capital of France?", "Paris");
        questions.addEntry("5 + 3", "8");
        questions.addEntry("What color do you get when you mix red and blue", "Purple");
        questions.addEntry("Who wrote Romeo and Juliet?", "William Shakespeare");

    }

    public void getEntries(){

        System.out.println(questions.getQuestion());
        System.out.println(questions.getAnswer());

    }

}