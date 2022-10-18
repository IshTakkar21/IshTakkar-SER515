package ptbs;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		System.out.println("**********************************************");
		System.out.println("Currently in: Main Class");
		System.out.println("**********************************************");
		System.out.println("Calling Facade...");
		Facade f = new Facade();
	}

}
