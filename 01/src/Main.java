import java.util.*;

public class Main {
	public ArrayList<Guy> guys = new ArrayList<>();
	public Main() {
		Scanner input = new Scanner(System.in);
		int choice;
		Integer num = null;
		String name = null;
		do {
			menu();
			try {
				choice = input.nextInt();
			} catch (Exception e) {
				choice=-1;
			}
			input.nextLine();
			switch(choice) {
			case 1:
				num = null;
				name = null;
				do {
				System.out.print("Input a number [0 - 100]:");
				try {
					num = input.nextInt();
				} catch (Exception e) {
					System.out.println("Input must be numeric");
				}
				input.nextLine();
				}while(num==null || num.intValue()<0 || num.intValue()>100);
				while(true) {
					System.out.print("Could you give me your username [5 - 20 characters]?");
					name = input.nextLine();
					if(name.length()<5 || name.length()>20) {
						System.out.println("between 5 - 20!");
					}else if(!valid(name)) {
						System.out.println("username has already taken!!");
					}else {
						break;
					}
				}
				guys.add(new Guy(name,num));
				System.out.println("You are the "+ guys.size() +" that join the game");
				System.out.println("You share number : " + num);
				
				
				break;
			case 2:
				int updt;
				if(!guys.isEmpty()) {
					do {
					display();
					System.out.print("Which praticipant you would like to update [1 - "+ guys.size() +"][0 to exit]?");
					try {
						updt = input.nextInt();
					} catch (Exception e) {
						updt=-1;
					}
					input.nextLine();
					}while(updt<0||updt>guys.size());
					if(updt == 0) {
						break;
					}else {
						num = null;
						do {
							System.out.print("Input a number [0 - 100]:");
							try {
								num = input.nextInt();
							} catch (Exception e) {
								System.out.println("Input must be numeric");
							}
							input.nextLine();
						}while(num == null || num.intValue()<0 || num.intValue()>100);
						guys.get(updt-1).setNum(num);
						
						System.out.println("Update Successful!");
						
					}
				}
				break;
			case 3:
				int del;
				if(!guys.isEmpty()) {
					do {
					display();
					System.out.print("Which praticipant you would like to delete [1 - "+ guys.size() +"][0 to exit]?");
					try {
						del = input.nextInt();
					} catch (Exception e) {
						del=-1;
					}
					input.nextLine();
					}while(del<0||del>guys.size());
					if(del == 0) {
						break;
					}else {
						guys.remove(del-1);
						System.out.println("Participant successfully removed from event");
					}
				}
				break;
			}
		}while(choice!=4);
		
		System.out.println("Here's the completed share list");
		System.out.println("Remember, sharing is caring, happy sharing :D");
		if(!guys.isEmpty()) {
			close();
		}
		
	}
	public boolean valid(String name) {
		for (Guy guy : guys) {
			if(guy.getName().equals(name)) {
				return false;
			}
		}
		return true;
	}
	public void display() {
		String format = "| %-3s| %-15s | %-6s |\n";
		System.out.println("+===============================+");
		System.out.println("+ Share List                    +");
		System.out.println("+===============================+");
		for(int i=0;i<guys.size();i++) {
			System.out.printf(format,i+1,guys.get(i).getName(),guys.get(i).getNum());
		}
		System.out.println("+===============================+");
	}
	public void close() {
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
	
	
	public static void main(String[] args) {
		new Main();

	}

}
