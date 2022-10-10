package ptbs;

import java.util.Iterator;

public interface ListIterator {
	public abstract boolean hasNext(Iterator iterator);
	
	public abstract Object Next(Iterator iterator);
	
	public abstract void MoveToHead(Iterator iterator);
	
	public abstract void Remove(Iterator iterator);
}
