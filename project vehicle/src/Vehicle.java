
public class Vehicle {
	int passengers; // números de passageiros
	int fuelcap; // capacidade de armazenamento de combustível em ga~lões
	int mpg; //consumo de combustível em milhas por galão
	
	// Esse é um construtor para Vehicle
	Vehicle(int p, int f, int m) {
		passengers = p;
		fuelcap = f;
		mpg = m;
	}
	
	int range() { // retorna a autonomia
		return mpg * fuelcap;
	}
	
	//caucula o combustível necessário para cobrir uma determinada distância.
	double fuelneeded(int miles) { // fuel needed = combustível necessário
		return (double) miles / mpg;
	}
}
