import java.util.Scanner;

public class Jptable {

	public Jptable() {
		int option;
		Scanner input = new Scanner(System.in);
		Controller c = new Controller();
		do {
			c.menu();
			option = input.nextInt();
			input.nextLine();
			if(option == 1) {
				c.simulation(input);
			}
			
		}while(option!=2);
		
		input.close();
		System.out.println("thank you for using the apps!!");
	}

	public static void main(String[] args) {
		new Jptable();

	}

}
