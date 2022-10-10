package ptbs;

import java.util.Iterator;
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
		// calling the login logic
		boolean isLoggedIn = login(temp);
		if(isLoggedIn) {
			
			UserType = temp[0];
			System.out.println("Select Product Type: \n1. Enter 0 for Meat \n2. Enter 1 for Produce");
			Scanner sc = new Scanner(System.in);
			int ProductType = sc.nextInt();
			if(ProductType == 0) {
				theSelectedProduct = new Product(0);
				productOperation();
				nProductCategory = theSelectedProduct.ProductType;
			} else if(ProductType == 1) {
				theSelectedProduct = new Product(1);
				productOperation();
				nProductCategory = theSelectedProduct.ProductType;
			} else {
				System.out.println("Enter either 0 or 1!");
			}
			
			//calling the iterator logic on Offerings
			OfferingList ofl = new OfferingList();
			Iterator iterateOff = ofl.createIterator();
			OfferingIterator ofitr = new OfferingIterator();
			
			while(ofitr.hasNext(iterateOff)) {
				System.out.println(ofitr.Next(iterateOff));
			}
			
			//calling the iterator logic on Offerings
			ClassProductList pl = new ClassProductList();
			Iterator iterateProd = pl.createIterator();
			ProductIterator plitr = new ProductIterator();
			
			while(plitr.hasNext(iterateProd)) {
				System.out.println(plitr.Next(iterateProd));
			}
		}
		
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
		if(UserType == 0) {
			Buyer b = new Buyer();
			b = new Buyer(b.CreateProductMenu(theSelectedProduct.ProductType));
			b.showMenu();
			
		} else if(UserType == 1){
			Seller s = new Seller();
			s = new Seller(s.CreateProductMenu(theSelectedProduct.ProductType));
			s.showMenu();
		}
	}
}
