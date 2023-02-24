
public class MethodOverloading {
	public void A(int a) {
		System.out.println(a);
	}
		public static void main(String[] args) {
		MethodOverloading ref = new MethodOverloading();
		ref.A(20);
		
		MethodOverloading ref1 = new A2();
		ref1.A(21);
	
	}
}
class A2 extends MethodOverloading{
	@Override
	public void A(int a) {
		System.out.println(a);
	}
	
}

