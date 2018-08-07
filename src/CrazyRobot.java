import java.util.ArrayList;

import org.jointheleague.graphical.robot.Robot;

public class CrazyRobot {
	

	Robot rob;

	String imgURl = new String(
			"https://static-cdn.jtvnw.net/jtv_user_pictures/e91a3dcf-c15a-441a-b369-996922364cdc-profile_image-300x300.png");
	ArrayList<Integer> sidesPerShape;

	public CrazyRobot(String imgURl, ArrayList<Integer> array) {
		// TODO Auto-generated constructor stub
		rob = new Robot();
		this.imgURl = imgURl;
		this.sidesPerShape = array;
		rob.changeRobot(imgURl);

	}

	String imgURl() {
		return imgURl;
	}

	private void run() {
		// TODO Auto-generated method stub
		draw();
	}

	void draw() {
		rob.penDown();
		for (int i = 0; i < sidesPerShape.size(); i++) {
		rob.move(100);
		rob.turn(360/sidesPerShape.get(0));
		}
	
	}

	void setImgURl(String imgURl) {
		this.imgURl = imgURl;
		rob.changeRobot(imgURl);
	}
	public static void main(String[] args) {
		ArrayList<Integer> array2 = new ArrayList<Integer>();
		array2.add(4);
		CrazyRobot robo = new CrazyRobot("https://static-cdn.jtvnw.net/jtv_user_pictures/e91a3dcf-c15a-441a-b369-996922364cdc-profile_image-300x300.png", array2);
		robo.run();
	}
}
