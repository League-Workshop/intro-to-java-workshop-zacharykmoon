package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int score;
		score = 0;
		// 2.  Ask the user a question 
		String input = JOptionPane.showInputDialog("What was Darth Vader's secret?");
		
		// 3.  Use an if statement to check if their answer is correct
		if (input.equalsIgnoreCase("I am your father")) {
		// 4.  if the user's answer was correct, add one to their score 
			score = score +1;
		}
		
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		input = JOptionPane.showInputDialog("What is healthier, an apple or an orange?");
		
		// 3.  Use an if statement to check if their answer is correct
		if (input.equalsIgnoreCase("apple")) {
			score = score + 1;
		}
		input = JOptionPane.showInputDialog("What key character dies in Episode 7");
		
		// 3.  Use an if statement to check if their answer is correct
		if (input.equalsIgnoreCase("Han Solo")){
			score = score + 1;
		}
		input = JOptionPane.showInputDialog("Who shot first? Greedo or Han Solo");
		
		// 3.  Use an if statement to check if their answer is correct
		if (input.equalsIgnoreCase("Han")) {
			score = score + 1;
		}
		JOptionPane.showMessageDialog(null, "A true enthusiast would know Han Solo shot first");
		
		
		// 6.  After all the questions have been asked, print the user's score 
		JOptionPane.showMessageDialog(null, score);
		
	}
}
