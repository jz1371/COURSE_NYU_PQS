package Lec05;

import Lec05_DesignPattern.Criteria;

public class UnderFourChars implements Criteria<String> {

	@Override
	public boolean accepts(String item) {
		// TODO Auto-generated method stub
		return item != null && item.length() < 4;
	}


}
