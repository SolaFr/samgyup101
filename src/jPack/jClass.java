package jPack;

import java.util.Scanner;

public class jClass {

	public static void main(String[] anything) {
		//basic string
		System.out.println("Hello!");
		// from string to string
		String myString = ("Hello World!");
		System.out.println(myString);
		// scanner
		Scanner myFavoriteScan = new Scanner(System.in);
		String myString1 = myFavoriteScan.nextLine();
		System.out.println(myString1);
		// additional
		String myString3 = ("Hello World!" + myString);
		System.out.println(myString3);
	}
			
}
