package flashcardapp;

public class Statistics {
	
	private int correct = 0;
	private int incorrect = 0;

	public void recordCorrect() {
		
		correct++;
		
	}

	public void recordIncorrect() {
	    incorrect++;
	    
	}

	public void displayStats() {
		int total = correct + incorrect;
		double percent = (total == 0) ? 0 : (correct * 100.0 / total);
		
		System.out.println("Correct: " + correct);
	    System.out.println("Incorrect: " + incorrect);
	    System.out.println("Score: " + percent + "%");
	    
	}
	
}
