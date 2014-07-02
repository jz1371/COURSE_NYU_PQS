package Lec05;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

import Lec05_DesignPattern.NonNullIterator;

public class NonNullIteratorTest {

	@Test
	public void testNonNullIterator() {
		List<String> names = new ArrayList<String>();
		names.add(null);
		names.add("Bob");
		Iterator<String> namesIterator = names.iterator();
		NonNullIterator<String> itearator = 
				new NonNullIterator<String>(namesIterator);
		
	}

}
