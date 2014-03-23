package ObserverDesignPattern;

public class ObserverPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subject subject = new Subject();
		new HexaObserver(subject);
		new BinaryObserver(subject);
		new OctalObserver(subject);
		
		System.out.println("First change when state is 10");
		subject.setState(10);
		
		System.out.println("Second change when state is 15");
		subject.setState(15);

	}

}
