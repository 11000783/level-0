import javax.swing.JOptionPane;

public class Level0exam {
	public static void main(String[] args) {
		for (int i = 0; i < -i; i++) {
			
		}
		String awnser = JOptionPane
				.showInputDialog("pick a number,1. Add two number 2. Calculate change 3. Print Message 4. Exit ");
		int awn = Integer.parseInt(awnser);
		if (awn > 4 && awn < 1) {
			JOptionPane.showMessageDialog(null, "Error");
		}
		if (awn == 1) {
			String numbers = JOptionPane.showInputDialog("Pick an number");
			int nums = Integer.parseInt(numbers);
			String number = JOptionPane.showInputDialog("Pick an number");
			int num = Integer.parseInt(number);
			int sum = nums + num;
			JOptionPane.showMessageDialog(null, sum);
		}

		if (awn == 2) {

			String pric = JOptionPane.showInputDialog("Give me a price");
			double price = Double.parseDouble(pric);
			String amoun = JOptionPane.showInputDialog("What was the amount paided");
			double amount = Double.parseDouble(amoun);
			double sums = amount - price;
			if (price > amount) {
				JOptionPane.showMessageDialog(null, "Error");
			} else {
				JOptionPane.showMessageDialog(null, sums);
			}
		}
		if (awn == 3) {

			String message = JOptionPane.showInputDialog("Input a message");
			JOptionPane.showMessageDialog(null, message);
			if (awn == 4) {
				System.exit(0);
			}
		}
	}
}
