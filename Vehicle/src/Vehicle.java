
public class Vehicle {
	int passengers; // números de passageiros
	int fuelcap; // capacidade de armazenamento de combustível em ga~lões
	int mpg; //consumo de combustível em milhas por galão
	
	int range() { // retorna a autonomia
		return mpg * fuelcap;
	}
	
	//caucula o combustível necessário para cobrir uma determinada distância.
	double fuelneeded(int miles) { // fuel needed = combustível necessário
		return (double) miles / mpg;
	}
}
