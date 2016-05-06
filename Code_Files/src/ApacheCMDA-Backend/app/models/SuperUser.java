package models;

public class SuperUser implements UserLevel{

	@Override
	public String getLevel(){
		return "Super";
	}

}