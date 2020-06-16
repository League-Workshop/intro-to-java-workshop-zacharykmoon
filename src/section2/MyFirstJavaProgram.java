package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
	Robot ron = new Robot();
	
	int speed = 100;
	
	int turnRadius = 90;
	ron.setSpeed(speed);
	
	ron.penDown();
	for (int i=0; i < 4; i++) {
	
	ron.move(100);
	
	ron.turn(turnRadius);
	}	
		
	}
}
