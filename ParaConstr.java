
class ParaConst {
	int a,b;

	public ParaConst(int x,int y) {
		this.a=x;
		this.b=y;
	}
	public void show() {
		System.out.println(a+" "+b);
	}
	public ParaConst(int x,String y) {
		System.out.println(x+" "+y);
	}
}
public class ParaConstr{
	public static void main(String[] args) {
		ParaConst object = new ParaConst(10,20);
		object.show();
		ParaConst object1 = new ParaConst(20,"Vikas");
	}
}
