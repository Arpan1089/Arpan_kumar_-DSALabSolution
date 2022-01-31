package com.lab.bracketBalancer;

import java.util.*;

public class Driver {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value: ");
		String str = sc.nextLine();
		BracketBalancer balancer = new BracketBalancer();

		if (balancer.areBracketsBalanced(str))
			System.out.println("The entered String has Balanced Brackets");
		else
			System.out.println("The entered Strings do not contain Balanced Brackets");
		sc.close();
	}

}
