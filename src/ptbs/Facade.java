package ptbs;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Facade {
	int UserType;
	Product theSelectedProduct;
	int nProductCategory;
	ClassProductList theProductList;
	Person thePerson;
	
	int[] temp = {UserType};
	
	public void facade() throws FileNotFoundException, IOException {
		System.out.println("Currently in: Facade Class");
		boolean isLoggedIn = login(temp);
		UserType = temp[0];
		
		System.out.println("Select Product Type: \n1. Enter 0 for Meat \n2. Enter 1 for Produce");
		Scanner sc = new Scanner(System.in);
		if(sc.nextInt() == 0) {
			theSelectedProduct = new Product(0);
		} else if(sc.nextInt() == 1) {
			theSelectedProduct = new Product(1);
		} else {
			System.out.println("Enter either 0 or 1!");
		}
		
		nProductCategory = theSelectedProduct.ProductType;
		
		
	}
	
	public boolean login(int[] UserType) throws FileNotFoundException, IOException {
		Login l = new Login();
		l.logIn(UserType);
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
	
	public void createUserList() {
		
	}
	
	public void attachProductToUser() {
		
	}
	
	public void selectProduct() {
		
	}
	
	public void productOperation() {
		
	}
}
