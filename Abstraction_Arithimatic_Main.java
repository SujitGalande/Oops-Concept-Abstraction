package com.abstraction.abstractMethod;

import java.util.Scanner;

public class Abstraction_Arithimatic_Main {

	public static void main(String[] args) {
		// create an scanner objet
		
		Scanner scan = new Scanner(System.in);
		scan.close();
		
		System.out.println("Enter the Frist Number");
		int store1 = scan.nextInt();
		
		System.out.println("Enter the Second Number");
		int store2 = scan.nextInt();
		
		System.out.println("Store first value :" +store1);
		
		System.out.println("Store second value :" +store2);
		
		// create an object of child class of abstract class
		
		Abstraction_Arithimatic_C01 child = new Abstraction_Arithimatic_C01();
		
		
		int result1 = child.addition(store1, store2);
		int result2 = child.subtraction(store1, store2);
		int result3 = child.multiplication(store1, store2);
		
		System.out.println("Addition is :" +result1);
		System.out.println("Subtraction is :" +result2);
		System.out.println("Multipliction is :" +result3);
	
	}

}
