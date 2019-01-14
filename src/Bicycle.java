
public class Bicycle implements CarbonFootprint{
	
	private int sizeOfWheel;
	private String frame;
	
	
	public Bicycle(int sizeOfWheel, String frame) {
		
		if(sizeOfWheel <= 0) {
			
			throw new IllegalArgumentException("O tamanho da roda deve ser > 0");
			
		}
		
		this.sizeOfWheel = sizeOfWheel;
		this.frame = frame;
	}


	public int getSizeOfWheel() {
		return sizeOfWheel;
	}


	public void setSizeOfWheel(int sizeOfWheel) {
		this.sizeOfWheel = sizeOfWheel;
	}


	public String getFrame() {
		return frame;
	}


	public void setFrame(String frame) {
		this.frame = frame;
	}
	
	public void pedal() {
		
	}


	@Override
	public double getCarbonFootprint() {
		return 0;
	}
}
