// Introduction to oop in java

public class Main {

	public static void main(String[] args) {

		// Creating a new Car instance
		Car car = new Car();

		// Set characteristics of this car
		car.setMake("Porsche");
		car.setModel("Carrera");
		car.setDoors(2);
		car.setConvertible(true);
		car.setColor("black");
		System.out.println("make = " + car.getMake());
		System.out.println("model = " + car.getModel());
		car.describeCar();

		// Creating a new Car instance
		Car targa = new Car();

		// Set characteristics of this car
		targa.setMake("Porsche");
		targa.setModel("Targa");
		targa.setDoors(2);
		targa.setConvertible(false);
		targa.setColor("red");

		targa.describeCar();
	}
}
