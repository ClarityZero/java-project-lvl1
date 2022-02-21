package hexlet.code.games;

import hexlet.code.Engine;

public class Progr {

    private static final String GAME_RULES = "What number is missing in the progression?";
    private static final int PROGR_SIZE = 10;
    private static final int PROGR_STEP = 15;

    public static void start() {
        String[] questions = new String[Engine.COUNT_OF_ROUND];
        String[] correctAnswers = new String[Engine.COUNT_OF_ROUND];

        for (int i = 0; i < Engine.COUNT_OF_ROUND; i++) {
            int randomStart = Engine.getRandomNumber();
            int randomStep = Engine.getRandomNumberRange(PROGR_STEP);
            int randomHide = Engine.getRandomNumberRange(PROGR_SIZE);

            String[] questAndAnsw = quests(randomStart, randomStep, randomHide);
            questions[i] = questAndAnsw[0];
            correctAnswers[i] = questAndAnsw[1];
        }
        Engine.game(GAME_RULES, questions, correctAnswers);
    }

    public static String[] quests(int start, int step, int hide) {
        String[] elements = new String[PROGR_SIZE];
        elements[0] = String.valueOf(start);

        for (int i = 1; i < PROGR_SIZE; i++) {
            elements[i] = String.valueOf((start + step * i));
        }

        String[] result = new String[2];
        result[1] = elements[hide - 1];
        elements[hide - 1] = "..";
        result[0] = String.join(" ", elements);
        return result;
    }
}

