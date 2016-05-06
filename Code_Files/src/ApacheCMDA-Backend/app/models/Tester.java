package models;


public abstract class Tester implements UserBase{
	@Override
	public UserLevel Level(){
		return new NormalUser();
	}

	@Override
	public abstract String getName();

	@Override
	public abstract String getPassword();
}