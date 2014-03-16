import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ReverseAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter a string you want to Reverse :");
		InputStreamReader ins = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ins);
		
		try {
			String str = br.readLine();
			System.out.println("string to be reversed is :" +str);
			StringBuilder rsrt = new StringBuilder(str);
			str = rsrt.reverse().toString();
			System.out.println("\nreversed string is : " +str);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
