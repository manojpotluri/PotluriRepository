
import java.io.*;
public class FileReaderTest {

	public static void main (String[] args) {
		String path = "C:\\Users\\manoj_potluri\\Desktop\\Docs\\companies.txt";
		try {
		FileInputStream fis = new FileInputStream(path);
		BufferedInputStream ibs = new BufferedInputStream(fis);
		while (ibs.available() > 0) {
			System.out.println((char)ibs.read());
		}
		ibs.close();
		fis.close();
		
		}
		catch (Exception e) {
			System.out.println("Error " +e);
		}
		
	}
}
