package flashcardapp;

public class Flashcard {

		private String question;
		private String answer;
		private String topic;

		// Constructor
		public Flashcard(String question, String answer, String topic) {
			this.question = question;
		    this.answer = answer;
		    this.topic = topic;
		    }

		// Getters
		public String getQuestion() {
		   return question;
		   }

		public String getAnswer() {
		   return answer;
		   }

		public String getTopic() {
		   return topic;
		   }

		// Setters
		public void setQuestion(String question) {
		   this.question = question;
		   }

		public void setAnswer(String answer) {
		   this.answer = answer;
		   }

		public void setTopic(String topic) {
		   this.topic = topic;
		   }

		// Display method
		public void displayCard() {
		    System.out.println("Topic: " + topic);
		    System.out.println("Q: " + question);
		    System.out.println("A: " + answer);
		    System.out.println("----------------------");
	

	}

}
