import java.util.ArrayList;
public class BoundedBuffer<E> {
	/* Stores the buffer itself and supports the plug in of any item type
	as long as it has associated Producer / Consumer classes */

	private ArrayList<E> buffer;
	private int slots_full;

	// Constructors
	public BoundedBuffer<E>(int size) {
		buffer = new ArrayList<E>(3);
		for (int i = 0; i < 2; i++) {
			buffer[i] = 0;
		}
	}

	public void insert( E item, Producer p){
		if ( slots_full == buffer.length() ) {
		}
		buffer.append(item);
	}
}