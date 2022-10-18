package ptbs;

import java.util.Iterator;

public class ProductIterator implements ListIterator {

	//*******************Implementing the Iterator Design Pattern************************
	@Override
	public boolean hasNext(Iterator iterator) {
		return iterator.hasNext();
	}

	@Override
	public Object Next(Iterator iterator) {
		if(this.hasNext(iterator)) {
			return iterator.next();
		}
		return null;
	}

	//TODO: add concrete logic to MoveToHead
	@Override
	public void MoveToHead(Iterator iterator) {
		System.out.println("Moved iterator to head!");
	}

	@Override
	public void Remove(Iterator iterator) {
		iterator.remove();
	}

}
