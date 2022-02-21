package hexlet.code.games;

import hexlet.code.Engine;

public class IsEven {

    private static final String GAME_RULES = "Answer 'yes' if number even otherwise answer 'no'.";

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

    public static String correctAnswer(int question) {
        if (isEven(question)) {
            return "yes";
        }
        return "no";
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
