package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static final int COUNT_OF_ROUND = 3;
    private static final int MIN_RANDOM = 1;
    private static final int MAX_RANDOM = 100;

    public static void game(String rules, String[] questions, String[] correctAnswers) {
        String playerName = greetingsWithName();
        printRules(rules);

        int playerScore = 0;
        for (int i = 0; i < COUNT_OF_ROUND; i++) {
            System.out.println("Question: " + questions[i]);
            System.out.print("Your answer: ");
            String usrAnsw = userAnswer();

            if (usrAnsw.equals(correctAnswers[i])) {
                System.out.println("Correct!");
                playerScore++;
            } else {
                System.out.print("'" + usrAnsw + "' is wrong answer ;(.");
                System.out.println(" Correct answer was '" + correctAnswers[i] + "'.");
                System.out.println("Let's try again, " + playerName + "!");
                break;
            }
        }
        if (playerScore == Engine.COUNT_OF_ROUND) {
            System.out.println("Congratulations, " + playerName + "!");
        }

    }

    public static String greetingsWithName() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner scanName = new Scanner(System.in);
        String name = scanName.nextLine();
        System.out.println("Hello, " + name + "!");
        return name;
    }

    private static void printRules(String rules) {
        System.out.println(rules);
    }

    public static int getRandomNumber(int max, int min) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    public static int getRandomNumber(int max) {
        return getRandomNumber(max, MIN_RANDOM);
    }

    public static int getRandomNumber() {
        return getRandomNumber(MAX_RANDOM, MIN_RANDOM);
    }

    public static String userAnswer() {
        Scanner scanAnswer = new Scanner(System.in);
        return scanAnswer.next();
    }
}
