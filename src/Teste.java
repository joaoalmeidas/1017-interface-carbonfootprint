import java.util.ArrayList;

public class Teste {

	public static void main(String[] args) {
		
		Car carro = new Car(5, 110, "gasolina", 400);
		Building habitação = new Building(100, 10, 300, 20, 4);
		Bicycle bicileta = new Bicycle(25, "carbon");
		
		ArrayList<CarbonFootprint> array = new ArrayList();
		
		array.add(bicileta);
		array.add(habitação);
		array.add(carro);
		
		for(CarbonFootprint atual: array) {
			
			System.out.println(atual);
			
		}
		
	}

}
