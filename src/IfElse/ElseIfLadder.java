package IfElse;

import java.util.Scanner;

public class ElseIfLadder {

	public static void main(String[] args) {

		// create scanner object
		Scanner sc = new Scanner(System.in);

		// take input from user
		System.out.println("please enter the marks :");

		// take input from scanner
		int marks = sc.nextInt();

		if (marks >= 40 && marks <= 60) {
			System.out.println("C grade");
		}

		else if (marks >= 61 && marks <= 80) {
			System.out.println("B grade");

		}

		else if (marks >= 81 && marks <= 100) {
			System.out.println("A grade");
		}

		else {
			System.out.println("invalid grade");
			
			sc.close();
		}

	}

}
