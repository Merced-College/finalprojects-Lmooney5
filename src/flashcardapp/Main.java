package flashcardapp;

import java.util.Scanner;

/*
 * Main class handles user interaction and program flow.
 * It displays a menu and connects all other classes together.
 * This class acts as the entry point of the program.
 */

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        FlashcardManager manager = new FlashcardManager();
        Statistics stats = new Statistics();

        int choice;

        do {
            System.out.println("\nStudy Flashcard App");
            System.out.println("1. Add Flashcard");
            System.out.println("2. View Flashcards");
            System.out.println("3. Remove Flashcard");
            System.out.println("4. Start Quiz");
            System.out.println("5. View Statistics");
            System.out.println("6. Save Flashcards");
            System.out.println("7. Load Flashcards");
            System.out.println("8. Exit");
            System.out.print("Choice: ");

            choice = scanner.nextInt();
            scanner.nextLine(); // clear buffer

            switch (choice) {

                case 1:
                    // Collects user input and creates a new flashcard object
                    System.out.print("Question: ");
                    String q = scanner.nextLine();

                    System.out.print("Answer: ");
                    String a = scanner.nextLine();

                    System.out.print("Topic: ");
                    String t = scanner.nextLine();

                    manager.addCard(new Flashcard(q, a, t));
                    break;

                case 2:
                    // Displays all flashcards stored in the manager
                    manager.displayAllCards();
                    break;

                case 3:
                    // Removes a flashcard by user-selected index
                    System.out.print("Enter card number: ");
                    int index = scanner.nextInt();
                    scanner.nextLine();
                    manager.removeCard(index - 1);
                    break;

                case 4:
                    // Starts quiz mode using a random flashcard
                    QuizEngine.startQuiz(manager, scanner, stats);
                    break;

                case 5:
                    // Displays user performance statistics
                    stats.displayStats();
                    break;

                case 6:
                    // Saves flashcards to external file for persistence
                    FileHandler.saveCards(manager);
                    break;

                case 7:
                    // Loads flashcards from file into memory
                    FileHandler.loadCards(manager);
                    break;

                case 8:
                    System.out.println("Goodbye.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 8);

        scanner.close();
    }
}