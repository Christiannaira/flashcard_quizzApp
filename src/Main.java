import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("============================= Welcome to FlashCard Quiz App =============================");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Type \"start\" to start your quiz :) ");
        String userSelection = scanner.nextLine();

        if (userSelection.trim().equalsIgnoreCase("start")){
            System.out.println("begin");
        }



    }
}