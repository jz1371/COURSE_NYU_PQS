package classdemo;

import classdemo1.*;


public class Counter implements Runnable {// extends Thread
	

	public static void main(String[] args){
		Counter c = new Counter();
		Thread t = new Thread(c);
		/*extends Thread , then you can c.start();*/
		t.start();
	}

	public void run() {
		// TODO Auto-generated method stub
		/*for(int i = 0; i < 100; i++){
			System.out.println(i);
			try {
			  Thread.sleep(1000);
			} catch (InterruptedException e) {
			  // TODO Auto-generated catch block
			  e.printStackTrace();
			}
		}*/
	  String s = "";
	  System.out.println(s.length());

	}
	
	private Sequence se = new Sequence();
}
