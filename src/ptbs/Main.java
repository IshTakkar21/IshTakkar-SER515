package ptbs;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, IOException, InterruptedException {
		System.out.println("Currently in: Main Class");
		Thread.sleep(1000);
		System.out.println("Calling Facade...");
		Thread.sleep(1000);
		Facade f = new Facade();
		f.facade();
	}

}
