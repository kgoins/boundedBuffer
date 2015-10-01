public class Item {
	private int data;

	//Constructors
	public Item() {
		data = 0;
	}
	public Item(int data){
		this.data = data;
	}

	public void setData(int input) {data = input;}
	public int getData() {return data;}

	public String toString() {
		return "Item data: " + data;
	}
}