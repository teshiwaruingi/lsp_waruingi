package org.howard.edu.lsp.assignment4;
import java.util.*;



public class Driver {

	public static void main(String[] args) throws IntegerSetException {
	


		// make 2 instance of integerset class for implementation
		IntegerSet set1= new IntegerSet();
		IntegerSet set2= new IntegerSet();

		set1.add(1);
		set1.add(3);
		set1.add(4);
		set1.add(6);
		set1.add(3);
		set1.add(8);
		set1.add(7);

		set2.add(1);
		set2.add(2);
		set2.add(3);
		set2.add(4);
		set2.add(5);
		set2.add(6);
		set2.add(7);

		System.out.println("Set 1 : "+set1.toString());
		System.out.println("Set 2 : "+set2.toString());

		System.out.println("Is equal : "+set1.equals(set2));

		System.out.println("Largest element in set1 : "+ String.valueOf(set1.largest()));

		System.out.println("Smallest element in set2 : "+String.valueOf(set2.smallest()));

		set1.union(set2);
		
		
		System.out.println("Union : "+ set1.toString());
		
		set1.clear();
		set2.clear();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set2.add(2);
		set2.add(3);
		set2.add(4);


		set1.intersect(set2);

		System.out.println("Intersection : "+ set1.toString() );
		
		
		set1.clear();
		set2.clear();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set2.add(1);
		set2.add(2);
		
		set1.diff(set2);
		
		System.out.println("Difference : "+ set1.toString() );


	}

}
