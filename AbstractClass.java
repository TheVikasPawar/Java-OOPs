abstract class Animal{
	public abstract void sound();
}

class Dog extends Animal{
	public void sound() {
		System.out.println("Bark");
	}
}

class Lion extends Animal{
	public void sound() {
		System.out.println("Roar");
	}
}

public class AbstractClass {
	public static void main(String[] args) {
		Dog ref = new Dog();
		ref.sound();
		Lion ref1= new Lion();
		ref1.sound();
	}
}
