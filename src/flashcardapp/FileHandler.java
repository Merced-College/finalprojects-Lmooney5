package flashcardapp;

import java.io.*;
import java.util.ArrayList;

public class FileHandler {
	
	private static final String FILE_NAME = "flashcards.txt";
	
	// Save flashcards to file
	public static void saveCards(FlashcardManager manager) {
		try (PrintWriter writer = new PrintWriter(new FileWriter(FILE_NAME))) {
			
			for (int i = 0; i < manager.getSize(); i++) {
				Flashcard card = manager.getRandomCard(); // temporary approach fix below
				
	            }
			
			System.out.println("Flashcards saved successfully.");
			
		} catch (IOException e) {
			
			System.out.println("Error saving file: " + e.getMessage());
	            
	        }
	    }

	    // Load flashcards from file
	    public static void loadCards(FlashcardManager manager) {
	        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {

	            String line;

	            while ((line = reader.readLine()) != null) {
	                String[] parts = line.split("\\|");

	                if (parts.length == 3) {
	                    Flashcard card = new Flashcard(parts[0], parts[1], parts[2]);
	                    manager.addCard(card);
	                }
	            }

	            System.out.println("Flashcards loaded successfully.");

	        } catch (IOException e) {
	            System.out.println("No save file found or error loading file.");
	            
	        }
	    }
}
