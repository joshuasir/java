package mathematics;

import java.util.Scanner;

public class Controller<T extends Number,V extends Number> implements GenericInterface<T, V>{
	Validator<Double> v = new Validator();
	

	
	
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
	
	public void cuboidInt(Scanner scan) {
		Integer leng,wid,hei;

		do {
			System.out.print("Input width[>0]:");
			wid = scan.nextInt();
			scan.nextLine();
		}while(!v.validNum(wid.doubleValue()));
		
		do {
			System.out.print("Input length[>0]:");
			leng = scan.nextInt();
			scan.nextLine();
		}while(!v.validNum(leng.doubleValue()));
		
		do {
			System.out.print("Input height[>0]:");
			hei = scan.nextInt();
			scan.nextLine();
		}while(!v.validNum(hei.doubleValue()));
		
		GenericClass<Integer> gc = new GenericClass<>(wid,leng,hei);
		System.out.println("Volume: "+gc.intVolume());
	}
	public void cuboidDou(Scanner scan) {
		Double leng,wid,hei;

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
		
		GenericClass<Double> gc = new GenericClass<>(wid,leng,hei);
		System.out.println("Volume: "+gc.doubleVolume());
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
	public <M> void get(M[] item) {
		for (M t : item) {
			System.out.print(t + " ");
		}
		System.out.println("");
		System.out.print("Press any key to continue...");
	
	}
	@Override
	public Double add(T num1, V num2) {
		return num1.doubleValue()+num2.doubleValue();
	}
	@Override
	public Double subtract(T num1, V num2) {
		return num1.doubleValue()-num2.doubleValue();
	}
	@Override
	public Double multiply(T num1, V num2) {
		return num1.doubleValue()*num2.doubleValue();
	}
	@Override
	public Double divide(T num1, V num2) {
		return num1.doubleValue()/num2.doubleValue();
	}
	
	
}
