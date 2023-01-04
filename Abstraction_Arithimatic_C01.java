 // child class of abstract class 
package com.abstraction.abstractMethod;

public class Abstraction_Arithimatic_C01 extends Abstraction_Arithimatic_p01 {

	@Override
	int addition(int a, int b) {
		int add = a+b;
		return add;
	}

	@Override
	int subtraction(int a, int b) {
		int subtract = a-b;
		return subtract ;
	}

	@Override
	int multiplication(int a, int b) {
		int multiply =a*b;
		return multiply;
	}

}
