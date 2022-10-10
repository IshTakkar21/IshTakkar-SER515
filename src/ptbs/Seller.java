package ptbs;

public class Seller extends Person {
	
	public Seller() {
		
	}

	public Seller(ProductMenu pm) {
		super(pm);
	}

	@Override
	public void showMenu() {
		System.out.println("Menu for Seller:");
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
