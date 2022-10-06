package org.howard.edu.lsp.assignment4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Teshi Waruingi
 * 
 * 
 */


public class IntegerSet  {
	// Hint: probably best to use an array list.  You will need to do a little research
	/***
	 * to hold elements of set in an ArrayList object
	 * 
	 */
	private List<Integer> set = new ArrayList<Integer>();

	/**
	 * Declares empty set
	 */
	public IntegerSet() {
		this.set=new ArrayList<Integer>();
		}

/**
 * 
 * empties the set
 * */
public void clear() {set.clear();};

/**
 * 
 * @return num of elements in set
 * 
 * */

public int length() {return set.size();}; // returns the length

/**
 * Returns true if the 2 sets are equal, false otherwise;
 * Two sets are equal if they contain all of the same values in ANY order.
 * @param b is the second set that be compared
 * @return true if set is equal to b
 * @return false otherwise
*/
public boolean equals(IntegerSet b) {
	
	ArrayList<Integer> list2=(ArrayList<Integer>) b.set;

	if(set.size()!=list2.size()) {
	return false;
	}

	ArrayList<Integer> temp1=(ArrayList<Integer>) set;

	ArrayList<Integer> temp2=list2;

	Collections.sort(temp1);
	Collections.sort(temp2);

	for(int j=0;j<temp1.size();j++) {
	if(temp1.get(j)!=temp2.get(j)) {
	return false;
	}
	}

	return true;

}; 

// Returns true if the set contains the value, otherwise false
/**
 * @return if set has a value true, otherwise false
 * */
public boolean contains(int value) {return this.set.contains(value);};    

// Returns the largest item in the set; Throws a IntegerSetException if the set is empty 
/**
 * throws an expection if the set is empty
 * @return largest element in the set
 * 
 * */

public int largest() throws IntegerSetException {
	
	int currMax = Integer.MIN_VALUE;
	if(set.size()==0) {
		IntegerSetException e= new IntegerSetException();
		throw e;
		}

//		int currentMaximum=0;

		for(int j=0;j<set.size();j++) {
		if(set.get(j)>currMax) {
			currMax=set.get(j);
		}
		}

		return currMax;
		
}; 

// Returns the smallest item in the set; Throws a IntegerSetException if the set is empty
/**
 * throws an expection if the set is empty
 * @return smallest element in the set
 * 
 * */
public int smallest() throws IntegerSetException {
	
	if(set.size()==0) {
		IntegerSetException e= new IntegerSetException();
		throw e;
		}

		int currMin=Integer.MAX_VALUE;

		for(int j=0;j<set.size();j++) {
		if(set.get(j)<currMin) {
			currMin=set.get(j);
		}
		}

		return currMin;


};

	// Adds an item to the set or does nothing it already there	
/**
 * @param item is added to the set
 * */
 	public void add(int item) {
 		boolean exist=false;

 		for(int j=0;j<set.size();j++) {

 		if(set.get(j)==item) {
 		exist=true;
 		}
 		}

 		if(exist==false) {
 		set.add(item);
 		}


 	}; // adds item to the set or does nothing if it is in set

	// Removes an item from the set or does nothing if not there
 	
 	/**
 	 * @param item is remove to the set
 	 * */
public void remove(int item) {

	for(int j=0;j<set.size();j++) {
	
	if(set.get(j)==item) {
	set.remove(j);
	}
	}

}; 

// Set union
/**
 * @param intSetb the second set a union will form with, combining all elements
 * */
public void union(IntegerSet intSetb) {
	
	List<Integer> toUnite= new ArrayList<Integer>();
	for (int j=0; j<intSetb.set.size(); j++) {
		if (!this.set.contains(intSetb.set.get(j))) {
			toUnite.add(intSetb.set.get(j));
		}
	}
	for (int num: toUnite) {
		this.set.add(num);
	}
};

// Set intersection

/**
 * @param intSetb the second set an intersection will form with
 * */
public void intersect(IntegerSet intSetb) {

	List<Integer> toIntersect = new ArrayList<Integer>();
	for (int j=0; j<this.set.size(); j++) {
		if (!intSetb.set.contains(this.set.get(j))) {
			toIntersect.add(this.set.get(j));
		}
	}
	for (int num: toIntersect) {
		int index = this.set.indexOf(num);
		this.set.remove(index);
	}
	
}; 


/**
 * @param intSetb the second set a difference will be formed with
 * */
public void diff(IntegerSet intSetb){
	List<Integer> numbersToGo = new ArrayList<Integer>();
	for (int j=0; j<this.set.size(); j++) {
		if (intSetb.set.contains(this.set.get(j))) {
			numbersToGo.add(this.set.get(j));
		}
	}
	for (int num: numbersToGo) {
		int index = this.set.indexOf(num);
		this.set.remove(index);
	}
}; 

// Returns true if the set is empty, false otherwise
/**
 * @return true if set is empty
 * 
 * */
boolean isEmpty() {
	return this.set.size() == 0;
}; 

// Return String representation of your set
/**
 * returns string version of the set
 * */
public String toString() {return this.set.toString();};	// return String representation of your set
}

