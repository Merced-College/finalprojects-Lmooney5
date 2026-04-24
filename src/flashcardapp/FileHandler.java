package flashcardapp;

import java.io.*;

/*
 * FileHandler manages saving and loading flashcards to/from a file.
 * This allows data persistence between program runs.
 */

public class FileHandler {

    private static final String FILE_NAME = "flashcards.txt";

    // Saves all flashcards into a text file using a simple delimiter format
    public static void saveCards(FlashcardManager manager) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(FILE_NAME))) {

            for (Flashcard card : manager.getAllCards()) {
                writer.println(card.getQuestion() + "|" +
                               card.getAnswer() + "|" +
                               card.getTopic());
            }

            System.out.println("Flashcards saved successfully.");

        } catch (IOException e) {
            System.out.println("Error saving file.");
        }
    }

    // Loads flashcards from file and rebuilds Flashcard objects
    public static void loadCards(FlashcardManager manager) {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {

            String line;

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\\|");

                if (parts.length == 3) {
                    manager.addCard(new Flashcard(parts[0], parts[1], parts[2]));
                }
            }

            System.out.println("Flashcards loaded successfully.");

        } catch (IOException e) {
            System.out.println("No save file found.");
        }
    }
}