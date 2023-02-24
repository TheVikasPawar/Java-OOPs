class z{
	public z()
	{
		System.out.println("Constructor");
	}
	{	//need to create object
		System.out.println("Instance block");
	}
	static{	//no need to create object
		System.out.println("Static Block");
	}
}
public class StaticBlock {
	public static void main(String[] args) {
		z ref = new z();
	}
	

}
