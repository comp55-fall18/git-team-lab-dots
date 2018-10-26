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
	//You guys suck
	public void run() {
		GImage robot = new GImage("robot.jpg", 200, 100);
		add(robot);

<<<<<<< HEAD
		GLabel label = new GLabel("No room for laziness. -hackslash", 200, 400);
=======
		GLabel label = new GLabel("HAHA I AM BEING LAZY - martyr :p", 200, 400);
>>>>>>> branch 'master' of https://github.com/comp55-fall18/git-team-lab-dots.git

		add(label);
	}
}