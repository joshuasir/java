package mathematics;

import java.util.Scanner;

public class Controller{
	Validator<Double> v = new Validator<>();

	public void menu() {
		System.out.println("1. Print elements");
		System.out.println("2. Calculate cuboid volume");
		System.out.println("3. Simple calculator");
		System.out.println("4. Exit");
		System.out.print("Choice: ");
	}
	public void subMenuOne() {
		System.out.println("PRINT MENU");
		System.out.println("==========");
		System.out.println("1. Print numbers");
		System.out.println("2. Print words");
		System.out.print("Choice: ");
	}
	public void subMenuTwo() {
		System.out.println("Calculate cuboid volume");
		System.out.println("=======================");
		System.out.print("Input value type you want to use [Double | Integer](Case Insensitive): ");
	}
	public void subMenuThree() {
		System.out.println("CALCUALTOR");
		System.out.println("==========");
		
	}
	
	
	public void cuboid(Scanner scan) {
		String type;
		Double leng,wid,hei;
		
		do {
			subMenuTwo();
			type = scan.nextLine();
		}while(!v.validType(type));
		
		do {
			System.out.print("Input width[>0]:");
			wid = scan.nextDouble();
			scan.nextLine();
		}while(!v.validNum(wid));
		
		do {
			System.out.print("Input length[>0]:");
			leng = scan.nextDouble();
			scan.nextLine();
		}while(!v.validNum(leng));
		
		do {
			System.out.print("Input height[>0]:");
			hei = scan.nextDouble();
			scan.nextLine();
		}while(!v.validNum(hei));
		
		
		if(type.equalsIgnoreCase("Double")) {
			GenericClass<Double,Double> gc = new GenericClass<>(wid,leng,hei);
			System.out.println("Volume: "+gc.volume());
		}else {
			GenericClass<Integer,Integer> gc = new GenericClass<>(wid.intValue(),leng.intValue(),hei.intValue());
			System.out.println("Volume: "+gc.volume().intValue());
		}
	
	}
	
	public void print(Scanner scan) {
		int opt;
		subMenuOne();
		do {
			opt = scan.nextInt();
			scan.nextLine();
		switch(opt) {
		case 1:
			printNumbers(scan);
			break;
		case 2:
			printString(scan);
			break;
		}}while(!v.validOption(opt, 2));
	}
	public void printNumbers(Scanner scan) {
		Integer[] num = new Integer[3];
		do {
			System.out.println("Input first number[>0]");
			num[0] = scan.nextInt();
			scan.nextLine();
		}while(!v.validNum(num[0].doubleValue()));
		do {
			System.out.println("Input second number[>0]");
			num[1] = scan.nextInt();
			scan.nextLine();
		}while(!v.validNum(num[1].doubleValue()));
		do {
			System.out.println("Input third number[>0]");
			num[2] = scan.nextInt();
			scan.nextLine();
		}while(!v.validNum(num[2].doubleValue()));
		System.out.print("Numbers inputted: ");
		get(num);
		scan.nextLine();
	}
	public void printString(Scanner scan) {
		String[] str = new String[3];
		do {
			System.out.println("Input first word[must be more than 1 characters]");
			str[0] = scan.nextLine();
		}while(!v.validString(str[0]));

		do {
			System.out.println("Input second word[must be more than 1 characters]");
			str[1] = scan.nextLine();
		}while(!v.validString(str[1]));

		do {
			System.out.println("Input third word[must be more than 1 characters]");
			str[2] = scan.nextLine();
		}while(!v.validString(str[2]));
		System.out.print("Names inputted: ");
		get(str);
		scan.nextLine();
	}
	public <M extends Object> void get(M[] item) {
		for (M t : item) {
			System.out.print(t + " ");
		}
		System.out.print("\nPress any key to continue...");	
	}
	public void calculator(Scanner scan) {
		subMenuThree();
		Double num1,num2;

		do {
			System.out.print("Input first number[>0]:");
			num1 = scan.nextDouble();
			scan.nextLine();
		}while(!v.validNum(num1));
		
		do {
			System.out.print("Input second number[>0]:");
			num2 = scan.nextDouble();
			scan.nextLine();
		}while(!v.validNum(num2));
		
		GenericClass<Double,Double> gc = new GenericClass<>(0.0,0.0,0.0);
		
		System.out.println("Add result: "+ gc.add(num1, num2).intValue());
		System.out.println("Subtract result: "+ gc.subtract(num1, num2).intValue());
		System.out.println("Multiple result: "+ gc.multiply(num1, num2).intValue());
		System.out.println("Divide result: "+ gc.divide(num1, num2).intValue()+"\n");
		System.out.print("Press any key to continue...");
		scan.nextLine();
	}
	
	
}
