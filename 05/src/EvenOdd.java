import java.util.*;

public class EvenOdd {
	public EvenOdd() {
		Scanner scan = new Scanner(System.in);
		int even,odd;
		do {
		System.out.print("How many number of even number you want to display?[>0]:");
		even = scan.nextInt();
		scan.nextLine();
		}while(even<=0);
		do {
		System.out.print("How many number of odd number you want to display?[>0]:");
		odd = scan.nextInt();
		scan.nextLine();
		}while(odd<=0);
		
		Thread t1 = new Thread(new customRunnable(even) {
			public void run(){
				for(int i=0,j=0;i<this.count;i++,j+=2) {
					System.out.println("Even number :"+j);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}); 
		Thread t2 = new Thread(new customRunnable(odd) {
			public void run(){
				for(int i=0,j=1;i<this.count;i++,j+=2) {
					System.out.println("Odd number :"+j);
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}); 
		t1.start();
		t2.start();
		
	}
	
	public static void main(String[] args) {
		new EvenOdd();
	}

}
