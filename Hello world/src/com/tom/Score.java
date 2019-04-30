package com.tom;

import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		try {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter English:");
        int English = Integer.parseInt(scanner.nextLine());
        System.out.println("Please enter Math:");
        int Math = Integer.parseInt(scanner.nextLine());
        int average = ((English+Math)/2);
        System.out.println("Your average score:" + average);
	}catch (NumberFormatException e) {
		System.out.println("You cant insert alphabet");
	}
		
	}

}
