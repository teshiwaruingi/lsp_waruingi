package org.howard.edu.lsp.assignment4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;




public class IntegerSet  {
	// Hint: probably best to use an array list.  You will need to do a little research
	private List<Integer> set = new ArrayList<Integer>();

	// Default Constructor
	public IntegerSet() {
		this.set=new ArrayList<Integer>();
		}

// Clears the internal representation of the set
public void clear() {set.clear();};

// Returns the length of the set
public int length() {return set.size();}; // returns the length

/*
              * Returns true if the 2 sets are equal, false otherwise;
 * Two sets are equal if they contain all of the same values in ANY order.
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

	for(int i=0;i<temp1.size();i++) {
	if(temp1.get(i)!=temp2.get(i)) {
	return false;
	}
	}

	return true;

}; 

// Returns true if the set contains the value, otherwise false
public boolean contains(int value) {return this.set.contains(value);};    

// Returns the largest item in the set; Throws a IntegerSetException if the set is empty 
public int largest() throws IntegerSetException {
	
	int currMax = Integer.MIN_VALUE;
	if(set.size()==0) {
		IntegerSetException e= new IntegerSetException();
		throw e;
		}

//		int currentMaximum=0;

		for(int i=0;i<set.size();i++) {
		if(set.get(i)>currMax) {
			currMax=set.get(i);
		}
		}

		return currMax;
		
}; 

// Returns the smallest item in the set; Throws a IntegerSetException if the set is empty
public int smallest() throws IntegerSetException {
	
	if(set.size()==0) {
		IntegerSetException e= new IntegerSetException();
		throw e;
		}

		int currMin=Integer.MAX_VALUE;

		for(int i=0;i<set.size();i++) {
		if(set.get(i)<currMin) {
			currMin=set.get(i);
		}
		}

		return currMin;


};

	// Adds an item to the set or does nothing it already there	
 	public void add(int item) {
 		boolean exist=false;

 		for(int i=0;i<set.size();i++) {

 		if(set.get(i)==item) {
 		exist=true;
 		}
 		}

 		if(exist==false) {
 		set.add(item);
 		}


 	}; // adds item to the set or does nothing if it is in set

	// Removes an item from the set or does nothing if not there
public void remove(int item) {

	for(int i=0;i<set.size();i++) {
	
	if(set.get(i)==item) {
	set.remove(i);
	}
	}

}; 

// Set union
public void union(IntegerSet intSetb) {
	
	List<Integer> numbersToAdd= new ArrayList<Integer>();
	for (int i=0; i<intSetb.set.size(); i++) {
		if (!this.set.contains(intSetb.set.get(i))) {
			numbersToAdd.add(intSetb.set.get(i));
		}
	}
	for (int number: numbersToAdd) {
		this.set.add(number);
	}
};

// Set intersection
public void intersect(IntegerSet intSetb) {

	List<Integer> numbersToGo = new ArrayList<Integer>();
	for (int i=0; i<this.set.size(); i++) {
		if (!intSetb.set.contains(this.set.get(i))) {
			numbersToGo.add(this.set.get(i));
		}
	}
	for (int number: numbersToGo) {
		int numIdx = this.set.indexOf(number);
		this.set.remove(numIdx);
	}
	
}; 

// Set difference, i.e., s1 –s2
public void diff(IntegerSet intSetb){
	List<Integer> numbersToGo = new ArrayList<Integer>();
	for (int i=0; i<this.set.size(); i++) {
		if (intSetb.set.contains(this.set.get(i))) {
			numbersToGo.add(this.set.get(i));
		}
	}
	for (int number: numbersToGo) {
		int numIdx = this.set.indexOf(number);
		this.set.remove(numIdx);
	}
}; // set difference, i.e. s1 - s2

// Returns true if the set is empty, false otherwise
boolean isEmpty() {
	return this.set.size() == 0;
}; 

// Return String representation of your set
public String toString() {return this.set.toString();};	// return String representation of your set
}

