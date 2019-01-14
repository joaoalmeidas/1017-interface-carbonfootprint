
public class Building {
	
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
	
	
	
}
