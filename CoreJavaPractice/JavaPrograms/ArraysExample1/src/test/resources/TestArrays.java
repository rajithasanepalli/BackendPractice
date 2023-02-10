import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class TestArrays {

	@Test
	public void test() {
		int a[]= {34,56,78};
		int b[]= {43,65,50};
		int c[]=applyOnTwoArrays((p,q)->p+q,a,b)
		Assert.assertArrayEquals(new int [] {77,121,128},c);
	}

}
