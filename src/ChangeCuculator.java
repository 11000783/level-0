

//Copyright The League of Amazing Programmers 2014
import javax.swing.JOptionPane;
import javax.swing.text.PlainDocument;

/*
* I have a pocket full of change. I hate doing math. Make me a program that
* will calculate how much money I have without me having to use my brain. Then
* make me a sandwich.
*/
public class ChangeCuculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have

		
 String nickel = JOptionPane.showInputDialog("How many nickels do you have?");
		// Convert their answer to an int using Integer.parseInt()
Integer.parseInt(nickel);
int nickels = Integer.parseInt(nickel);
		// Ask the user how many dimes they have, and convert their answer
     String dime = JOptionPane.showInputDialog("How many dimes do you have?");
    	int dimes = Integer.parseInt(dime);
		// Ask the user how many quarters they have, and convert their answer
String quarter = JOptionPane.showInputDialog("How many quarters do you have?");
int quarters = Integer.parseInt(quarter);
		// Calculate how much money the user has and save it in a double variable 
double money = nickels*.05 + dimes*.10 + quarters*.25;
		// Tell the user how much money they have
JOptionPane.showMessageDialog(null,String.format("$%2.2f", money));

}
}