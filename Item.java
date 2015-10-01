public class Item {
	private int id;

	//Constructors
	public Item() {
		id = 0;
	}
	public Item(int id){
		this.id = id;
	}

	public String toString() {return "Item #" + id;}
}