
public class AddMeth {

	public static void main(String[] args) {
		Vehicle minivan = new Vehicle();
		Vehicle sportscar = new Vehicle();
		
		int range1, range2;
		
		//atribui valores a campos de minivan
		minivan.passengers = 7;
		minivan.fuelcap = 16;
		minivan.mpg = 21;
		
		//atribui valores a campos de sportscar
		sportscar.passengers = 2;
		sportscar.fuelcap = 14;
		sportscar.mpg = 12;
		
		//calcula a autonomia presumindo um tanque cheio de gasolina
		range1 = minivan.fuelcap * minivan.mpg;
		range2 = sportscar.fuelcap * sportscar.mpg;
		
		
		System.out.print("Minivan can carry " + minivan.passengers + ". ");
		
		minivan.range();// exibe aautonomia de minivan
		
		System.out.print("Sportscar can carry " + sportscar.passengers + ". ");
		
		sportscar.range();

	}

}
