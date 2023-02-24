class A1{
	public A1() {
		System.out.println("Constructor");
	}
	{
		System.out.println("Instance Block");
	}
	public void show() {
		System.out.println("Show Method");
	}
	public static void showdata() {
		System.out.println("Showdata Method");
	}
}
public class InstanceBlock {
	public static void main(String[] args) {
		A1.showdata();
		A1 ref = new A1();
		ref.show();
		
	}

}
