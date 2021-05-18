
public abstract class Runner implements Comparable<Runner>{
	String name;
	Integer speed = 25;
	Integer distance = 0;
	public abstract void run();
	
	@Override
	public int compareTo(Runner o) {
		return o.distance - this.distance;
	}
	
}
