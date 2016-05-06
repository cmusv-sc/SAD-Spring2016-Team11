package models;

public class NormalUser implements UserLevel{

	@Override
	public String getLevel(){
		return "Normal";
	}
}