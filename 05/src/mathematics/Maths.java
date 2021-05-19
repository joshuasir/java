package mathematics;

import java.util.*;

public class Maths {

	public Maths() {
		Scanner scan = new Scanner(System.in);
		Controller<Double,Double> c = new Controller();
		int opt;
		String type;
		do {
			c.menu();
			opt = scan.nextInt();
			scan.nextLine();
			switch(opt) {
			case 1:
				c.subMenuOne();
				do {
					opt = scan.nextInt();
					scan.nextLine();
				switch(opt) {
				case 1:
					c.printNumbers(scan);
					break;
				case 2:
					c.printString(scan);
					break;
				}}while(!c.v.validOption(opt, 2));
				break;
			case 2:
				do {
					c.subMenuTwo();
					type = scan.nextLine();
				}while(!c.v.validType(type));
				
				if(type.equalsIgnoreCase("Integer")) {
					c.cuboidInt(scan);
				}else {
					c.cuboidDou(scan);
				}	
				break;
			case 3:
				c.subMenuThree();
				Double num1,num2;

				do {
					System.out.print("Input first number[>0]:");
					num1 = scan.nextDouble();
					scan.nextLine();
				}while(!c.v.validNum(num1));
				
				do {
					System.out.print("Input second number[>0]:");
					num2 = scan.nextDouble();
					scan.nextLine();
				}while(!c.v.validNum(num2));

				System.out.println("Add result: "+ c.add(num1, num2));
				System.out.println("Subtract result: "+ c.subtract(num1, num2));
				System.out.println("Multiple result: "+ c.multiply(num1, num2));
				System.out.println("Divide result: "+ c.divide(num1, num2)+"\n");
				System.out.print("Press any key to continue...");
				scan.nextLine();
				break;
			}
		}while(opt!=4);
	}

	public static void main(String[] args) {
		new Maths();
	}

}
