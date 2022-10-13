package ptbs;

import java.util.ArrayList;
import java.util.Iterator;

public class OfferingList {
	ArrayList<String> offerings = new ArrayList<String>();
	
	public OfferingList(ArrayList<String> newOfferings) {
		offerings = newOfferings;
	}

	public Iterator createIterator() {
		return this.offerings.iterator();
	}
}
