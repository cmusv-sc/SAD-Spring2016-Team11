package models;

/**
 * Created by yuanliu on 4/25/16.
 */
public class UserLevelAdapter implements UserBase{
    UserLevel userLevel;

    public UserLevelAdapter( UserLevel userLevel ){
        this.userLevel = userLevel;
    }


    @Override
    public String getName(){
        return null;
    }

    @Override
    public String getPassword(){
        return null;
    }

    @Override
    public UserLevel Level(){
        return userLevel;
    }
}
