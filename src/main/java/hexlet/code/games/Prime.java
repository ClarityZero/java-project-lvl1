package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {

    private static final String GAME_RULES = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void start() {
        String[] questions = new String[Engine.COUNT_OF_ROUND];
        String[] correctAnswers = new String[Engine.COUNT_OF_ROUND];

        for (int i = 0; i < Engine.COUNT_OF_ROUND; i++) {
            int randomNum = Engine.getRandomNumber();

            questions[i] = String.valueOf(randomNum);
            correctAnswers[i] = correctAnswer(randomNum);
        }
        Engine.game(GAME_RULES, questions, correctAnswers);
    }

    public static String correctAnswer(int number) {
        return isPrime(number) ? "yes" : "no";
    }

    public static boolean isPrime(int number) {
        if (number == 1) {
            return false;
        }
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

