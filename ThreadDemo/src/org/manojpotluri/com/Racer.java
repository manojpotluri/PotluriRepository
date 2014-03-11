package org.manojpotluri.com;

public class Racer implements Runnable {

	public static String winner;
	
	public void race() {
		for (int i = 1; i<= 100; i++){
			boolean winloose = this.isRaceWon(i);
			if(winloose) {
				break;
			}
			else {
				System.out.println("Distance covered by " +Thread.currentThread().getName()+ " is :" +i );
			}
						
		}		
	}
	
	public boolean isRaceWon(int distance) {
		boolean isRaceWon = false;
		if (distance == 100 && Racer.winner==null){
			System.out.println("Winner is" +Thread.currentThread().getName());
			Racer.winner = Thread.currentThread().getName();
			isRaceWon = true;
			
		}
		else if (Racer.winner==null) {
			isRaceWon = false;
		}
		else if (Racer.winner!=null) {
			isRaceWon = true;
		}
		return isRaceWon;
	}
	@Override
	public void run() {
		this.race();
	}
	
}
