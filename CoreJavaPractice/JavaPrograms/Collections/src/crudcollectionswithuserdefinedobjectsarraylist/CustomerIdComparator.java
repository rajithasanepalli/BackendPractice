package crudcollectionswithuserdefinedobjectsarraylist;

import java.util.Comparator;

public class CustomerIdComparator implements Comparator<Customer> {
	@Override
	public int compare(Customer c1, Customer c2) {
		if(c1.getCustomerId() == c2.getCustomerId())
			return 0;
			//else if(c1.getCustomerId()>c2.getCustomerId())
				//return 1;
			else
				return -1;
	}

}
