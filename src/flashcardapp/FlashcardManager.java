package flashcardapp;

import java.util.ArrayList;

/*
 * FlashcardManager handles storage and management of all flashcards.
 * It uses an ArrayList to dynamically store cards.
 * This class controls adding, removing, displaying, and retrieving cards.
 */

public class FlashcardManager {

    private ArrayList<Flashcard> cards;

    public FlashcardManager() {
        cards = new ArrayList<>();
    }

    // Adds a new flashcard to the collection
    public void addCard(Flashcard card) {
        cards.add(card);
    }

    // Removes a flashcard based on user-selected index
    public void removeCard(int index) {
        if (index >= 0 && index < cards.size()) {
            cards.remove(index);
        } else {
            System.out.println("Invalid index.");
        }
    }

    // Displays all flashcards in the collection
    public void displayAllCards() {
        if (cards.isEmpty()) {
            System.out.println("No flashcards available.");
            return;
        }

        for (int i = 0; i < cards.size(); i++) {
            System.out.println("Card #" + (i + 1));
            cards.get(i).displayCard();
        }
    }

    // Returns a random flashcard for quiz mode
    public Flashcard getRandomCard() {
        if (cards.isEmpty()) return null;

        int index = (int)(Math.random() * cards.size());
        return cards.get(index);
    }

    // Returns number of flashcards currently stored
    public int getSize() {
        return cards.size();
    }

    // Provides full access to all cards for file saving
    public ArrayList<Flashcard> getAllCards() {
        return cards;
    }
}