package ptbs;

import java.io.FileNotFoundException;
import java.io.IOException;

public abstract class Person {
	ProductMenu theProductMenu;
	public ClassProductList ProductList;
	public String PersonName;
	
	public Person() {
		
	}
	
	public Person(ProductMenu pm, ClassProductList pl) {
		this.theProductMenu = pm;
		this.ProductList = pl;
	}
	
	public abstract void showMenu() throws FileNotFoundException, IOException;
	
	public abstract ProductMenu CreateProductMenu(int ProductType);
	
	public void showAddButton() {
		theProductMenu.showAddButton();
	}
	
	public void showViewButton() {
		theProductMenu.showViewButton();
	}
	
	public void showRadioButton() {
		theProductMenu.showRadioButton();
	}
	
	public void showLabels() {
		theProductMenu.showLabels();
	}
	
	public void showComboxes() {
		theProductMenu.showComboxes();
	}
}
