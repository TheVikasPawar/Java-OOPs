
public class ConstOverload {
	public static void main(String[] args) {
	A ref = new A();
	A ref1 = new A(21);
	A ref2 = new A("Vikas");
	}
}

class A{
	public A() {
		System.out.println("Check...");
	}
	public A(int x) {
		System.out.println(x);
	}
	public A(String name) {
		System.out.println(name);
	}
}
