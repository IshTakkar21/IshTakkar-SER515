package ptbs;

public class ProduceProductMenu implements ProductMenu {

	public void showMenu() {
		System.out.println("Produce Menu");
	}

	@Override
	public void showAddButton() {
		System.out.println("Produce Menu: Add Button Shown!");
	}

	@Override
	public void showViewButton() {
		System.out.println("Produce Menu: View Button Shown!");
	}

	@Override
	public void showRadioButton() {
		System.out.println("Produce Menu: Radio Button Shown!");
	}

	@Override
	public void showLabels() {
		System.out.println("Produce Menu: Labels Shown!");
	}

	@Override
	public void showComboxes() {
		System.out.println("Produce Menu: Combo Box Shown!");
	}

}
