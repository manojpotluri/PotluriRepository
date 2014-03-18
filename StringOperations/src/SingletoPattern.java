import java.sql.ResultSet;


public class SingletoPattern {
	private static SingletoPattern instance;
	private SingletoPattern(){
		
	}
	public SingletoPattern getInstance(){
	if (instance == null)	{
		instance = new SingletoPattern();
	}
	return instance;
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingletoPattern st = new SingletoPattern();
		SingletoPattern st2 = new SingletoPattern();
		System.out.println("First instance :" +st.getInstance());
		System.out.println("Second instance :" +st2.getInstance());
		
	}

}
