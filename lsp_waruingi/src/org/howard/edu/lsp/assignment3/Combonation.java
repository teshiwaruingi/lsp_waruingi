package org.howard.edu.lsp.assignment3;

/**
 * Teshi Waruingi
 * @author teshiwaruingi
 */
import java.util.ArrayList;

public class Combonation {
	// method to finding the sets with given sum
    public void calculate(ArrayList<ArrayList<Integer>> res, 
        int arr[], 
        ArrayList<Integer> temp, 
        int currTarget, 
        int start) {
		// if currTarget < 0 then the sum of the current set if temp is greater than target
		if(start > arr.length || currTarget < 0)
			return ;
		// if currTarget == 0 then the sum of the set is equivalent to target
		// Add the value to temp
		if(currTarget == 0) {
			res.add(new ArrayList<Integer>(temp));
			return;
		} 
		// Decrease the currTarget by decreassing the value that was added remove temp added value from total
		else {
			for (int i = start; i<arr.length; i++) { 
				temp.add(i);             
				calculate(res, arr, temp, currTarget - arr[i], i+1);
				temp.remove(temp.size()-1);
			}
		}
    }
    
    // prints the for each set using a loop
    public void printSets(ArrayList<ArrayList<Integer>> res) {
        int n = res.size();
		for(int i = 0; i<n; i++){
            int f = res.get(i).size();
            System.out.print("[");
			for(int j = 0; j<f ; j++){
                System.out.print(res.get(i).get(j));              
                if(j != f-1)
				    System.out.print(", ");
			}
			System.out.println("]");
		}
    }
	
	
}
