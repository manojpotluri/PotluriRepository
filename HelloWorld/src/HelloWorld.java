
public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i < 2; i++) {
	    System.out.println(getValue(101));
		}
		
	}
		
		public static int getValue(int i) {
			 return (short) (Math.random() * i);
			}
	

}
