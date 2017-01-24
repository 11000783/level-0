import javax.swing.JOptionPane;

public class NumberSort {
public static void main(String[] args) {
	
	String numbers = JOptionPane.showInputDialog("Pick a number");
	int num = Integer.parseInt(numbers);
	
	String number = JOptionPane.showInputDialog("Pick a number");
	int nums = Integer.parseInt(number);
	
	String numbe = JOptionPane.showInputDialog("Pick a number");
	int numer = Integer.parseInt(numbe);
	
	if (num<nums&&nums<numer) {
		JOptionPane.showMessageDialog(null,num+ " is the smallest number");
		JOptionPane.showMessageDialog(null,nums+ " is the secound smallest number");
		JOptionPane.showMessageDialog(null,numer+ " is the largest number");
	}
	
	if (nums<num&&num<numer) {
		JOptionPane.showMessageDialog(null,nums+ " is the smallest number");
		JOptionPane.showMessageDialog(null,num+ " is the secound smallest number");
		JOptionPane.showMessageDialog(null,numer+ " is the largest number");
	}	
	
	if (numer<nums&&nums<num) {
		JOptionPane.showMessageDialog(null,numer+ " is the smallest number");
		JOptionPane.showMessageDialog(null,nums+ " is the secound smallest number");
		JOptionPane.showMessageDialog(null,num+ " is the largest number");
	}
	if (num<numer&&numer<nums) {
		JOptionPane.showMessageDialog(null,num+ " is the smallest number");
		JOptionPane.showMessageDialog(null,nums+ " is the secound smallest number");
		JOptionPane.showMessageDialog(null,numer+ " is the largest number");
	}
	
	if (nums<numer&&num<numer) {
		JOptionPane.showMessageDialog(null,nums+ " is the smallest number");
		JOptionPane.showMessageDialog(null,num+ " is the secound smallest number");
		JOptionPane.showMessageDialog(null,numer+ " is the largest number");
	}	
	
	if (numer<numer&&nums<num) {
		JOptionPane.showMessageDialog(null,numer+ " is the smallest number");
		JOptionPane.showMessageDialog(null,nums+ " is the secound smallest number");
		JOptionPane.showMessageDialog(null,num+ " is the largest number");
	}
	if (num<nums&&nums<numer) {
		JOptionPane.showMessageDialog(null,num+ " is the smallest number");
		JOptionPane.showMessageDialog(null,nums+ " is the secound smallest number");
		JOptionPane.showMessageDialog(null,numer+ " is the largest number");
	}
	
	if (nums<num&&num<numer) {
		JOptionPane.showMessageDialog(null,nums+ " is the smallest number");
		JOptionPane.showMessageDialog(null,num+ " is the secound smallest number");
		JOptionPane.showMessageDialog(null,numer+ " is the largest number");
	}	
	
	if (numer<num&&num<nums) {
		JOptionPane.showMessageDialog(null,numer+ " is the smallest number");
		JOptionPane.showMessageDialog(null,nums+ " is the secound smallest number");
		JOptionPane.showMessageDialog(null,num+ " is the largest number");
	}

















































}	

}
