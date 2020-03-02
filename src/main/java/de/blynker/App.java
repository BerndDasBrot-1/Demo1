package de.blynker;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	User user = new User("Bernd", "Lynker");
        System.out.println( "Hello " + user.toString() );
    }
}
