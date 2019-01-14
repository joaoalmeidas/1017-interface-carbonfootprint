
public class Building implements CarbonFootprint{
	
	private double area;
	private double height;
	
	
	public Building(double area, double height) {
		
		if(area <= 0) {
			
			throw new IllegalArgumentException("Área deve ser > 0");
			
		}
		
		if(height <= 0) {
			
			throw new IllegalArgumentException("Altura deve ser > 0");
			
		}
		
		this.area = area;
		this.height = height;
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
	
	public void adjustTemperature() {
		
	}


	@Override
	public double getCarbonFootprint() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
