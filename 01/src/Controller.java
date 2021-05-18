import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Controller {
	Validator v = new Validator();
	int option;
	public void update(ArrayList<Guy> guys,Scanner input) {
		if(!guys.isEmpty()) {
			do {
			display(guys);
			System.out.print("Which praticipant you would like to update [1 - "+ guys.size() +"][0 to exit]?");
			try {
				option = input.nextInt();
			} catch (Exception e) {
				option=-1;
			}
			input.nextLine();
			}while(!v.validOption(option,guys.size()));
			if(option != 0) {
				Integer num = null;
				do {
					System.out.print("Input a number [0 - 100]:");
					try {
						num = input.nextInt();
					} catch (Exception e) {
						System.out.println("Input must be numeric");
					}
					input.nextLine();
				}while(!v.validNumber(num));
				guys.get(option-1).setNum(num);
				System.out.println("Update Successful!");
				
			}
		}
	}
	
	public void delete(ArrayList<Guy> guys,Scanner input) {
		if(!guys.isEmpty()) {
			do {
			display(guys);
			System.out.print("Which praticipant you would like to delete [1 - "+ guys.size() +"][0 to exit]?");
			try {
				option = input.nextInt();
			} catch (Exception e) {
				option=-1;
			}
			input.nextLine();
			}while(!v.validOption(option, guys.size()));
			if(option != 0) {
				guys.remove(option-1);
				System.out.println("Participant successfully removed from event");
			}
		}
	}
	
	public void add(ArrayList<Guy> guys,Scanner input) {
		Integer num = null;
		String name = null;
		do {
			System.out.print("Input a number [0 - 100]:");
		try {
			num = input.nextInt();
		} catch (Exception e) {
			System.out.println("Input must be numeric");
		}
		input.nextLine();
		}while(!v.validNumber(num));
		while(true) {
			System.out.print("Could you give me your username [5 - 20 characters]?");
			name = input.nextLine();
			if(!v.validNameLength(name.length())) {
				System.out.println("between 5 - 20!");
			}else if(!v.validName(name, guys)) {
				System.out.println("username has already taken!!");
			}else {
				break;
			}
		}
		guys.add(new Guy(name,num));
		System.out.println("You are the "+ guys.size() +" that join the game");
		System.out.println("You share number : " + num);
	}
	
	
	
	public void display(ArrayList<Guy> guys) {
		String format = "| %-3s| %-15s | %-6s |\n";
		System.out.println("+===============================+");
		System.out.println("+ Share List                    +");
		System.out.println("+===============================+");
		for(int i=0;i<guys.size();i++) {
			System.out.printf(format,i+1,guys.get(i).getName(),guys.get(i).getNum());
		}
		System.out.println("+===============================+");
	}
	public void close(ArrayList<Guy> guys) {
		System.out.println("Here's the completed share list");
		System.out.println("Remember, sharing is caring, happy sharing :D");
		if(!guys.isEmpty()) {
		Collections.sort(guys,(guy1,guy2) -> guy1.getName().compareTo(guy2.getName()));
		ArrayList<Integer> justNum = new ArrayList<>();
		for (Guy guy : guys) {
			justNum.add(guy.getNum());
		}
		Collections.shuffle(justNum);
		Collections.reverse(justNum);
		String format = "| %-15s | %-6s | %-6s |\n";
		System.out.println("+===================================+");
		System.out.println("+ Share List                        +");
		System.out.println("+===================================+");
		System.out.printf(format,"Username","Before","After");
		System.out.println("+===================================+");
		for(int i=0;i<guys.size();i++) {
			System.out.printf(format,guys.get(i).getName(),guys.get(i).getNum(),justNum.get(i));
		}
		System.out.println("+===================================+");
		}
	}
	public void menu() {
		System.out.println("+======================+");
		System.out.println("+Options               +");
		System.out.println("+======================+");
		System.out.println("+1. Start Sharing      +");
		System.out.println("+2. Update Participant +");
		System.out.println("+3. Delete Participant +");
		System.out.println("+4. Close App          +");
		System.out.println("+======================+");
		System.out.print("Choice >>");
	}
}
