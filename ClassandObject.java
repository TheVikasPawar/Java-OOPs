
public class ClassandObject {
	/*
	 * Syntax:-
	 * 	access_modifier + class + class_name{
	 * 		data member;
	 * 		method;
	 * 		constructor;
	 * 		nested class;
	 * 		interface;
	 * 		}
	 */
	
	/*
	 * Object
	 * Syntax:-
	 * 
	 * class_name object=new class_name();
	 * 
	 */
	
	
	String name;
	int age;
	String color;
	
	public ClassandObject(String name1, int age1, String color1) {
		// TODO Auto-generated constructor stub
		this.name=name1;
		this.color=color1;
		this.age=age1;
	}
	
	public String getname() {
		return name;
	}
	
	public int getage() {
		return age;
	}
	
	public String getcolor() {
		return color;
	}
	
	public String toString() {
		return(	this.getname()+"\n"
				+this.getage()+"\n"
				+this.getcolor());
	}
	public static void main(String[] args) {
		ClassandObject obj = new ClassandObject("Dog",10,"White");
		System.out.println(obj.toString());
		System.out.println(obj.getage());
	}

}
