package org.manojpotluri.com;

public class SyncThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Share t1 = new Share("Thread one: ");
		Share t2 = new Share("Thread two: ");
		t1.start();
		t2.start();

	}

}
