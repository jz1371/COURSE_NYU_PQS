package classdemo;

public class EvenSequence {
	private Object lock  = new Object();
	
	private int i;
	public void next(){
//	  synchronized(lock){	
		i++;
		i++;
	//}
	}
	
	public int get(){   //synchronized(lock)
		return i;
	}
}
