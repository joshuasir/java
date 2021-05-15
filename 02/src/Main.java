import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
	public ArrayList<Shoe> shoes = new ArrayList<>();
	public Main() {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		int opt;
		String name = null,category = null,release = null;
		Integer price = null;
		do {
			menu();
			opt = scan.nextInt();
			scan.nextLine();
			switch(opt) {
			case 1:
				if(!shoes.isEmpty()) {
					display();
				}else {
					System.out.println("No shoes available..");
				}
				System.out.print("Press enter to continue..");
				scan.nextLine();
				break;
			case 2:
				do {
					System.out.print("Input shoe's name[name ends with shoe, example: \"Fire shoe\"]:");
					name = scan.nextLine();
				}while(!name.endsWith("shoe"));
				
				do {
					System.out.print("Input shoe's category[Sneaker | Running | Boot] (case sensitive):");
					category = scan.nextLine();
				}while(!category.equals("Sneaker")&&!category.equals("Running")&&!category.equals("Boot"));
				
				do {
					System.out.print("Input shoe's release date[dd-mm-yyyy]:");
					release = scan.nextLine();
				}while(!validDate(release));
				
				do {
					System.out.print("Input shoe's price[more than or equals to 5000]:");
					price = scan.nextInt();
					scan.nextLine();
				}while(price.intValue()<5000);
				shoes.add(new Shoe("SH"+rand.nextInt(10)+rand.nextInt(10)+rand.nextInt(10),name,category,release,price));
				System.out.println("Shoe added!");
				System.out.print("Press enter to continue...");
				scan.nextLine();
				break;
			case 3:
				if(!shoes.isEmpty()) {
					display();
					do {
					System.out.print("Choose shoe's number to delete [1.."+ shoes.size() +"]");
					opt=scan.nextInt();
					scan.nextLine();
					}while(opt<1||opt>shoes.size());
					shoes.remove(opt-1);
					System.out.println("Shoe removed!");
					opt=0;
				}else {
					System.out.println("No shoes available..");
				}
				System.out.print("Press enter to continue..");
				scan.nextLine();
				break;
			}
		}while(opt!=4);
		System.out.println("Thank you for using this application!");
		scan.close();
	}
	public boolean validDate (String date) {
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
 		format.setLenient(false);
		try {
			format.parse(date);
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	public void menu() {
		System.out.println("Shoe Shop");
		System.out.println("=========");
		System.out.println("1. View Shoes");
		System.out.println("2. Add Shoes");
		System.out.println("3. Delete Shoes");
		System.out.println("4. Exit");
		System.out.print(">>");
	}
	public void display() {
		for(int i=0;i<shoes.size();i++) {
			System.out.println(i+1+". "+shoes.get(i).getName()+"-"+shoes.get(i).getId());
			System.out.println("==================");
			System.out.println("Category: "+shoes.get(i).getCategory());
			System.out.println("Release date: "+shoes.get(i).getRelease());
			System.out.println("Price: "+shoes.get(i).getPrice()+"\n");
		}
	}
	public static void main(String[] args) {
		new Main();
	}

}
