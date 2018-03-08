package pl.AdamWisniewski.car;

public class Car {

	private ElectricEngine electricEngine;
	private ConventionalEngine conventionalEngine;
	private boolean carWorks = false;
	private int fuel = 100;

	// Electric car
	
	public Car(ElectricEngine electricEngine) {
		this.electricEngine = electricEngine;
	}

	// Conventional Car
	public Car(ConventionalEngine conventionalEngine) {
		this.conventionalEngine = conventionalEngine;
	}

	// Hybrid Car
	public Car(ElectricEngine electricEngine, ConventionalEngine conventionalEngine) {
		this.electricEngine = electricEngine;
		this.conventionalEngine = conventionalEngine;
	}

	public void turnOnCar() {
		carWorks = true;
	}

	public void turnOfCar() {
		carWorks = false;
	}

	public void refuelCar(int fuelAdded) {

		if (conventionalEngine == null) {
			System.out.println("You can't fuel electric Car! Look for charging distributor.");
		} else {
			fuel += fuelAdded;
		}
	}

	public void move(String pointA, String pointB) {
        System.out.println("So lets take a ride from " + pointA + " to " + pointB + "!");
    }
}
