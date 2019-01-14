
public class Car {
	
	private int numberOfSeats;
	private int horsepower;
	
	
	public Car(int numberOfSeats, int horsepower) {
		
		if(numberOfSeats <= 0) {
			
			throw new IllegalArgumentException("Numero de assentos deve ser > 0");
			
		}
		
		if(numberOfSeats <= 0) {
			
			throw new IllegalArgumentException("Horsepower deve ser > 0");
			
		}
		
		this.numberOfSeats = numberOfSeats;
		this.horsepower = horsepower;
	}
	
	
	
}
