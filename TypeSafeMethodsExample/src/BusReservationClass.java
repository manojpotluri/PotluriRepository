
public class BusReservationClass implements Runnable{

	private int totalSeats = 2;
	
	public int getTotalSeats() {
		return totalSeats;
	}

	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		PassengerThread pt = (PassengerThread) Thread.currentThread();
		boolean bookticketsresult = bookTickets(pt.getNumberofSeats(), pt.getName());
		if (bookticketsresult) {
			System.out.println("Congratulations Reservation Made");
		}
		else {
			System.out.println("unable to make a reservation");
		}
		
		
	}
	
	public synchronized boolean bookTickets(int seats, String className) {
		System.out.println("Welcome to Potluri Travels, Customer Name:" +Thread.currentThread().getName()+ "Number of seats requested is :" +seats );
		System.out.println("Number of seats available at this moment :" +this.getTotalSeats());
		if (this.getTotalSeats() >= seats) {
			totalSeats = totalSeats-seats;
			return true;
			//System.out.println("Reservation Made");
		}
		else {
			
			return false;
		}
	}

	
}
