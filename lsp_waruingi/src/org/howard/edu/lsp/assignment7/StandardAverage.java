package org.howard.edu.lsp.assignment7;

import java.util.List;


public class StandardAverage {
	
	
	/**
	 * method returns the average grade
	 * @param grades  list of grades
	 * @return  average grades
	 * @throws EmptyListException
	 */
	public int compute(List<Integer> grades) throws EmptyListException {
		if (grades.size() == 0) {
			throw new EmptyListException("The input list is empty.");
		}
		int total = 0;
		for (int num: grades) {
			total += num;
		}
		int avg = total / grades.size();
		return avg;
	}

}
