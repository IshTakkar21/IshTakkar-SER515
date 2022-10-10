package ptbs;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;

public class MeatProductMenu implements ProductMenu {

	@Override
	public void showMenu(ClassProductList pl) throws FileNotFoundException, IOException {
		System.out.println("Meat Menu");
		String line;
		BufferedReader in = new BufferedReader(new FileReader("ProductInfo.txt"));
		HashSet<String> set = new HashSet<String>();
;		while((line = in.readLine()) != null) {	
			String[] values = line.split(":");
			if(values[0].equals("Meat")) {
				set.add(values[1]);
			}
		}
		in.close();
		
		Iterator iterateProd = pl.createIterator();
		ProductIterator plitr = new ProductIterator();
		
		while(plitr.hasNext(iterateProd)) {
			String curr = (String) plitr.Next(iterateProd);
			if(set.contains(curr)) {
				System.out.println(curr);
			}
		}
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
