package ptbs;

public class MeatProductMenu implements ProductMenu {

	@Override
	public void showMenu() {
		System.out.println("Meat Menu");
	}

	@Override
	public void showAddButton() {
		System.out.println("Meat Menu: Add Button Shown!");
	}

	@Override
	public void showViewButton() {
		System.out.println("Meat Menu: View Button Shown!");
	}

	@Override
	public void showRadioButton() {
		System.out.println("Meat Menu: Radio Button Shown!");
	}

	@Override
	public void showLabels() {
		System.out.println("Meat Menu: Labels Shown!");
	}

	@Override
	public void showComboxes() {
		System.out.println("Meat Menu: Combo Box Shown!");
	}

}
