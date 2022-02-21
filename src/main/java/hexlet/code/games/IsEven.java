package hexlet.code.games;

import hexlet.code.App;

import java.util.Scanner;

public class IsEven {

    static final int COUNT_OF_ROUND = 3;
    static final int MIN_RANDOM = 1;
    static final int MAX_RANDOM = 100;

    public static void start() {
        String playerName = greetingWithName();
        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");

        int playerScore = 0;

        for (int i = 0; i < COUNT_OF_ROUND; i++) {
            int questionNum = getRandomNumber(MIN_RANDOM, MAX_RANDOM);
            System.out.println("Question: " + questionNum);
            System.out.print("Your answer: ");
            String usrAnsw = App.userAnswer();

            if (usrAnsw.equals(correctAnswer(questionNum))) {
                System.out.println("Correct!");
                playerScore++;
            } else {
                System.out.print("'" + usrAnsw + "' is wrong answer ;(.");
                System.out.println(" Correct answer was '" + correctAnswer(questionNum) + "'.");
                System.out.println("Let's try again, " + playerName + "!");
                break;
            }
        }
        if (playerScore == COUNT_OF_ROUND) {
            System.out.println("Congratulations, " + playerName + "!");
        }
    }

    public static String correctAnswer(int question) {
        if (isEven(question)) {
            return "yes";
        }
        return "no";
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static int userAnswerInt() {
        Scanner scanAnswer = new Scanner(System.in);
        return scanAnswer.nextInt();
    }

    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
    public static String greetingWithName() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner scanName = new Scanner(System.in);
        String name = scanName.nextLine();
        System.out.println("Hello, " + name + "!");
        return name;
    }
}

