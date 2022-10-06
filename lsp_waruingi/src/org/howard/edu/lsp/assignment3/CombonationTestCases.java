package org.howard.edu.lsp.assignment3;
/**
 * Teshi Waruingi
 * @author teshiwaruingi
 * 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
 */
import java.util.ArrayList;

public class CombonationTestCases {
	
	// testcase method
    public static void main(String[] args) {

        // make calculate object
    	Combonation cl = new Combonation();
        // hold  answer
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();

        // declare  array
        int arr1[] = {5, 5, 15, 10};
        int target1 = 15;    // Assign target sum
    
        // calculate and hold in the answer and print out
        cl.calculate(res, arr1, new ArrayList<Integer>(), target1, 0);
        System.out.println("For array 1: ");
        cl.printSets(res);

        // test case 2
        int arr2[] = {1, 2, 3, 4, 5, 6};
        int target2 = 6;    
        cl.calculate(res, arr2, new ArrayList<Integer>(), target2, 0);
        System.out.println("\nFor array 2: ");
        cl.printSets(res);
    }
	
}
