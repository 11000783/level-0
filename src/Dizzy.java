import javax.swing.JOptionPane;

import org.teachingextensions.logo.Tortoise;


public class Dizzy {


	public static void main(String[] args) {
				 
		 // 2. Ask the user how dizzy you want the tortoise from 1-10, then spin that number of times.
String dizzy = JOptionPane.showInputDialog(null,"How dizzy do you want the tortoise");
int dizzzy = Integer.parseInt(dizzy);

 // 1. Use the dance method to make the Tortoise spin.
		 dance(dizzzy);


	}


	static void dance(int numberOfSpins) {
		for (int i = 0; i < numberOfSpins; i++) {
			Tortoise.turn(360);
		}
	}
}

