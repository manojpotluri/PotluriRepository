import java.util.Scanner;
import java.util.StringTokenizer;


public class WordCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter the string");
		int count=0;
		Scanner s = new Scanner(System.in);
		String line = s.nextLine();
		StringTokenizer st = new StringTokenizer(line);
		while (st.hasMoreTokens()) {
			count++;			
		}
		s.close();	
		System.out.println("Number of words in the string are : " +count);
	}

}
