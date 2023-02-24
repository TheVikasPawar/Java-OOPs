import java.util.Scanner;

public class Demo {
	//Demo class
	String name;
	int age;
	int rollnumber;
		
	public void input() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the name: ");
		name = input.next();
		
		System.out.print("Enter the age: ");
		age = input.nextInt();
		
		System.out.print("Enter the roll number: ");
		rollnumber= input.nextInt();
	}
	
	public void output() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(rollnumber);
	}
	
	public static void main(String[] args) {
		Demo object = new Demo();
		object.input();
		object.output();
	}

}
