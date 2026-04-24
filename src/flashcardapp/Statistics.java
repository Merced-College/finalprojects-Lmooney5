package flashcardapp;

/*
 * Statistics tracks user quiz performance.
 * It stores correct and incorrect answers and calculates score percentage.
 */

public class Statistics {

    private int correct = 0;
    private int incorrect = 0;

    // Increments correct answer count
    public void recordCorrect() {
        correct++;
    }

    // Increments incorrect answer count
    public void recordIncorrect() {
        incorrect++;
    }

    // Displays performance summary
    public void displayStats() {
        int total = correct + incorrect;
        double percent = (total == 0) ? 0 : (correct * 100.0 / total);

        System.out.println("Correct: " + correct);
        System.out.println("Incorrect: " + incorrect);
        System.out.println("Score: " + percent + "%");
    }
}