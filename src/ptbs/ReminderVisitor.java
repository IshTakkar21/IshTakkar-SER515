package ptbs;

public class ReminderVisitor extends NodeVisitor	 {
	Reminder m_Reminder;
	
	//*******************Implementing the Visitor Design Pattern************************
	@Override
	public void visitFacade(Facade f) {
		System.out.println("**********************************************");
		System.out.println("Visiting the Facade class!");
		return;
	}

	@Override
	public Reminder visitTrading(Trading t) {
		System.out.println("Visiting the Trading class!");
		return t;
	}

	@Override
	public Reminder visitProduct(ClassProductList p) {
		System.out.println("Visiting the Product class!");
		System.out.println(p.products);
		System.out.println("**********************************************");
		for(String x : p.products) {
			System.out.println("Product visited: " + x);
			p.t.accept(new ReminderVisitor());
		}
		return p;
	}

}
