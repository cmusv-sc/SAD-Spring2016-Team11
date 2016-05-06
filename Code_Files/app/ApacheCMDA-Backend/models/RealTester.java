package models;

/**
 * Created by yuanliu on 4/25/16.
 */
public class RealTester implements UserBase{

    UserLevelAdapter userLevelAdapter;
    String name;
    String pwd;

    public RealTester( String level, String name, String pwd ){
        this.name = name;
        this.pwd = pwd;
        UserLevel userLevel = null;

        if( level.equals("Super") ){
            userLevel = new SuperUser();
        }
        else if( level.equals("Normal") ){
            userLevel = new NormalUser();
        }

        userLevelAdapter = new UserLevelAdapter( userLevel );
    }

    public String getPassword(){
        return pwd;
    }

    public String getName(){
        return name;
    }

    public UserLevel Level(){
        return userLevelAdapter.Level();
    }
}
