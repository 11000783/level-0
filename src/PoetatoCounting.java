
public class PoetatoCounting {

	public static void main(String[] args) {
	for (int a = 0; a < 5.; a++) {
		

		for (int i = 1; i < 9; i++) {
			if (i == 1) {
				System.out.print(i + " potato, ");
			} 	else if (i == 8) {
					System.out.println("more");
				} else if (i == 4) {
					System.out.println("4,");
				} 
			else {
				System.out.print(i + " potatoes, ");
			}
			
		}
		System.out.println();
	}
	}
}

