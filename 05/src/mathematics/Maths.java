package mathematics;

import java.util.*;

public class Maths {

	public Maths() {
		Scanner scan = new Scanner(System.in);
		Controller c = new Controller();
		int opt;
		do {
			c.menu();
			opt = scan.nextInt();
			scan.nextLine();
			switch(opt) {
			case 1:
				c.print(scan);
				break;
			case 2:
				c.cuboid(scan);
				break;
			case 3:
				c.calculator(scan);
				break;
			}
		}while(opt!=4);
	}

	public static void main(String[] args) {
		new Maths();
	}

}
