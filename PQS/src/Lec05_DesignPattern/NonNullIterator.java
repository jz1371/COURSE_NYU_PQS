package Lec05_DesignPattern;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class NonNullIterator<E> implements Iterator<E> {

	private Iterator<E> iterator;
	private E nextObject;
	private boolean hasFound = false;

	public NonNullIterator (Iterator<E> iterator) {
		this.iterator = iterator;
	}

	@Override
	public boolean hasNext() {
		if(hasFound == false){
			while(iterator.hasNext()){
				nextObject = iterator.next();
				if( nextObject != null ){
					hasFound = true;
					break;
				}
			}
		}
		return hasFound;

		//  Alternatively
		//		while(!hasFound && iterator.hasNext()) {
		//			next = iterator.next();
		//			if (next != null) {
		//				hasFound = true;
		//			}
		//		}
		//		return hasFound;

	}

	@Override
	public E next() {
		// hasFound: after hasNext() is called
		// hasNext(): in case user call next directly.
		if (hasFound || hasNext()){
			hasFound = false;
			return nextObject;
		} else{
			throw new NoSuchElementException();
		}
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

}
