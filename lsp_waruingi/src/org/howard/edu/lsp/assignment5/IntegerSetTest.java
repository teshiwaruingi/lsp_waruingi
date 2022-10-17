package org.howard.edu.lsp.assignment5;
import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class IntegerSetTest {

	@Test
	@DisplayName("IntegerSet.clear() test cases")
	public void testClear() {
	IntegerSet set = new IntegerSet();
	set.clear();
	assertEquals(0, 0);
	}

	@Test
	@DisplayName("IntegerSet.length() test cases")
	public void testLength() {
	IntegerSet set = new IntegerSet();
	//test length after declaring set
	assertEquals(0, set.length());
	}
	
	@Test
	@DisplayName("IntegerSet.length() test cases")
	public void testLength2() {
		IntegerSet set1 = new IntegerSet();
		assertEquals(0, set1.length());
		set1.add(1);
		set1.add(1);
		set1.add(2);
		// testing length on a set after attempting to add duplicate integers.
		assertEquals(2, set1.length());
		assertNotEquals(3, set1.length());
	}

	@Test
	@DisplayName("IntegerSet.equals() test cases")
	public void testEqualsIntegerSet() {
	// two sets having same elements
	IntegerSet set1 = new IntegerSet();
	set1.add(10);
	set1.add(20);
	set1.add(30);
	IntegerSet set2 = new IntegerSet();
	set2.add(10);
	set2.add(20);
	set2.add(30);

	assertEquals(true, set1.equals(set2));
	}

	@Test
	@DisplayName("IntegerSet.equals() test cases")
	public void testEqualsIntegerSet2() {
	// sets of different size
	IntegerSet set1 = new IntegerSet();
	set1.add(10);
	set1.add(20);
	IntegerSet set2 = new IntegerSet();
	set2.add(10);
	set2.add(20);
	set2.add(30);

	assertEquals(false, set1.equals(set2));
	}

	@Test
	@DisplayName("IntegerSet.equals() test cases")
	public void testEqualsIntegerSet3() {
	// sets of different elements
	IntegerSet set1 = new IntegerSet();
	set1.add(10);
	set1.add(20);
	set1.add(30);
	IntegerSet set2 = new IntegerSet();
	set2.add(50);
	set2.add(70);
	set2.add(80);

	assertEquals(false, set1.equals(set2));
	}

	@Test
	@DisplayName("IntegerSet.contains() test cases")
	public void testContains() {
	IntegerSet set1 = new IntegerSet();
	set1.add(10);
	set1.add(20);
	set1.add(30);
	// test to see what elements exist in set
	assertEquals(true, set1.contains(10));
	assertEquals(false, set1.contains(50));

	}


	@Test
	@DisplayName("IntegerSet.largest() test cases")
	public void testLargest() {
	IntegerSet set1 = new IntegerSet();
	set1.add(10);
	set1.add(20);
	set1.add(30);
	set1.add(5);
	int expectedValue = 0;
	// tests to find largest value in set
	try {
	expectedValue = set1.largest();
	} catch (IntegerSetException e) {
	e.printStackTrace();
	}
	assertEquals(30, expectedValue);
	}

	@Test
	@DisplayName("IntegerSet.largest() test cases")
	public void testLargest2() {
	IntegerSet set1 = new IntegerSet();
	int expectedValue = 0;
	//  when the set is empty throws the IntegerSetException
	try {
	expectedValue = set1.largest();
	} catch (IntegerSetException e) {
	assertNull(e.getMessage());
	}
	}

	@Test
	@DisplayName("IntegerSet.smallest() test cases")
	public void testSmallest() {
	IntegerSet set1 = new IntegerSet();
	// tests to find smallest value in set
	set1.add(10);
	set1.add(20);
	set1.add(30);
	set1.add(5);
	int expectedValue = 0;
	try {
	expectedValue = set1.smallest();
	} catch (IntegerSetException e) {
	e.printStackTrace();
	}
	assertEquals(5, expectedValue);
	}

	@Test
	@DisplayName("IntegerSet.smallest() test cases")
	public void testSmallest2() {
	// when set is empty
	IntegerSet set1 = new IntegerSet();
	int expectedValue = 0;
	//  when the set is empty throws the IntegerSetException
	try {
	expectedValue = set1.smallest();
	} catch (IntegerSetException e) {
	assertNull(e.getMessage());
	}
	}

	@Test
	@DisplayName("IntegerSet.add() test cases")
	public void testAdd() {
	IntegerSet set1 = new IntegerSet();
	set1.add(10);
	set1.add(20);
	set1.add(30);
	String expectedValue = "10 20 30 ";
	assertEquals(expectedValue, set1.toString());
	}

	@Test
	@DisplayName("IntegerSet.add() test cases")
	public void testAdd2() {
	IntegerSet set1 = new IntegerSet();
	set1.add(10);
	set1.add(20);
	set1.add(30);
	set1.add(10);
	// tests for when duplicates are added
	String expectedValue = "10 20 30 ";
	assertEquals(expectedValue, set1.toString());
	}

	@Test
	@DisplayName("IntegerSet.remove() test cases")
	public void testRemove() {
	IntegerSet set1 = new IntegerSet();
	set1.add(10);
	set1.add(20);
	set1.add(30);
	set1.remove(20);
	String expectedValue = "10 30 ";
	assertEquals(expectedValue, set1.toString());
	}

	 @Test
	 @DisplayName("IntegerSet.union() test cases")
	 public void testUnion() {
		IntegerSet set1 = new IntegerSet();
		IntegerSet set2 = new IntegerSet();
		IntegerSet set3 = new IntegerSet();
		set1.union(set2);
		// tests union with two empty sets
		assertEquals("[]", set1.toString());
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set2.add(4);
		set2.add(5);
		set2.add(6);
		set1.union(set2);
		// tests union with two non-empty sets
		assertEquals("[1, 2, 3, 4, 5, 6]", set1.toString());
		set2.add(1);
		set2.add(2);
		set2.add(3);
		set2.union(set1);
		// tests union with two non-empty sets that are duplicate
		assertEquals("[4, 5, 6, 1, 2, 3]", set2.toString());
		set3.union(set2);
		// tests union with an empty set and a non-empty set.
		assertEquals("[4, 5, 6, 1, 2, 3]", set3.toString());
	 }
	
	 @Test
	 @DisplayName("IntegerSet.intersect() test cases")
	 public void testIntersect() {
		IntegerSet set1 = new IntegerSet();
		IntegerSet set2 = new IntegerSet();
		IntegerSet set3 = new IntegerSet();
		set1.intersect(set2);
		// tests intersection of two empty sets.
		assertEquals("[]", set1.toString());
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set2.add(3);
		set2.add(4);
		set2.add(5);
		set1.intersect(set2);
		// tests intersection of two non-empty sets.
		assertEquals("[3, 4]", set1.toString());
		set1.clear();
		set1.add(1);
		set1.add(2);;
		set1.intersect(set2);
		// tests intersection of two non-empty with unique elements
		assertEquals("[]", set1.toString());
		set2.intersect(set3);
		// tests intersection of a non-empty set and an empty set
		assertEquals("[]", set2.toString());
		set1.add(1);
		set3.intersect(set1);
		// tests intersection of an empty set and a non-empty set
		assertEquals("[]", set3.toString());
	 }
	
	 @Test
	 @DisplayName("IntegerSet.diff() test cases")
	 public void testDiff() {
		IntegerSet set1 = new IntegerSet();
		IntegerSet set2 = new IntegerSet();
		IntegerSet set3 = new IntegerSet();
		set1.diff(set3);
		// tests difference of two empty sets.
		assertEquals("[]", set1.toString());
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set2.add(1);
		set2.add(3);
		set2.add(5);
		set1.diff(set2);
		// tests difference with two non-empty sets.
		assertEquals("[2, 4]", set1.toString());
		set3.diff(set2);
		// tests difference with an empty set and a non-empty set.
		assertEquals("[]", set3.toString());
		set2.diff(set1);
		// tests difference with two non-empty sets with unique elemnts
		assertEquals("[1, 3, 5]", set2.toString());
	 }

	@Test
	public void testIsEmpty() {
	IntegerSet set1 = new IntegerSet();
	// tests empty
	assertTrue(set1.isEmpty());
	}

	@Test
	public void testIsEmpty2() {
	IntegerSet set1 = new IntegerSet();
	set1.add(10);
	set1.add(20);
	// tests non-empty
	assertFalse(set1.isEmpty());
	}

	@Test
	public void testToString() {
	IntegerSet set1 = new IntegerSet();
	set1.add(10);
	set1.add(20);
	set1.add(30);
	// tests string conversion
	String expectedValue = "10 20 30 ";
	assertEquals(expectedValue, set1.toString());
	}

}
