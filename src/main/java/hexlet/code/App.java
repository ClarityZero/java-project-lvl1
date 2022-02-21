package hexlet.code;

import hexlet.code.games.IsEven;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        chooseGame();
        startGame();
    }

    public static void chooseGame() {
        System.out.println("Please enter the game number and press Enter.");
        String[] games = {"1 - Greet", "2 - Even", "0 - Exit"};

        for (String game : games) {
            System.out.println(game);
        }

        System.out.print("Your choice: ");
    }

    public static void startGame() {
        String gameNumber = userAnswer();

        switch (gameNumber) {
            case "1" :
                greeting();
                break;
            case "2" :
                IsEven.start();
                break;
            default :
                break;
        }
    }

    public static void greeting() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner scanName = new Scanner(System.in);
        String name = scanName.nextLine();
        System.out.println("Hello, " + name + "!");
    }

    public static String userAnswer() {
        Scanner scanAnswer = new Scanner(System.in);
        return scanAnswer.next();
    }
}

