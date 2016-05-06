package models;

public abstract class Developer implements UserBase{
	@Override
	public UserLevel Level(){
		return new SuperUser();
	}

	@Override
	public abstract String getName();

	@Override
	public abstract String getPassword();

}