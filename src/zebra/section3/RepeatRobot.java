package zebra.section3;

import org.jointheleague.graphical.robot.Robot;

public class RepeatRobot {
	public static void main(String[] args) {
		
		// ▼ Write your code BELOW this line ▼
		
		
		// 1. Make a new Robot().  Remember to give it a name!  Example: Robot isis = new Robot();
		Robot iron = new Robot();
		// 2. Make your robot have a really fast speed (hint: setSpeed())
		iron.setSpeed(1000);
		// 3. Make your robot put its penDown()
		iron.penDown();
		// 4. Make your robot turn()
		iron.turn(70);
		// 5. Make your robot pick a random pen color (hint: setRandomPenColor())
		iron.setRandomPenColor();
		// 6. Make your robot move() so you can see the new pen color
		iron.move(100);
		// 7. make the robot do steps 4, 5, and 6 a BUNCH OF TIMES
		for (int i= 0; i<4; i++) {
	
		}
		
		
		// BONUS: Can you make a spiral?
		
		
		
		
		
		
		
		// ▲ Write your code ABOVE this line ▲
		
	}
}
