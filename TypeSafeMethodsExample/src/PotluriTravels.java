
public class PotluriTravels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BusReservationClass br = new BusReservationClass();
		PassengerThread passenger1 = new PassengerThread(1, br, "passenger1");
		PassengerThread passenger2 = new PassengerThread(2, br, "passenger2");
		passenger1.start();
		passenger2.start();

	}

}
