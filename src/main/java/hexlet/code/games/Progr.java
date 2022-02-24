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
            int randomStep = Engine.getRandomNumber(PROGR_STEP);
            int randomHide = Engine.getRandomNumber(PROGR_SIZE);

            String[] questAndAnsw = hideElement(quests(randomStart, randomStep, PROGR_SIZE), randomHide);
            questions[i] = questAndAnsw[0];
            correctAnswers[i] = questAndAnsw[1];
        }
        Engine.game(GAME_RULES, questions, correctAnswers);
    }

    public static String[] quests(int start, int step, int size) {
        String[] elements = new String[size];
        elements[0] = String.valueOf(start);
        for (int i = 1; i < size; i++) {
            elements[i] = String.valueOf((start + step * i));
        }
        return elements;
    }

    public static String[] hideElement(String[] elements, int hide) {
        String[] result = new String[2];
        result[1] = elements[hide - 1];
        elements[hide - 1] = "..";
        result[0] = String.join(" ", elements);
        return result;
    }
}

