package ptbs;

import java.util.ArrayList;
import java.util.Iterator;

public class ClassProductList extends Reminder {
	
	ArrayList<String> products = new ArrayList<String>();
	
	public ClassProductList(ArrayList<String> newProducts) {
		products = newProducts;
	}
	
	public Iterator createIterator() {
		return this.products.iterator();
	}
	
	public Reminder accept(NodeVisitor visitor) {
		return visitor.visitProduct(this);
	}
}
