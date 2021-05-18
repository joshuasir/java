import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class Controller {

	public void menu() {
		System.out.println("+====================+");
		System.out.println("+ Menu List~         +");
		System.out.println("+====================+");
		System.out.println("+ 1. Add Runner      +");
		System.out.println("+ 2. Join Run        +");
		System.out.println("+ 3. View Standing   +");
		System.out.println("+ 4. Close Program   +");
		System.out.println("+====================+");
		System.out.print("Choice >>");
	}
	public void add(ArrayList<Runner> runners,Scanner scan) {
		
		String name,type;
		Validator v = new Validator();
		do {
			System.out.print("which animal will you rooting for [hare | turtle]?");
			type = scan.nextLine();
		}while(!v.validType(type));
		
		do {
			System.out.print("what's the name [5-15 characters]?");
			name = scan.nextLine();
		}while(!v.validName(name));
		
		if(type.contentEquals("hare")) {
			runners.add(new Hare(name));
		}else {
			runners.add(new Tortoise(name));
		}
	}
	public void join(ArrayList<Runner> runners) {
		for(int i=0;i<3;i++) {
			System.out.print("Generating data statistics");
			
			for(int j=0;j<=i;j++) {
				System.out.print(".");
			}
			System.out.println();
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		Integer totDist = getTotDist(ThreadLocalRandom.current().nextInt(3));
		do{
			view(runners,totDist);
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}while(runners.get(0).distance<totDist);
		if(runners.get(0) instanceof Hare) {
			Hare.hareCtr += 1;
		}else {
			Tortoise.tortoiseCtr+=1;
		}
	}
	
	public void view(ArrayList<Runner> runners,Integer finish) {
		for (Runner runner : runners) {
			runner.run();
		}
		Collections.sort(runners, (a, b)-> a.compareTo(b));
		String format = "+ %-3s | %-15s | %-8s | %-8s +\n";
		System.out.println("+=============================================+");
		System.out.println("+ Current Standing                        "+finish+" +");
		System.out.println("+=============================================+");
		for (Runner runner : runners) {
			System.out.printf(format,runners.indexOf(runner)+1,runner.name,runner.getClass().getName(),runner.distance);
		}
		System.out.println("+=============================================+");
	}
	
	public Integer getTotDist(Integer seed) {
		if(seed==0) {
			return 150;
		}else if(seed==1) {
			return 250;
		}
		return 500;
	}
	public void display() {
		if(Hare.hareCtr > Tortoise.tortoiseCtr) {
			System.out.println("Hare Leads");
		}else if(Tortoise.tortoiseCtr > Hare.hareCtr) {
			System.out.println("Tortoise Leads");
		}else {
			System.out.println("Draw");
		}
		System.out.println("+=============================+");
		System.out.println("+    Hare      |    Turtle    +");
		System.out.println("+=============================+");
		System.out.printf("+ %-13s|%-14s+\n",Hare.hareCtr,Tortoise.tortoiseCtr);
		System.out.println("+=============================+");
	}
}
