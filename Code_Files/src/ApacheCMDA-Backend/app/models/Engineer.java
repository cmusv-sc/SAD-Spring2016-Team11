package models;
import java.util.*;

public class Engineer{
	private List<UserBase> items = new ArrayList<>();

	public void addItem( UserBase item ){
		items.add(item);
	}

	public void showEngineers(){
		for( UserBase each : items ){
			System.out.println( "level:"+each.Level() );
			System.out.println( "Name:"+each.getName() );
			System.out.println( "Password:"+each.getPassword() );
		}
	}
}