package classdemo1;

import java.util.Collections;
import java.util.*;


class Sequence {
	private int value;
	
	/*public int getNext(){
		return value++;    // not atomic 
	} */
	
	private Object lock = new Object(); //different lock for different data..
	
	public int getNext(){
	  synchronized(this){ //use lock
	  return value++;    // ++ not atomic  return is atomic.
	 } 
    } 
	
	/*public synchronized int getNext(){  //syntax sugar
		return value++;
	}
	*/
	
	
	
	
	public static void main(String[] args){
      final Sequence s = new Sequence();
      final Set<Integer> nums = 
    		  Collections.synchronizedSet(new HashSet<Integer>());
		
	  new Thread(){
		public void run(){
			for (int i =0 ; i < 100; i++){
				System.out.println(s.getNext());
			}
		  }
		}.start();
		
		new Thread(){
			public void run(){
				for (int i =0 ; i < 100; i++){
					System.out.println(s.getNext());
				}
			  }
		}.start();
	}

}
