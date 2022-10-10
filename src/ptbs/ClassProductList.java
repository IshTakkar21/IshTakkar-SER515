package ptbs;

import java.util.ArrayList;
import java.util.Iterator;

public class ClassProductList extends Reminder {
	
	ArrayList<String> products = new ArrayList<String>();
	
	public ClassProductList() {
		products.add("Prod1");
		products.add("Prod2");
		products.add("Prod3");
	}
	
	public Iterator createIterator() {
		return this.products.iterator();
	}
	
	public Reminder accept(NodeVisitor visitor) {
		return visitor.visitProduct(this);
	}
}
