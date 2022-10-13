package ptbs;

public class Trading extends Reminder{
	
	@Override
	public Reminder accept(NodeVisitor visitor) {
		return visitor.visitTrading(this);
	}

}
