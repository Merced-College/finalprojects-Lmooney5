package flashcardapp;

import java.util.ArrayList;

public class FlashcardManager {
    private ArrayList<Flashcard> cards;

    public FlashcardManager() {
        cards = new ArrayList<>();
    }

    // Add card
    public void addCard(Flashcard card) {
        cards.add(card);
    }

    // Remove card by index
    public void removeCard(int index) {
        if (index >= 0 && index < cards.size()) {
            cards.remove(index);
        } else {
            System.out.println("Invalid index.");
        }
    }

    // Display all cards
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

    // Get random card (for quiz later)
    public Flashcard getRandomCard() {
        if (cards.isEmpty()) return null;

        int index = (int)(Math.random() * cards.size());
        return cards.get(index);
    }

    public int getSize() {
        return cards.size();
    }
    
    public ArrayList<Flashcard> getAllCards() {
        return cards;
    }
}