
public class GenericMethodExample {

	public static void main(String[] args) {
		Integer[] iarray = {5,4,3,2,1};
		String[] sarray = {"This", "is", "a", "test."};
		
		output(iarray);
		System.out.println();
		output(sarray);

	}
	//generic function
	private static <T> void output(T[] array) {
		for(T p:array) {
			System.out.printf("%s ", p);
			//System.out.println();
		}
		
	}
	

}
