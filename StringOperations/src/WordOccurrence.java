import org.apache.commons.lang.StringUtils;


public class WordOccurrence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hello how are you hello";
		int i = StringUtils.countMatches(str, "hello");
		System.out.println("occurrence " +i);
	}

}
