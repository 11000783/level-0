import javax.swing.JOptionPane;

public class GradeChecker {
public static void main(String[] args) {
String awnser = JOptionPane.showInputDialog("pick a number between 1 and 100");
	int awnse = Integer.parseInt(awnser);
	if (awnse>0&&awnse<101) {}

	
	else {
		JOptionPane.showMessageDialog(null,"error");
	
	}
if (awnse>90&&awnse<100) {
	JOptionPane.showMessageDialog(null,"You have an A");
}
else if (awnse>80&&awnse<89) {
	JOptionPane.showMessageDialog(null,"You have an B");
}
else if (awnse>70&&awnse<79) {
	JOptionPane.showMessageDialog(null,"You have an C");
}
else if (awnse>60&&awnse<69) {
	JOptionPane.showMessageDialog(null,"You have an D");
}
else if (awnse>0&&awnse<59) {
	JOptionPane.showMessageDialog(null,"You have an F");
}



}


}
