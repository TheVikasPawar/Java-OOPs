
class Encapsule {
	private int value;
	
	public void setValue(int x) {
		value=x;
	}
	
	public int getValue() {
		return value;
	}
}
public class Encapsulation{
	public static void main(String[] args) {
		Encapsule r = new Encapsule();
		r.setValue(100);
		System.out.println(r.getValue());
	}
}
