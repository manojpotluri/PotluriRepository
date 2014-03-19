package org.manojpotluri.SwapCharacters;

/**
 * Hello world!
 *
 */
public class App 
{
	public String computeString(String actual) {
		
		int strlen = actual.length();
		if (strlen <=2) {
			StringBuilder sb = new StringBuilder(actual);
			actual = sb.reverse().toString();
			return actual;
		}
		String prefix = actual.substring(0, strlen-2);
		String postfix = actual.substring(strlen-2);
		StringBuilder sb = new StringBuilder(postfix);
		postfix = sb.reverse().toString();
		return prefix+postfix;
	}
	
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
