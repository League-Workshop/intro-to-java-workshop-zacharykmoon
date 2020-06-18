package section4;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes all the steps below…
	public static void main(String[] args) {

		// 2. Make a variable that will hold a random number and put a random number
		// into this variable using "new Random().nextInt(4)"
		int randomNum = new Random().nextInt(5); //0-5
		// 3. Print out this variable
		JOptionPane.showMessageDialog(null,randomNum);
		for (int i=0;i<3;i++) {
		// 4. Get the user to enter something that they think is awesome
			String input = JOptionPane.showInputDialog("Pick a number from 0 to 5");
		// 5. If the random number is 0
			if(input.equalsIgnoreCase("0")) {
				JOptionPane.showMessageDialog(null, "Hmm not so awesome");
			}	
		// -- tell the user whatever they entered is awesome!

		// 6. If the random number is 1
			if(input.equalsIgnoreCase("1")) {
				JOptionPane.showMessageDialog(null, " You get a Lighsatber woosh");
			}
		// -- tell the user whatever they entered is ok.

		// 7. If the random number is 2
			if(input.equalsIgnoreCase("2")) {
				JOptionPane.showMessageDialog(null, " Your boring");
		// -- tell the user whatever they entered is boring.
			}
				
		// 8. If the random number is 3
			if(input.equalsIgnoreCase("3")) {
				JOptionPane.showMessageDialog(null, " You have a Nintendo");
				
			}
			if(input.equalsIgnoreCase("4")) {
				JOptionPane.showMessageDialog(null, " Your a mean guy");
			}
			if(input.equalsIgnoreCase("5")) {
				JOptionPane.showMessageDialog(null, " You play Minecraft");
			}
				
		}	
				
			
		// -- write your own answer
	}	
}
	
