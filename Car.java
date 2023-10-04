package Labs;

public class Car {

	int speed;
	String brand;
	String color;
	
	public Car(int speed, String brand, String color) {
		this.speed= speed;
		this.brand=brand;
		this.color=color;
	}
	public void print() {
		System.out.println("Car Brand: "+ this.brand + ", Car Speed: "+ this.speed + ", Car Color: "+ this.color );
	}
}
