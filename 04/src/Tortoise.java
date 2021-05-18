import java.util.concurrent.ThreadLocalRandom;

public class Tortoise extends Runner{
	public static Integer tortoiseCtr = 0;
	
	public Tortoise(String name) {
		super.name = name;
		super.speed += ThreadLocalRandom.current().nextInt(25);
	}


	@Override
	public void run() {
		Integer boost = (ThreadLocalRandom.current().nextInt(10)>7) ? 15:0;
		super.distance += ThreadLocalRandom.current().nextInt(super.speed) + ThreadLocalRandom.current().nextInt(10)+boost; 
	}

}
