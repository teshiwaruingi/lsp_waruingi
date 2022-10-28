package org.howard.edu.lsp.midterm.problem1;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class VotingMachineTest {
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		VotingMachine vm = new VotingMachine();
		
		//adding candidates to the list
		vm.addCandidate("Jay");
		vm.addCandidate("John");
		vm.addCandidate("Katie");
		
		//printing the initial status of candidates before election
		System.out.println("Before Elections\n");
		vm.printResults();
		System.out.println();
		
		//casting votes to the candidates using their names
		vm.castVote("Jay");
		vm.castVote("Jay");
		vm.castVote("Katie");
		vm.castVote("John");
		vm.castVote("Katie");
		vm.castVote("Jay");
		
		//printing the result of the election
		System.out.println("After Elections\n");
		vm.printResults();
		
	}
	
}
