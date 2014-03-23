package SingleTon;

public class SingleTonDesignPatternExample {

	public static void main(String[] args) {
		SingleObject object = SingleObject.getInstance();
		object.showMessage();
		

	}

}
