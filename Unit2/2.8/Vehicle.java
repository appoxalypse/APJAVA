public class Vehicle {

	//fields
	private boolean usedFlag;
	private String model;
	private int numTires;

	//constructors
	public Vehicle(boolean used, String theModel, int tires) {
		usedFlag = used;
		model = theModel;
		numTires = tires;
	}

	//methods
	//sample (not complete)
	//what the class can do
	public void start() {}
	public void turnLeft() {}
	public void turnRight() {}
	public void stop() {}
	public void forward(int speed) {}

	//main
	public static void main(String[] args) {

		Vehicle motorcyle1 = new Vehicle(false, "Honda", 2);
		Vehicle car1 = new Vehicle(true, "Toyota", 4);
		motorcyle1.startEngine();
		car1.startEngine();
		motorcyle1.forward(20);

	}

}