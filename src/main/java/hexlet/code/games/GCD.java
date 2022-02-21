package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {

    private static final String GAME_RULES = "Find the greatest common divisor of given numbers.";

    public static void start() {
        String[] questions = new String[Engine.COUNT_OF_ROUND];
        String[] correctAnswers = new String[Engine.COUNT_OF_ROUND];

        for (int i = 0; i < Engine.COUNT_OF_ROUND; i++) {
            int randomNum1 = Engine.getRandomNumber();
            int randomNum2 = Engine.getRandomNumber();

            questions[i] = randomNum1 + " " + randomNum2;
            correctAnswers[i] = String.valueOf(calcGCD(randomNum1, randomNum2));
        }
        Engine.game(GAME_RULES, questions, correctAnswers);
    }

    private static int calcGCD(int num1, int num2) {
        while (num2 != 0) {
            int remainder = num1 % num2;
            num1 = num2;
            num2 = remainder;
        }
        return num1;
    }
}

