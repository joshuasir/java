import java.util.ArrayList;
import java.util.Scanner;

public class Shoeshop {

	public Shoeshop() {
		Scanner scan = new Scanner(System.in);
		Controller c = new Controller();
		ArrayList<Shoe> shoes = new ArrayList<>();
		int opt;
		
		do {
			c.menu();
			opt = scan.nextInt();
			scan.nextLine();
			switch(opt) {
			case 1:
				c.show(shoes);
				scan.nextLine();
				break;
			case 2:
				c.add(shoes, scan);
				scan.nextLine();
				break;
			case 3:
				c.remove(shoes, scan);
				scan.nextLine();
				break;
			}
		}while(opt!=4);
		
		System.out.println("Thank you for using this application!");
		scan.close();
	}

	public static void main(String[] args) {
		new Shoeshop();
	}

}
