package section3;

import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {
	
	public static void main(String[] args) {
		// Put this sentence in a pop up:
		// If you find yourself having to cross a piranha-infested river, here's how to do it...
		JOptionPane.showMessageDialog(null,"If you find yourself having to cross a prianha- infested river here's how to do it");
		
	String one = JOptionPane.showInputDialog("ENTER an Adjective");
	String two = JOptionPane.showInputDialog("ENTER a type of Liquid");
	String three = JOptionPane.showInputDialog("ENTER a body part");
	String four = JOptionPane.showInputDialog("ENTER a  verb ");
	String five = JOptionPane.showInputDialog("ENTER a place");
		// Get the user to enter an adjective

		// Get the user to enter a type of liquid

		// Get the user to enter a body part

		// Get the user to enter a verb

		// Get the user to enter a place
	String text = "Piranhas are more " + one + " during the day, so cross the river at\n" + 
			" night. Piranhas are attracted to fresh " + two + " and will most\n" + 
			" likely take a bite out of your " + three + " if you " + four  + ". Whatever\n" + 
			" you do, if you have an open wound, try to find another way to get\n" + 
			" back to the " + five + ". Good luck!";
		// Fit the user's words into this sentence, and save it in a String:

	JOptionPane.showMessageDialog(null, text);
	}
}

