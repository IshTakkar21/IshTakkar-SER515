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
	
	public void facade() throws FileNotFoundException, IOException {
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
			
			System.out.println("Select Product Type: \n1. Enter 0 for Meat \n2. Enter 1 for Produce");
			Scanner sc = new Scanner(System.in);
			int ProductType = sc.nextInt();
			
			if(ProductType == 0) {
				theSelectedProduct = new Product(0);
				nProductCategory = theSelectedProduct.ProductType;
				productOperation();
			} else if(ProductType == 1) {
				theSelectedProduct = new Product(1);
				nProductCategory = theSelectedProduct.ProductType;
				productOperation();
			} else {
				System.out.println("Enter either 0 or 1!");
			}
			
//			//calling the iterator logic on Offerings
//			OfferingList ofl = new OfferingList();
//			Iterator iterateOff = ofl.createIterator();
//			OfferingIterator ofitr = new OfferingIterator();
//			
//			while(ofitr.hasNext(iterateOff)) {
//				System.out.println(ofitr.Next(iterateOff));
//			}
			
		}
		
	}
	
	public boolean login(int[] UserType, String[] UserName) throws FileNotFoundException, IOException {
		Login l = new Login();
		l.logIn(UserType, UserName);
		return l.loggedIn;
	}
	
	public void addTrading() {
		
	}
	
	public void viewTrading() {
		
	}
	
	public void decideBidding() {
		
	}
	
	public void discussBidding() {
		
	}
	
	public void submitBidding() {
		
	}
	
	public void remind() {
		
	}
	
	public void createUser(UserInfoItem userInfoItem) {
		userInfoItem.createUser();
	}
	
	public void createProductList(ArrayList<String> list) {
//		//calling the iterator logic on Products
//		theProductList = new ClassProductList(list);
//		Iterator iterateProd = theProductList.createIterator();
//		ProductIterator plitr = new ProductIterator();
//		
//		while(plitr.hasNext(iterateProd)) {
//			System.out.println(plitr.Next(iterateProd));
//		}
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
		
	}
	
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
