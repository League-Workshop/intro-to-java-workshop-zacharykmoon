package zebra.section1;

import org.jointheleague.graphical.robot.Robot;

public class RobotFreestyle {
	
	public static void main(String[] args) {
		
		// ▼ Write your code BELOW this line ▼
		
		
		// 1. Make a new Robot().  Remember to give it a name!
		Robot rob = new Robot();
		
		
		// 2. Make your robot move()
		 int speed = 300;
		rob.move(100);
		// 3. Make your robot turn()  
		rob.turn(90);
		
		// 4. Make your robot put its penDown()
		rob.penDown();
		rob.setRandomPenColor();
		// 5. Make your robot move() some more.  What do you see?
		rob.move(100);
		rob.turn(90);
		rob.move(100);
		rob.turn(90);
		rob.move(100);
		rob.turn(90);
		// 6. Can you make your robot draw a square?  A triangle?  Something cool?
		
		
		
		
		
		
		
		
		
		// Bonus: Can you make your robot sparkle? miniaturize? draw with a different color?
		
		
		// ▲ Write your code ABOVE this line ▲
		
	}
	
}
