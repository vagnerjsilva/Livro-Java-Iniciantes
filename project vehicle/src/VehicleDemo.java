
public class VehicleDemo {

	public static void main(String[] args) {
		Vehicle minivan =  new Vehicle();
		
		int range;
		
		
		//atribui valores a campos de minvan
		minivan.passengers = 7;
		minivan.fuelcap = 16;
		minivan.mpg = 21;
		
		//calcula a autonomia
		range = minivan.fuelcap * minivan.mpg;
		System.out.println("Minivan can carry " + minivan.passengers + " with a range of  " + range);

	}

}
