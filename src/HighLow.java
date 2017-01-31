import java.util.Random;

import javax.swing.JOptionPane;

public class HighLow {

	public static void main(String[] args) {
		Random rana = new Random();
		int x = rana.nextInt(100);

		for (int i = 0; i < 10; i++) { 
			String rand = JOptionPane.showInputDialog("Pick a number between 1 and a 100");
			int ran = Integer.parseInt(rand);
			
			if (ran == x) {
				JOptionPane.showConfirmDialog(null, "Correct");
			break;
			}
			if (ran < x) {
				JOptionPane.showConfirmDialog(null, "Too low");
			}
			if (x < ran) {
				JOptionPane.showConfirmDialog(null, "Too high");
			}
		}
		JOptionPane.showConfirmDialog(null, "You lose");
	}
}