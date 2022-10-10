package ptbs;

public abstract class Person {
	ProductMenu theProductMenu;
	
	public Person() {
		
	}
	
	public Person(ProductMenu pm) {
		this.theProductMenu = pm;
	}
	
	public abstract void showMenu();
	
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
