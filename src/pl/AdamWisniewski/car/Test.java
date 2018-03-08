package pl.AdamWisniewski.car;

public class Test {

	public static void main(String[] args) {
		
		ElectricEngine electricEngine = new ElectricEngine();
		
		ConventionalEngine conventionalEngine = new ConventionalEngine();
		
		Car teslaCar = new Car(electricEngine);
		
		teslaCar.refuelCar(50);
		
		

	}

}
