package main;

import factorial.Factorial;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factorial factorial = new Factorial();
		
		System.out.println("Recursive factoriel solution -> " +  factorial.getFactorialRecursive(0));
		System.out.println("Recursive factoriel solution -> " +  factorial.getFactorialRecursive(3));
		System.out.println("Recursive factoriel solution -> " +  factorial.getFactorialRecursive(6));
		System.out.println("Recursive factoriel solution -> " +  factorial.getFactorialRecursive(8));
		System.out.println("------------------------------------------------------------------------");
		System.out.println("Iterative factoriel solution -> " +  factorial.getFactorialIterative(0));
		System.out.println("Iterative factoriel solution -> " +  factorial.getFactorialIterative(3));
		System.out.println("Iterative factoriel solution -> " +  factorial.getFactorialIterative(6));
		System.out.println("Iterative factoriel solution -> " +  factorial.getFactorialIterative(8));
	}

}
