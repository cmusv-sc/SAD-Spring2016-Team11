package models;

public class EngineerBuilder{

	public Engineer prepareTester(){
		Engineer e = new Engineer();
		e.addItem( new AutomationTester() );
		e.addItem( new ManualTester() );
		return e;
	}

}