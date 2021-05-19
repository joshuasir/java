import java.util.*;

public class FTConcert {

	public FTConcert(boolean going) {
		Scanner scan = new Scanner(System.in);
		ConcertController cc = new ConcertController();
		LinkedList<Audience> audiences = new LinkedList<>();
		int option;
		while(going) {
			cc.menu(audiences);
			option = scan.nextInt();
			scan.nextLine();
			switch(option) {
			case 1:
				cc.add(audiences,scan);
				break;
			case 2:	
				cc.pop(audiences);
				break;
			case 3:
				cc.search(audiences,scan);
				break;
			case 4:
				cc.update(audiences,scan);
				break;
			case 5:
				audiences.clear();
				going = false;
			}
		}
		scan.close();
	}

	public static void main(String[] args) {
		new FTConcert(true);
	}

}
