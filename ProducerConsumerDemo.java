public class Driver {	
	public static void main(String[] args) {
		BoundedBuffer<Item> bb = new BoundedBuffer<Item>(3);

		Producer p1 = new Producer(3);
		Consumer c1 = new Consumer(5);

		Producer p2 = new Producer(4);
		Consumer c2 = new Consumer(4);
	}
}