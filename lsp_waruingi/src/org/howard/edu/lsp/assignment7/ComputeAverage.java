package org.howard.edu.lsp.assignment7;
import java.util.*;

public class ComputeAverage {

	/**
	 * The average algorithm the user wants to compute the average with.
	 */
	private StandardAverage strategy;
	private DropTwoAverage secondStrategy;
	
	/**
	 * method sets the average computing formula.
	 * @param standardAverage th average formula.
	 */
	public void setAverageStrategy(StandardAverage standardAverage) {
		this.strategy = standardAverage;
		}
	public void setAverageStrategy(DropTwoAverage dropTwoAverage) {
		this.secondStrategy = dropTwoAverage;
		}
	
	/**
	 * method returns the average grade from a list of grades from formula
	 * @param grades  list of grades.
	 * @return  average grade 
	 * @throws EmptyListException
	 */
	public int compute(List<Integer> grades) throws EmptyListException{
		int average = this.strategy.compute(grades);
		return average;
	}
	

}
