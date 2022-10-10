package ptbs;

import java.util.ArrayList;
import java.util.Iterator;

public class OfferingList {
	ArrayList<String> offerings = new ArrayList<String>();
	
	public OfferingList() {
		offerings.add("Pork");
		offerings.add("Beef");
		offerings.add("Chicken");
	}
	
	public Iterator createIterator() {
		return this.offerings.iterator();
	}
}
