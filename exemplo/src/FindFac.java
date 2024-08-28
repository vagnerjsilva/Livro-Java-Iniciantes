/*
 * Usa laços aninhados para encontrar os 
 * fatores de números d 2 a 100.
 * 
 */
public class FindFac {

	public static void main(String[] args) {
		for(int i = 2; i < 100; i++) {
			System.out.print("Factors of " + i + ": ");
			for( int j = 2; j < i; j++)
				if((i%j) == 0) System.out.print(j + " ");
			System.out.println();
		}

	}

}
