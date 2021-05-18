import java.util.Scanner;

public class Controller {

	public void dataTable(Integer first,Integer second) {
		String format1 = "+%-4s%-13s%-4s|%-2s%-11s%-2s|%-2s%-11s%-2s|%-2s%-13s%-2s|%-4s%-12s%-4s+\n";
		String format2 = "+%-6s%-13s%-4s|%-8s%-9s%-3s|%-8s%-9s%-3s|%-6s%-11s%-4s|%-15s%-23s%-3s+\n";
		System.out.printf("+=================================================================================================================================+\n");
		System.out.printf(format1," ","+ (String type)"," "," ","(Character Type)"," "," ","* (Integer type)"," "," ","/ (Floating Type)"," "," ","input 1 == input 2 (Boolean Type)"," ");
		System.out.printf("+=================================================================================================================================+\n");
		System.out.printf(format2," ",first.toString()+" + "+second.toString()," "," ",(char)first.intValue()+" "+(char)second.intValue()," "," ",(first.intValue()*second.intValue())," "," ",first.floatValue()/second.floatValue()," "," ",first.equals(second)," ");
		System.out.printf("+=================================================================================================================================+\n");
		System.out.print("Press enter to proceed..");
	}
	public void basicArith(Integer first,Integer second) {
		System.out.println("+=====================================================================+");
		System.out.println("+Data Type : Integer                                                  +");
		String format1 = "+%-6s%-1s%-6s|%-6s%-1s%-6s|%-6s%-1s%-6s|%-6s%-1s%-6s|%-6s%-1s%-6s+\n";
		String format2 = "+%-4s%-5s%-4s|%-4s%-5s%-4s|%-4s%-5s%-4s|%-4s%-5s%-4s|%-4s%-5s%-4s+\n";
		System.out.println("+=====================================================================+");
		System.out.printf(format1," ","+"," "," ","-"," "," ","*"," "," ","/"," "," ","%"," ");
		System.out.println("+=====================================================================+");
		System.out.printf(format2," ",first+second," "," ",first-second," "," ",first*second," "," ",first/second," "," ",first%second," ");
		System.out.println("+=====================================================================+");
		System.out.print("Press enter to proceed..");
	}
	public void logicTable(Boolean first,Boolean second) {
		System.out.println("+=======================================================+");
		System.out.println("+Logical Table                                          +");
		String format1 = "+%-5s%-3s%-5s|%-5s%-3s%-5s|%-5s%-3s%-5s|%-5s%-3s%-5s+\n";
		String format2 = "+%-4s%-5s%-4s|%-4s%-5s%-4s|%-4s%-5s%-4s|%-4s%-5s%-4s+\n";
		System.out.println("+=======================================================+");
		System.out.printf(format1," ","!P1"," "," ","!P2"," "," ","&&"," "," ","||"," ");
		System.out.println("+=======================================================+");
		System.out.printf(format2," ",!first.booleanValue()," "," ",!second.booleanValue()," "," ",first.booleanValue()&&second.booleanValue()," "," ",first.booleanValue()||second.booleanValue()," ");
		System.out.println("+=======================================================+");
		System.out.print("Press enter to proceed..");
	}
	public int getNumber(String str,Scanner input) {
		int num;
		do {
			System.out.print("Input the "+ str +" number [1 - 100](inclusive):");
			try {
				num = input.nextInt();
			} catch (Exception e) {
				num = -1;
			}
			input.nextLine();
		}while(num<1||num>100);
		
		return num;
	}
	public Boolean getBool(String str,Scanner input) {
		Boolean state = null;
		do {
			System.out.print("Give me value for p"+ str +" [true | false]:");
			try {
				state = input.nextBoolean();
			} catch (Exception e) {
				state = null;
			}
			input.nextLine();
		}while(state == null);
		
		return state;
	}
	
	public void menu() {
		System.out.println("1. Start The Simulation!!");
		System.out.println("2. Close App");
	}
	
	public void simulation(Scanner input) {
		Integer first_num = getNumber("first",input);
		Integer second_num = getNumber("second",input);
		
		dataTable(first_num,second_num);
		input.nextLine();
		
		basicArith(first_num,second_num);
		input.nextLine();
		
		Boolean p1 = getBool("1",input);
		Boolean p2 = getBool("2",input);
		
		logicTable(p1,p2);
		input.nextLine();
	}

}
