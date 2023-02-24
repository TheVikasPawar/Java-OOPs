import java.util.Scanner;

class M{
	String name;
	int age;
	int rollnumber;
	
	public void input() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter name,age,rollnumber:");
		name = in.next();
		age = in.nextInt();
		rollnumber = in.nextInt();
	}
}

public class Inheritance extends M {
	public void output() {
		System.out.println(name+"\n"+age+"\n"+rollnumber);
	}
	
	public static void main(String[] args) {
		Inheritance ref = new Inheritance();
		ref.input();
		ref.output();
	}

}
