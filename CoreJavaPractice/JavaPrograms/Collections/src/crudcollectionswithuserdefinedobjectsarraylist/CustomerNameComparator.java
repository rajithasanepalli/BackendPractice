package crudcollectionswithuserdefinedobjectsarraylist;

import java.util.Comparator;

public class CustomerNameComparator implements Comparator<Customer> {

	@Override
	public int compare(Customer c1, Customer c2) {
		if(c1.getCustomerName() == c2.getCustomerName())
			return 0;
			//else if(c1.getCustomerName()==c2.getCustomerName())
				//return 1;
			else
				return -1;
	}
	

	

}
