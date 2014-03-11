package org.manojpotluri.com;

public class Share extends Thread {
	static String msg[] = {"This","is","Manoj","Potluri","the great"};
	
	Share (String s) {
		super (s);
	}
	
	public void run() {
		display(this.getName());
	}

	public  void  display(String threadname) {
		// TODO Auto-generated method stub
		synchronized(this) {
		for(int i=0;i<=4;i++) {
			System.out.println(threadname +":" +msg[i]);
		}
		try {
			sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	 }
	}	
	
	

}
