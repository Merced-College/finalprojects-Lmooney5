package flashcardapp;

import java.util.Scanner;

public class QuizEngine {

    public static void startQuiz(FlashcardManager manager, Scanner scanner, Statistics stats) {

        if (manager.getSize() == 0) {
            System.out.println("No flashcards available.");
            return;
        }

        Flashcard card = manager.getRandomCard();

        System.out.println("Question: " + card.getQuestion());
        System.out.print("Your Answer: ");
        String userAnswer = scanner.nextLine();

        if (userAnswer.equalsIgnoreCase(card.getAnswer())) {
            System.out.println("Correct!");
            stats.recordCorrect();
        } else {
            System.out.println("Incorrect.");
            System.out.println("Correct answer: " + card.getAnswer());
            stats.recordIncorrect();
        }
    }
}