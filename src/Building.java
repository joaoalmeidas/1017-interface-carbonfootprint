
public class Building implements CarbonFootprint{
	
	private double area;
	private double height;
	private double energyComsuption;
	private double gasComsuption;
	private int habitants;
	

	public Building(double area, double height, double energyComsuption, double gasComsuption, int habitants) {
		super();
		this.area = area;
		this.height = height;
		this.energyComsuption = energyComsuption;
		this.gasComsuption = gasComsuption;
		this.habitants = habitants;
	}


	public double getArea() {
		return area;
	}


	public void setArea(double area) {
		this.area = area;
	}


	public double getHeight() {
		return height;
	}


	public void setHeight(double height) {
		this.height = height;
	}
	
	
	
	public double getEnergyComsuption() {
		return energyComsuption;
	}


	public void setEnergyComsuption(double energyComsuption) {
		this.energyComsuption = energyComsuption;
	}


	public double getGasComsuption() {
		return gasComsuption;
	}


	public void setGasComsuption(double gasComsuption) {
		this.gasComsuption = gasComsuption;
	}

	

	public int getHabitants() {
		return habitants;
	}


	public void setHabitants(int habitants) {
		this.habitants = habitants;
	}


	public void adjustTemperature() {
		
	}


	@Override
	public double getCarbonFootprint() {
		// TODO Auto-generated method stub
		return (0.001626 * getEnergyComsuption()) + (0.02484 * getGasComsuption()) / getHabitants();
	}


	@Override
	public String toString() {
		return "Building [area=" + area + ", height=" + height + ", energyComsuption=" + energyComsuption
				+ "kWh/month, gasComsuption=" + gasComsuption + "m3/month, habitants=" + habitants + "]%nEmissao de CO2e anual: "+ getCarbonFootprint();
	}
	
	
	
}
