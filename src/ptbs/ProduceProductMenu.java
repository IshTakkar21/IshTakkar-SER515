package ptbs;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;

public class ProduceProductMenu implements ProductMenu {

	@Override
	public void showMenu(ClassProductList pl) throws FileNotFoundException, IOException {
		System.out.println("Produce Menu");
		String line;
		BufferedReader in = new BufferedReader(new FileReader("ProductInfo.txt"));
		HashSet<String> set = new HashSet<String>();
;		while((line = in.readLine()) != null) {	
			String[] values = line.split(":");
			if(values[0].equals("Produce")) {
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
