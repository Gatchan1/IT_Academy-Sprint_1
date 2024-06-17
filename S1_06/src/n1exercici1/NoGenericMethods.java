package n1exercici1;

public class NoGenericMethods {
	private String item1;
	private String item2;
	private String item3;
	
	public NoGenericMethods(String item1, String item2, String item3) {
		this.item1 = item1;
		this.item2 = item2;
		this.item3 = item3;
	}
	
	public void addItem1(String item1) {
		this.item1 = item1;
	}
	
	public void addItem2(String item2) {
		this.item2 = item2;
	}
	
	public void addItem3(String item3) {
		this.item3 = item3;
	}
	
	public String getItem1() {
		return item1;
	}
	
	public String getItem2() {
		return item2;
	}
	
	public String getItem3() {
		return item3;
	}
}
