package IfElse;

import java.util.Scanner;

public class SwitchCaseDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("please enter the size :");
		int size = sc.nextInt();

		// System.out.println("please enter the size"+size);

		switch (size) {

		case 28:
			System.out.println("small size");
			break;

		case 30:
			System.out.println("medium size");
			break;

		case 32:
			System.out.println("large size");
			break;

		case 36:
			System.out.println("extra large size");
			break;

		case 40:
			System.out.println("extra extra large size");
			break;

		default:
			System.out.println("invalid size");

		}

	}

}
