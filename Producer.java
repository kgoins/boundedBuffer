import java.util.Random;

public class Producer {
	private int quota;
	private int unique_id;
	private int sleep_time;
	private ThreadLocalRandom generator = new ThreadLocalRandom();

	public String toString() {return "Producer" + unique_id;}
	public String getStatus() {
		return "Producer " + unique_id + " produced " + quota + " items and slept " + sleep_time + " ms";
	}

	public Item produce() {
		quota = generator.nextInt(1,5);
		sleep_time = generator.nextInt(1,100);

		System.out.print("Producer" + unique_id + " ready to produce " + quota + "items");

		for (int i = 0; i < quota; i++) {
			
		}
	}

}