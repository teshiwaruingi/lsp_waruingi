package org.howard.edu.lsp.assignment7;

import java.util.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ComputeAverageTest {

	@Test
	@DisplayName("Test  for ComputeAverage compute")
	public void testCompute() {
		ComputeAverage avg = new ComputeAverage();
		List<Integer> newList = new ArrayList<Integer>();
		newList.add(2);
		newList.add(4);
		newList.add(6);
		newList.add(8);
		avg.setAverageStrategy(new StandardAverage());
		try {
			assertEquals(5, avg.compute(newList));
		} catch (EmptyListException e) {
			e.printStackTrace();
		}
		avg.setAverageStrategy(new DropTwoAverage());
		try {
			assertEquals(7, avg.compute(newList));
		} catch (EmptyListException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	@DisplayName("Test both strategies throw an Exception")
	public void testCompute_Throws_EmptyListException_1() {
		ComputeAverage avg = new ComputeAverage();
		List<Integer> newList = new ArrayList<Integer>();
		avg.setAverageStrategy(new StandardAverage());
		EmptyListException exception1 = assertThrows(EmptyListException.class, () -> {
			System.out.println(avg.compute(newList));
		});
		assertEquals("input is empty ", exception1.getMessage());
		
		avg.setAverageStrategy(new DropTwoAverage());
		EmptyListException exception2 = assertThrows(EmptyListException.class, () -> {
			System.out.println(avg.compute(newList));
		});
		assertEquals("input is empty ", exception2.getMessage());
	}
	
	
	
	@Test
	@DisplayName("Test for when the average value is rounded down")
	public void testCompute_RoundedDown() {
		ComputeAverage avg = new ComputeAverage();
		List<Integer> newList = new ArrayList<Integer>();
		newList.add(1);
		newList.add(2);
		newList.add(3);
		newList.add(4);
		newList.add(5);
		newList.add(6);
		avg.setAverageStrategy(new StandardAverage());
		try {
			assertEquals(3, avg.compute(newList));
		} catch (EmptyListException e) {
			e.printStackTrace();
		}
		avg.setAverageStrategy(new DropTwoAverage());
		try {
			assertEquals(4, avg.compute(newList));
		} catch (EmptyListException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	@DisplayName("Test for when DropTwoAverage compute does not drop any scores")
	public void testCompute_Throws_EmptyListException_2() {
		ComputeAverage avg = new ComputeAverage();
		List<Integer> newList = new ArrayList<Integer>();
		newList.add(2);
		newList.add(4);
		avg.setAverageStrategy(new StandardAverage());
		try {
			assertEquals(3, avg.compute(newList));
		} catch (EmptyListException e) {
			e.printStackTrace();
		}
		avg.setAverageStrategy(new DropTwoAverage());
		try {
			assertEquals(3, avg.compute(newList));
		} catch (EmptyListException e) {
			e.printStackTrace();
		}
	}

}
