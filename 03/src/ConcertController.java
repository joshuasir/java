import java.util.ArrayList;
import java.util.Scanner;

public class ConcertController {
	Validator v = new Validator();
	String name,friends;
	Integer id;
	Integer friendId = null;
	
	public void menu(ArrayList<Audience> audiences) {
		view(audiences);
		System.out.println("1. Register New Audience");
		System.out.println("2. Enter the Concert Hall");
		System.out.println("3. Search Queue Number");
		System.out.println("4. Update Audience Data");
		System.out.println("5. Exit");
		System.out.print("Input :");
	}
	
	public void view(ArrayList<Audience> audiences) {
		System.out.println("=====================");
		System.out.println("FT World Tour Concert");
		System.out.println("=====================");
		String format = "%-10s%-5s%-7s %-10s \n";
		System.out.println();
		System.out.printf(format," ","Name"," ","TicketID");
		System.out.println("====================================");
		for (Audience audience : audiences) {
			System.out.printf(format,audience.getName()," "," ",audience.getId());
		}
		System.out.println();
	}
	
	public void add(ArrayList<Audience> audiences,Scanner scan) {

		do {
			System.out.print("Audience Name [2-20 characters]:");
			name = scan.nextLine();
		}while(!v.validName(name));
		
		do {
			System.out.print("Ticket ID [5 digits number]:");
			try {
				id = scan.nextInt();
			} catch (Exception e) {
				id = -1;
			}
			scan.nextLine();
		}while(!v.validId(id) || v.existId(id, audiences));
		
		do {
			System.out.print("Do you have a friend in the queue [yes/no]?");
			friends = scan.nextLine();
		}while(!v.validFriends(friends));
		
		if(friends.contentEquals("yes")) {
			do {
				System.out.print("Friend's Ticket ID [5 digits number]:");
				try {
					friendId = scan.nextInt();
				} catch (Exception e) {
					friendId=-1;
				}
				scan.nextLine();
			}while(!v.validId(friendId) || !v.existId(friendId, audiences));
		}
		
		audiences.add(new Audience(name, id, friends, friendId));
		System.out.println("ADD DATA SUCCESS !!!");
	}
	
	public void search(ArrayList<Audience> audiences,Scanner scan) {
		if(!audiences.isEmpty()) {
			view(audiences);
			do {
				System.out.print("Ticket ID [5 digits number]:");
				id = scan.nextInt();
			}while(!v.validId(id) || !v.existId(id, audiences));
			for (Audience audience : audiences) {
				if(audience.getId().equals(id)) {
					System.out.println("Queue Number: " + (audiences.indexOf(audience)+1) );
					return;
				}
			}
		}else {
			System.out.println("There's no item to search, please insert new data");
		}
		
	}
	
	public void update(ArrayList<Audience> audiences,Scanner scan) {
		if(!audiences.isEmpty()) {
			view(audiences);
			do {
				System.out.print("Ticket ID [5 digits number]:");
				try {
					id = scan.nextInt();
				} catch (Exception e) {
					id=-1;
				}
				scan.nextLine();
			}while(!v.validId(id) || !v.existId(id, audiences));
			
			do {
				System.out.print("Audience Name [2-20 characters]:");
				name = scan.nextLine();
			}while(!v.validName(name));
			
			for (Audience audience : audiences) {
				if(audience.getId().equals(id)) {
					audience.setName(name);
				}
			}
			
			System.out.println("UPDATE DATA SUCCESS !!!");
		}else {
			System.out.println("There's no item to update, please insert new data");
		}
	}
	public void pop(ArrayList<Audience> audiences) {
		if(!audiences.isEmpty()) {
			System.out.println(audiences.get(0).getName() + " enter the concert Hall");
			audiences.remove(0);
		}else {
			System.out.println("Data not found!");
		}
	}

}
