package ptbs;

public class ClassProductList extends Reminder {
	public Reminder accept(NodeVisitor visitor) {
		return visitor.visitProduct(this);
	}
}
