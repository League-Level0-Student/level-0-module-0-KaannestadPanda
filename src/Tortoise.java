import org.jointheleague.graphical.robot.Robot;

public class Tortoise {

	public static void main(String[] args) {
		Robot Tortoise=new Robot();
		Tortoise.drawLine();
	}

	
	void drawLine() {

	       Tortoise.move(100);

	       Tortoise.turn(90); 
	}
	
}


