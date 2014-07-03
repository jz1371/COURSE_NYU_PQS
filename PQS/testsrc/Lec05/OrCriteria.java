package Lec05;

import Lec05_DesignPattern.Criteria;

public class OrCriteria<E> implements Criteria<E> {
	private Criteria<E> criteriaA;
	private Criteria<E> criteriaB;
	
	public OrCriteria(Criteria<E> criteriaA, Criteria<E> criteriaB) {
		// TODO Auto-generated constructor stub
		this.criteriaA = criteriaA;
		this.criteriaA = criteriaA;
		
	}
	@Override
	public boolean accepts(E item) {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}
