package org.howard.edu.lsp.assignment7;

import java.util.Collections;
import java.util.List;

public class DropTwoAverage {
	
	
	/**
	 * method returns the average grade  after dropping the two lowest scores
	 * If  size of the list is less than 3, it computes the average grade without dropping
	 * @param grades list of grades
	 * @return the average grade from the list of grades after dropping the two lowest grades.
	 * @throws EmptyListException
	 */
	public int compute(List<Integer> grades) throws EmptyListException {
		if (grades.size() == 0) {
			throw new EmptyListException("input is empty");
		}
		int sum = 0;
		int avg;
		if (grades.size() < 3) {
			for (int i=0; i<grades.size(); i++) {
				sum += grades.get(i);
			}
			avg = sum / grades.size();
		} else {
			Collections.sort(grades);
			for (int i=2; i<grades.size(); i++) {
				sum += grades.get(i);
			}
			avg = sum / (grades.size()-2);
		}
		return avg;
	}

}
