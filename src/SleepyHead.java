
//Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

public class SleepyHead {

	public static void main(String[] args) {

		boolean isWeekday, isVacation;

		int weekDay;
		int Vaction;
		weekDay = JOptionPane.showConfirmDialog(null, "is it a weekday?", "", JOptionPane.YES_NO_OPTION);
		Vaction = JOptionPane.showConfirmDialog(null, "Is it vaction", "", JOptionPane.YES_NO_OPTION);
		if (weekDay == JOptionPane.NO_OPTION) {
			System.out.println("sleep in")
		}
		if (Vaction == JOptionPane.YES_OPTION)
			
		{
			System.out.println("Sleep in");
		}

		if (weekDay == JOptionPane.YES_OPTION) {
			System.out.println("GET UP YOU HAVE THINGS TO DO");
		}
		if (Vaction == JOptionPane.NO_OPTION)
			;
		{
			System.out.println("GET UP YOU HAVE TO GO TO SCHOOL");
		}
	}
}