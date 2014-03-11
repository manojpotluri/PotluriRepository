import java.io.BufferedReader;
import java.io.FileReader;


public class BufferReaderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test;
		try {
			String path = "C:\\Users\\manoj_potluri\\Desktop\\Docs\\companies.txt";
			FileReader fr = new FileReader(path);
			BufferedReader br = new BufferedReader(fr);
			while ((test = br.readLine()) != null) {
				System.out.println(test);
			}
			br.close();
		}
		catch (Exception e) {
			
		}
		
		

	}

}
