package tutorial;

public interface Vehicle {
//completely abstract - to be inherited from - cannot create an instance of 'Vehicle' - implement into classes
	
	final int gears = 5;
	//final if you want the variable to not change across classes
	
	void speedUp(int a);
	//defines the method
	void slowDown(int a);
	void changeGear(int a);
}
