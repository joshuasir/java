import java.util.*;

public class Bjrun {

	public Bjrun(boolean going) {
		Scanner scan = new Scanner(System.in);
		Controller c = new Controller();
		ArrayList<Runner> runners = new ArrayList<Runner>();
		int opt;
		while(going) {
			c.menu();
			opt = scan.nextInt();
			scan.nextLine();
			switch(opt) {
			case 1:
				c.add(runners,scan);
				break;
			case 2:
				c.join(runners);
				break;
			case 3:
				c.display();
				break;
			case 4:
				going = false;
				
			}
		}
		scan.close();
	}

	public static void main(String[] args) {
		new Bjrun(true);
	}

}
