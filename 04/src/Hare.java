import java.util.concurrent.ThreadLocalRandom;

public class Hare extends Runner{
	public static Integer hareCtr = 0;
	public Hare(String name) {
		super.name = name;
		super.speed += ThreadLocalRandom.current().nextInt(50);
	}

	@Override
	public void run() {
		super.distance += ThreadLocalRandom.current().nextInt(super.speed);
	}

}
