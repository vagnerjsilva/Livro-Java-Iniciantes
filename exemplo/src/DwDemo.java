
public class DwDemo {

	public static void main(String[] args) throws java.io.IOException{
		char ch;

		do {
			System.out.println("Press a key followed by ENTER: ");
			ch = (char) System.in.read(); // obtém um char
		} while (ch != 'q');
	}

}
