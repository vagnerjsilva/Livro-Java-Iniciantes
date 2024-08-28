
public class CompFuel {

	public static void main(String[] args) {
		Vehicle minivan = new Vehicle();
		Vehicle sportscar = new Vehicle();
		
		double gallons;
		int dist = 252;
		
		//atribui valores a campos de minivan
		minivan.passengers = 7;
		minivan.fuelcap = 16;
		minivan.mpg = 21;
		
		//atribui valores a campos de sportscar
		sportscar.passengers = 2;
		sportscar.fuelcap = 14;
		sportscar.mpg = 12;
		
		gallons = minivan.fuelneeded(dist);
		
		System.out.println("To go " + dist + " miles minvan needs " + gallons + " gallons of fuel.");
		//tradução: "Para ir  252 milhas, a minvan precisa de 12.0 galões de combustível."
		
		gallons = sportscar.fuelneeded(dist);
		
		System.out.println("To go " + dist + " miles minvan needs " + gallons + " gallons of fuel.");
		
	}

}
