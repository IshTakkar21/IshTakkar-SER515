package ptbs;

import java.util.ArrayList;
import java.util.Iterator;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Facade {
	int UserType;
	Product theSelectedProduct;
	int nProductCategory;
	ClassProductList theProductList;
	Person thePerson;
	String userName;
	
	int[] temp = {UserType};
	String[] stringTemp = {userName};
	
	//*******************Implementing the Facade Design Pattern************************
	public Facade() throws FileNotFoundException, IOException {
		System.out.println("**********************************************");
		System.out.println("Currently in: Facade Class");
		
		// calling the login logic
		boolean isLoggedIn = login(temp, stringTemp);
		if(isLoggedIn) {
			userName = stringTemp[0];
			UserType = temp[0];
			if(UserType == 0)
				thePerson = new Buyer();
			else if(UserType == 1)
				thePerson = new Seller();
			else
				return;
			thePerson.PersonName = userName;
			attachProductToUser();
			
			System.out.println("**********************************************");
			System.out.println("Enter Product Type - 0 for Meat, 1 for Produce");
			Scanner sc = new Scanner(System.in);
			int ProductType = sc.nextInt();
			
			//*******************Implementing the Bridge and the Factory Design Patterns************************
			if(ProductType == 0) {
				theSelectedProduct = new Product(0);
				nProductCategory = theSelectedProduct.ProductType;
				productOperation();
				
			} else if(ProductType == 1) {
				theSelectedProduct = new Product(1);
				nProductCategory = theSelectedProduct.ProductType;
				productOperation();
				
			} else {
				System.out.println("**********************************************");
				System.out.println("Enter either 0 or 1!");
			}
			
			remind();
			
		}
		
	}
	
	public boolean login(int[] UserType, String[] UserName) throws FileNotFoundException, IOException {
		Login l = new Login();
		l.logIn(UserType, UserName);
		return l.loggedIn;
	}
	
	public void addTrading(TradingMenu tm) {
		tm.addTrading();
	}
	
	public void viewTrading(TradingMenu tm) {
		tm.viewTrading();
	}
	
	public void viewOffering(OfferingMenu om) {
		om.viewOffering();
	}
	
	public void markOffering(OfferingMenu om) {
		om.markOffering();
	}
	
	public void submitOffering(OfferingMenu om) {
		om.submitOffering();
	}
	
	public void remind() {
		System.out.println("**********************************************");
		System.out.println("Implementing the Visitor Design Pattern");
		NodeVisitor remind = new ReminderVisitor();
		theProductList.accept(remind);
	}
	
	public void createUser(UserInfoItem userInfoItem) {
		userInfoItem.createUser();
	}
	
	public void createProductList() {
		/*the product list has already been created in the attachProductToUser function*/
		System.out.println(theProductList);
	}
	
	public void attachProductToUser() throws FileNotFoundException, IOException {
		String line;
		BufferedReader in = new BufferedReader(new FileReader("UserProduct.txt"));
		ArrayList<String> userProdList = new ArrayList<String>();
;		while((line = in.readLine()) != null) {
			String[] values = line.split(":");
			if(values[0].equals(thePerson.PersonName)) {
				userProdList.add(values[1]);
			}
		}
		in.close();
		theProductList = new ClassProductList(userProdList);
		thePerson.ProductList = theProductList;
	}
	
	public void selectProduct() {
		System.out.println("**********************************************");
		System.out.println(theSelectedProduct.ProductType);
	}
	
	//*******************Function to implement the Bridge and the Factory Design Patterns************************
	public void productOperation() throws FileNotFoundException, IOException {
		if(UserType == 0) {
			Buyer b = new Buyer();
			b = new Buyer(b.CreateProductMenu(theSelectedProduct.ProductType), theProductList);
			b.showMenu();
			
		} else if(UserType == 1){
			Seller s = new Seller();
			s = new Seller(s.CreateProductMenu(theSelectedProduct.ProductType), theProductList);
			s.showMenu();
		}
	}
}
