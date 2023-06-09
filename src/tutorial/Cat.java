package tutorial;

// Dog is Super class or parent class. Cat is sub class or child class or drive class.
public class Cat extends Dog {
	private int food;
	
	public Cat(String name, int age, int food) {
		super(name, age);
		this.food = food;
	}
	//default parameters
	public Cat(String name, int age) {
		super(name, age);
		this.food = 50;
	}
	//default parameters
	public Cat(String name) {
		super(name, 0);
	}
	
	public void speak() {
		//Overrides speak method in Dog
		System.out.println("Meow my name is " + this.name + " and I get fed " + this.food);
	}
	
	public void eat(int x) {
		this.food -= x;
	} 
	
}
