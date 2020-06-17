package section3;

import javax.swing.JOptionPane;

public class WorldDomination {
	
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
		String input = JOptionPane.showInputDialog("Do you know how to write code?");
		// 2. If they say "yes", tell them they will rule the world.
	
		if(input.equalsIgnoreCase("yes")) {
			
			JOptionPane.showMessageDialog(null, "together we will rule the galaxy"); 
			
			
			
		} else {
			JOptionPane.showMessageDialog(null, "not as smart, perhaps you are not "); 
		}
			
			
			
			
			
		
		
		
		
		// 3. Otherwise, wish them good luck washing dishes.

	}
}

