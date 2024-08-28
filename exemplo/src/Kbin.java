
public class Kbin {

	public static void main(String[] args) 
		throws java.io.IOException {
		char ch;
		
		System.out.print("Press a key followwed by Enter: ");
		
		ch = (char) System.in.read(); // obtém um char
		
		System.out.println("Your key is: " + ch);
	}

}
