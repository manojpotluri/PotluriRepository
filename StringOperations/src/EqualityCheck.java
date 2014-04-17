
public class EqualityCheck {
	
	
public static void main(String[] args ) {
	
	String a = "abc";
	String b = "abc";
	
	String A = new String("abc");
	String B = new String("abc");
	
	boolean result = (a==b);
	boolean result2 = (a.equals(b));
	
	boolean result3 = (A==B);
	boolean result4 = (A.equals(B));
	
	System.out.println(result + " : " +result2);
	
	System.out.println(result3 + " : " +result4);
}
	

}
