//comment one
//another comment
//yet another comment
import acm.graphics.GImage;
import acm.graphics.GLabel;
import acm.program.GraphicsProgram;

public class SimplePicture extends GraphicsProgram {
	public static int SIZE = 700;
	
	public void init() {
		setSize(SIZE, SIZE);
	}
	//I did something
	public void run() {
		GImage robot = new GImage("robot.jpg", 200, 100);
		add(robot);
		GLabel label = new GLabel("Nice. Nice. Nice. Nice. Nice.", 200, 400);
		add(label);
	}
}