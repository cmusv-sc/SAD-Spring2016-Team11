package models;

/**
 * Created by yuanliu on 4/25/16.
 */
public class AdapterPatternDemo {
    public static void main( String[] args ){
        UserBase u1 = new RealTester("Normal", "123", "123");
        UserBase u2 = new RealTester("Super", "123", "123");


        System.out.println( "Name:"+u1.getName()+" Pwd:"+u1.getPassword() + " Level:"+u1.Level().getLevel() );
        System.out.println( "Name:"+u2.getName()+" Pwd:"+u2.getPassword() + " Level:"+u2.Level().getLevel() );

    }

}
