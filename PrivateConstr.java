
class PrivateConst {
	int a,b,c;
	private PrivateConst() {
		a=10;b=20;c=30;
		System.out.println(a+" "+b+" "+c);
	}
}

public class PrivateConstr{
	public static void main(String[] args) {
	//	PrivateConst ref = new PrivateConst();
		
	}
}
//Cant access outside the class.
