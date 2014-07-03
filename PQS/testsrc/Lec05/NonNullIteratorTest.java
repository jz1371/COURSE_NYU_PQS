package Lec05;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

import Lec05_DesignPattern.Criteria;
import Lec05_DesignPattern.NonNullIterator;

/* Patterns
 * ------------------
 * Builder
 * Factory
 * Singleton
 * Iterator
 * Decorator
 * Observer  Item 67 --July 2
 * ------------------
 */


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

	@Test
	public void testNonNullIteratorAdd_criteria() {
		List<String> names = new ArrayList<String>();
		names.add(null);
		names.add("Bob");
		final Iterator<String> namesIterator = names.iterator();
		final Criteria<String> namesCriteria = new Criteria<String>() {
			@Override
			public boolean accepts(String item) {
				// TODO Auto-generated method stub
				return item != null && item.charAt(0) == 'A';
			};

			NonNullIterator<String> itearator = 
					new NonNullIterator<String>(namesIterator, namesCriteria);

		}

		
		// Decorator Pattern
		@Test
		public void testNonNullIteratorAdd_orcriteria() {
			List<String> names = new ArrayList<String>();
			names.add(null);
			names.add("Bob");
			final Iterator<String> namesIterator = names.iterator();
			Criteria<String> orCriteria = new OrCriteria(
					new UnderFourChars(), 
					new UnderFourChars());
//					new OverEightChars());
			CriteriaIterator<String> iterator 
			= new CriteriaIterator<String>(namesIterator, orCriteria);

			NonNullIterator<String> itearator = 
					new NonNullIterator<String>(iterator, orCriteria);

		}
	}
