package ptbs;

public class Trading extends Reminder{
	
	//*******************Implementing the Iterator Design Pattern************************
	@Override
	public Reminder accept(NodeVisitor visitor) {
		return visitor.visitTrading(this);
	}

}
