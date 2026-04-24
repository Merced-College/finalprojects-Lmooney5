package flashcardapp;

import java.util.Scanner;

/*
 * QuizEngine handles quiz functionality.
 * It randomly selects flashcards and checks user answers.
 * It also updates statistics based on correctness.
 */

public class QuizEngine {

    public static void startQuiz(FlashcardManager manager, Scanner scanner, Statistics stats) {

        // Prevents quiz from running if no cards exist
        if (manager.getSize() == 0) {
            System.out.println("No flashcards available.");
            return;
        }

        Flashcard card = manager.getRandomCard();

        System.out.println("Question: " + card.getQuestion());
        System.out.print("Your Answer: ");
        String userAnswer = scanner.nextLine();

        // Compares user input to correct answer (case-insensitive)
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