package ptbs;

public class ReminderVisitor extends NodeVisitor	 {
	Reminder m_Reminder;

	@Override
	public void visitFacade(Facade f) {
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
		for(String x : p.products) {
			p.t.accept(new ReminderVisitor());
		}
		return p;
	}

}
