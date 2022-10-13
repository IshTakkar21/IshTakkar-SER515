package ptbs;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Login {
	boolean loggedIn;
	Login() {
		loggedIn = false;
	}
	
	public void logIn(int[] UserType, String[] UserName) throws FileNotFoundException, IOException {
		if(!loggedIn) {
			HashMap<String, String> map = new HashMap<String, String>();
			String line;
			String userName, password;
			int type;
			Scanner sc = new Scanner(System.in);
			Scanner sc2 = new Scanner(System.in);
			BufferedReader in;
			
			System.out.println("Enter User Type - 0 for buyer, 1 for seller: ");
			type = sc2.nextInt();
			
			UserType[0] = type;
			
			if(type == 0) {
				 in = new BufferedReader(new FileReader("BuyerInfo.txt"));
			} else if(type == 1) {
				in = new BufferedReader(new FileReader("SellerInfo.txt"));
			} else {
				System.out.println("Enter either 0 or 1!");
				return;
			}
			
			while((line = in.readLine()) != null) {
				String[] values = line.split(":");
				map.put(values[0], values[1]);
			}
			in.close();
			
			System.out.println("Enter Username: ");
			userName = sc.nextLine();
			System.out.println("Enter Password: ");
			password = sc.nextLine();
			
			if(map.containsKey(userName)) {
				String pass = map.get(userName);
				if(password.equals(pass)) {
					loggedIn = true;
					UserName[0] = userName;
				}	
				else
					System.out.println("Bad User!");
			} else
				System.out.println("Bad User!");
			
		} else {
			System.out.println("Already Logged In!");
		}
	}
	
}
