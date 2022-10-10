package ptbs;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

public class Buyer extends Person {
	public Buyer() {
		
	}

	public Buyer(ProductMenu pm, ClassProductList pl) {
		super(pm, pl);
	}
	
	@Override
	public void showMenu() throws FileNotFoundException, IOException {
		System.out.println("Menu for Buyer:");
		
		theProductMenu.showMenu(ProductList);
		showAddButton();
		showViewButton();
		showRadioButton();
		showLabels();
		showComboxes();
	}

	@Override
	public ProductMenu CreateProductMenu(int ProductType) {
		if(ProductType == 0)
			return new MeatProductMenu();
		else if(ProductType == 1)
			return new ProduceProductMenu();
		return null;
	}

}
