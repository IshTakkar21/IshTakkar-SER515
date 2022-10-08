package ptbs;

public abstract class NodeVisitor {
	public abstract void visitFacade(Facade facade);
	
	public abstract Reminder visitTrading(Trading trading);
	
	public abstract Reminder visitProduct(ClassProductList classProductList);
}
