package ptbs;

public class ReminderVisitor extends NodeVisitor	 {
	Reminder m_Reminder;

	@Override
	public void visitFacade(Facade facade) {
		//logic goes here
	}

	@Override
	public Reminder visitTrading(Trading trading) {
		return null;
	}

	@Override
	public Reminder visitProduct(ClassProductList classProductList) {
		return null;
	}

}
