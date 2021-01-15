package enums;

import java.util.Random;

enum Answers {
    NO, YES, MAYBE, LATER, SOON, NEVER;
}

class Question {
    Random rand = new Random();

    Answers ask() {
        int prob = (int) (100 * rand.nextDouble());
        if (prob < 15) {
            return Answers.MAYBE;
        } else if (prob < 30) {
            return Answers.NO;
        } else if (prob < 60) {
            return Answers.YES;
        } else if (prob < 75) {
            return Answers.LATER;
        } else if (prob < 98) {
            return Answers.SOON;
        } else {
            return Answers.NEVER;
        }
    }
}

public class AskMe {
    static void answer(Answers result) {
        switch (result) {
            case NO:
                System.out.printf("No%n");
                break;
            case YES:
                System.out.printf("Yes%n");
                break;
            case MAYBE:
                System.out.printf("Maybe%n");
                break;
            case LATER:
                System.out.printf("Later%n");
                break;
            case SOON:
                System.out.printf("Soon%n");
                break;
            case NEVER:
                System.out.printf("Never!%n");
                break;
        }
    }

    public static void main(String[] args) {
        Question question = new Question();
        answer(question.ask());
        answer(question.ask());
        answer(question.ask());
        answer(question.ask());
    }
}
