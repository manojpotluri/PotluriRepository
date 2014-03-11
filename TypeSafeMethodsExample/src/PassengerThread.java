
public class PassengerThread extends Thread {
	private int numberofSeats;

	public int getNumberofSeats() {
		return numberofSeats;
	}

	public void setNumberofSeats(int numberofSeats) {
		this.numberofSeats = numberofSeats;
	}
	
	public PassengerThread(int seats, Runnable target, String name) {
		super(target, name);
		setNumberofSeats(seats);
	}

}
