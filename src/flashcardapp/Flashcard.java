package flashcardapp;

/*
 * Flashcard represents a single study card.
 * It stores a question, answer, and topic.
 * This class is a simple data model used by the manager.
 */

public class Flashcard {

    private String question;
    private String answer;
    private String topic;

    // Constructor initializes a flashcard with all required data
    public Flashcard(String question, String answer, String topic) {
        this.question = question;
        this.answer = answer;
        this.topic = topic;
    }

    // Getter methods allow controlled access to private fields
    public String getQuestion() { return question; }
    public String getAnswer() { return answer; }
    public String getTopic() { return topic; }

    // Setter methods allow updating flashcard data if needed
    public void setQuestion(String question) { this.question = question; }
    public void setAnswer(String answer) { this.answer = answer; }
    public void setTopic(String topic) { this.topic = topic; }

    // Displays flashcard content in a readable format
    public void displayCard() {
        System.out.println("Topic: " + topic);
        System.out.println("Q: " + question);
        System.out.println("A: " + answer);
        System.out.println("----------------------");
    }
}