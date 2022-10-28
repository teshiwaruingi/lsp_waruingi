package org.howard.edu.lsp.midterm.problem1;
import java.util.Scanner;

public class VotingMachine {

	//here we are making the capacity for the list as 20
		String [][] candidateList = new String[20][2];
		
		//numberOfCandidates will represent the size of the array
		int numberOfCandidates = 0;
		/**
		 * @param name ...
		 * */
		public void addCandidate(String name){
			//name of the candidate will be added to the array
			candidateList[numberOfCandidates][0] = name;
			
			//initially the votes will be set to zero for the candidate
			candidateList[numberOfCandidates][1] = "0";
			numberOfCandidates++;
		}
		
		
		
		//it is being considered that the name entered by the user will be always there in the list
		//which is the actual case for the voting machine
		public void castVote(String name){
			
			//we will first search for the name of the candidate
			for(int i = 0; i < numberOfCandidates; i++){
				if(name.equals(candidateList[i][0])){
					//since the array is of type String so to increase the votes
					//first we convert the string to int and then again convert it to string after increasing the coutn
					//and store back to the array
					int votes = Integer.parseInt(candidateList[i][1]);
					votes++;
					//vote for the candidate will be increased
					candidateList[i][1] = Integer.toString(votes);
				}
			}
		}
		
//		public int getVotes(String name) {
//			//pass
//			
//			}
		
		
		public void printResults(){
			//we will run a loop and print the name and their votes stored in the array
			for(int i = 0; i< numberOfCandidates; i++){
				System.out.println("Votes in favour of "+candidateList[i][0]+" are "+candidateList[i][1]);
			}


}
}
