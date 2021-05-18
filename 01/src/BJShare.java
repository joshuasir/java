import java.util.ArrayList;
import java.util.Scanner;

public class BJShare {

	public BJShare() {
		Scanner scan = new Scanner(System.in);
		ArrayList<Guy> guys = new ArrayList<>();
		Controller c = new Controller();
		int choice;
		do {
			c.menu();
			try {
				choice = scan.nextInt();
			} catch (Exception e) {
				choice=-1;
			}
			scan.nextLine();
			switch(choice) {
			case 1:
				c.add(guys, scan);
				break;
			case 2:
				c.update(guys, scan);
				break;
			case 3:
				c.delete(guys, scan);
				break;
			}
		}while(choice!=4);
		c.close(guys);
	}

	public static void main(String[] args) {
		new BJShare();

	}

}
