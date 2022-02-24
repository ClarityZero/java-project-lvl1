package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {

    private static final String GAME_RULES = "What is the result of the expression?";
    private static final int MAX_SIGNS = 3;

    public static void start() {
        String[] questions = new String[Engine.COUNT_OF_ROUND];
        String[] correctAnswers = new String[Engine.COUNT_OF_ROUND];

        for (int i = 0; i < Engine.COUNT_OF_ROUND; i++) {
            int randomNum1 = Engine.getRandomNumber();
            int randomNum2 = Engine.getRandomNumber();
            String randomSign = randomSign();

            questions[i] = randomNum1 + " " + randomSign + " " + randomNum2;
            correctAnswers[i] = String.valueOf(answers(randomNum1, randomNum2, randomSign));
        }
        Engine.game(GAME_RULES, questions, correctAnswers);
    }

    private static String randomSign() {
        int signNumber = Engine.getRandomNumber(MAX_SIGNS);
        switch (signNumber) {
            case 0 :
                return "+";
            case 1 :
                return "-";
            case 2 :
                return "*";
        }
    }

    private static int answers(int num1, int num2, String sign) {
        switch (sign) {
            case "+" :
                return num1 + num2;
            case "-" :
                return num1 - num2;
            case "*" :
                return num1 * num2;
        }
    }
}
