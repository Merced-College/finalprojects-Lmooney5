package flashcardapp;

import java.util.Scanner;

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
            scanner.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Question: ");
                    String q = scanner.nextLine();

                    System.out.print("Answer: ");
                    String a = scanner.nextLine();

                    System.out.print("Topic: ");
                    String t = scanner.nextLine();

                    manager.addCard(new Flashcard(q, a, t));
                    break;

                case 2:
                    manager.displayAllCards();
                    break;

                case 3:
                    System.out.print("Enter card number: ");
                    int index = scanner.nextInt();
                    scanner.nextLine();
                    manager.removeCard(index - 1);
                    break;

                case 4:
                    QuizEngine.startQuiz(manager, scanner, stats);
                    break;

                case 5:
                    stats.displayStats();
                    break;

                case 6:
                    FileHandler.saveCards(manager);
                    break;

                case 7:
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
