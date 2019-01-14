
public class Car implements CarbonFootprint{
	
	private int numberOfSeats;
	private int horsepower;
	private String fuel;
	private double kmPerMonth;
	
	public Car(int numberOfSeats, int horsepower, String fuel, double kmPerMonth) {
		
		if(!fuel.equals("diesel") || !fuel.equals("gasolina") || !fuel.equals("flex") || !fuel.equals("gnv")) {
			
			throw new IllegalArgumentException("combustivel nao válido");
			
		}
		
		this.numberOfSeats = numberOfSeats;
		this.horsepower = horsepower;
		this.fuel = fuel;
		this.kmPerMonth = kmPerMonth;
	}
	

	public double getKmPerMonth() {
		return kmPerMonth;
	}


	public void setKmPerMonth(double kmPerMonth) {
		this.kmPerMonth = kmPerMonth;
	}


	public String getFuel() {
		return fuel;
	}




	public void setFuel(String fuel) {
		this.fuel = fuel;
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
		
		if(getFuel().equals("flex")) {
			
			return getKmPerMonth() * 0.8712;
			
		}else if(getFuel().equals("gasolina")) {
			
			return getKmPerMonth() * 0.5473;
			
		}else if(getFuel().equals("diesel")) {
			
			return getKmPerMonth() * 2.8176;
			
		}else if(getFuel().equals("gnv")) {
			
			return getKmPerMonth() * 0.6073;
			
		}
		
		return 0;
	}


	@Override
	public String toString() {
		return "Car [numberOfSeats=" + numberOfSeats + ", horsepower=" + horsepower + "hp, fuel=" + fuel + ", kmPerMonth="
				+ kmPerMonth + "km/month]%nEmissao de CO2e anual: "+ getCarbonFootprint();
	}
	
	
	
}
