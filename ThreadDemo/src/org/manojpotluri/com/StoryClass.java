package org.manojpotluri.com;


public class StoryClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Racer racer = new Racer();
		
		for(int i=1;i<=10;i++) {
			Thread t = new Thread(racer,"Racer"+i);
			t.start();
		}	

	}

}
