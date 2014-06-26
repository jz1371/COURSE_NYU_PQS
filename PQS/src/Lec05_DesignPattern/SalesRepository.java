package Lec05_DesignPattern;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import Lec05_DesignPattern.Customer;

public class SalesRepository implements Iterable<Customer> {
    private List<Customer> customers = new ArrayList<Customer>();

    @Override
    public Iterator<Customer> iterator() {
        return new CustomerIterator(customers);
    }

    private static class CustomerIterator implements Iterator<Customer> {
        private List<Customer> customers;
        private int index = 0;

        public CustomerIterator(List<Customer> customers) {
            this.customers = customers;
        }

        @Override
        public boolean hasNext() {
            /* code for skipping null 
             * ........
             */
            // TODO Auto-generated method stub
            return index < customers.size();
        }

        @Override
        public Customer next() {
            // TODO Auto-generated method stub
            return customers.get(index++);
        }

        @Override
        public void remove() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException();
        }
    }

}
