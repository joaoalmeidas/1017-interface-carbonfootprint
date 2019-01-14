
public class Car implements CarbonFootprint{
	
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


	public int getNumberOfSeats() {
		return numberOfSeats;
	}


	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}


	public int getHorsepower() {
		return horsepower;
	}


	public void setHorsepower(int horsepower) {
		this.horsepower = horsepower;
	}
	
	
	public void move() {
		
	}


	@Override
	public double getCarbonFootprint() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
