package hexlet.code;

import hexlet.code.games.IsEven;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progr;
import hexlet.code.games.Prime;

public class App {

    public static void main(String[] args) {
        gameMenu();
        startGame();
    }

    public static void gameMenu() {
        System.out.println("Please enter the game number and press Enter.");
        String[] games = {"1 - Greet", "2 - Even", "3 - Calc", "4 - GCD", "5 - Progression", "6 - Prime", "0 - Exit"};
        for (String game : games) {
            System.out.println(game);
        }

        System.out.print("Your choice: ");
    }

    public static void startGame() {
        String gameNumber = Engine.userAnswer();

        switch (gameNumber) {
            case "1" :
                Engine.greetingsWithName();
                break;
            case "2" :
                IsEven.start();
                break;
            case "3" :
                Calc.start();
                break;
            case "4" :
                GCD.start();
                break;
            case "5" :
                Progr.start();
                break;
            case "6" :
                Prime.start();
                break;
            default :
                break;
        }
    }
}
