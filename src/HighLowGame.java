
import java.util.Random;

import javax.swing.JOptionPane;

import org.omg.Messaging.SyncScopeHelper;

// Copyright Wintriss Technical Schools 2013
public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100.
		int random = new Random().nextInt(100);
		// 2. Print out the random variable above
		//System.out.println(random);
		// 11. do the following 10 times
	
		for (int i = 0; i < 10; i++) {
	String question = JOptionPane.showInputDialog("Chose a number");
			// 1. ask the user for a guess using a pop-up window, and save their response )

			// 4. convert the users’ answer to an int
			int awnser = (Integer.parseInt(question));
			// 5. if the guess is correct
			if (awnser == random) {
				// 6.win
				JOptionPane.showMessageDialog(null,"Correct");
				System.exit(0);
			}
			// 7. if the guess is high
			if (random < awnser) {
				JOptionPane.showMessageDialog(null,"To High");
			}
			// 8. tell them it's too high
			
			// 9. if the guess is low
			if (random > awnser)
				JOptionPane.showMessageDialog(null, "to low");
			{
			}
			// 10. tell them it's too low
			
		}
		JOptionPane.showMessageDialog(null, "You lost");

	}
}
