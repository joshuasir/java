import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Controller {

	Validator v = new Validator();	
	
	public void menu() {
		System.out.println("Shoe Shop");
		System.out.println("=========");
		System.out.println("1. View Shoes");
		System.out.println("2. Add Shoes");
		System.out.println("3. Delete Shoes");
		System.out.println("4. Exit");
		System.out.print(">>");
	}
	
	
	public void display(ArrayList<Shoe> shoes) {
		for(int i=0;i<shoes.size();i++) {
			System.out.println(i+1+". "+shoes.get(i).getName()+"-"+shoes.get(i).getId());
			System.out.println("==================");
			System.out.println("Category: "+shoes.get(i).getCategory());
			System.out.println("Release date: "+shoes.get(i).getRelease());
			System.out.println("Price: "+shoes.get(i).getPrice()+"\n");
		}
	}
	
	public void add(ArrayList<Shoe> shoes,Scanner scan) {
		String name = null,category = null,release = null;
		Integer price = null;
		do {
			System.out.print("Input shoe's name[name ends with shoe, example: \"Fire shoe\"]:");
			name = scan.nextLine();
		}while(!v.validName(name));
		
		do {
			System.out.print("Input shoe's category[Sneaker | Running | Boot] (case sensitive):");
			category = scan.nextLine();
		}while(!v.validCategory(category));
		
		do {
			System.out.print("Input shoe's release date[dd-mm-yyyy]:");
			release = scan.nextLine();
		}while(!v.validDate(release));
		
		do {
			System.out.print("Input shoe's price[more than or equals to 5000]:");
			price = scan.nextInt();
			scan.nextLine();
		}while(!v.validPrice(price));
		shoes.add(new Shoe(getId(),name,category,release,price));
		System.out.println("Shoe added!");
		System.out.print("Press enter to continue...");
	}
	
	public String getId() {
		String ans = "SH";
		for(int i=0;i<3;i++) {
			ans+=ThreadLocalRandom.current().nextInt(10);
		}
		return ans;
	}
	
	public void remove(ArrayList<Shoe> shoes,Scanner scan) {
		int opt;
		if(!shoes.isEmpty()) {
			display(shoes);
			do {
				System.out.print("Choose shoe's number to delete [1.."+ shoes.size() +"]");
				opt=scan.nextInt();
				scan.nextLine();
			}while(!v.validOption(opt,shoes.size()));
			
			shoes.remove(opt-1);
			System.out.println("Shoe removed!");
		}else {
			System.out.println("No shoes available..");
		}
		System.out.print("Press enter to continue..");
	}
	
	public void show(ArrayList<Shoe> shoes) {
		if(!shoes.isEmpty()) {
			display(shoes);
		}else {
			System.out.println("No shoes available..");
		}
		System.out.print("Press enter to continue..");
	}
}
