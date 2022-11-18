import static org.junit.Assert.*;

import org.junit.Test;

public class ArrayIntListTest {

	@Test
	public void test_add_1() {
		ArrayIntList alist = new ArrayIntList();
		
		assertTrue("list should be empty",alist.isEmpty());
	}
	
	@Test
	public void test_add_2() {
		ArrayIntList alist = new ArrayIntList();
		alist.add(47);
		assertTrue(alist.contains(47));
	}
	
	@Test
	public void test_add_3() {
		ArrayIntList alist = new ArrayIntList();
		alist.add(47);
		assertEquals(alist.get(0),47);
	}
	
	@Test
	public void test_add_4() {
		ArrayIntList alist = new ArrayIntList();
		alist.add(47);
		alist.add(29);
		assertEquals(alist.get(1),29);
	}
	
	
	

}
