package main;

import java.util.ArrayList;

import chart.BarChartExample;
import factorial.Factorial;
import fibonacci.Fibonacci;
import reverse.Reverse;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Factoriel
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
		
		//Fibonacci
		Fibonacci fibonacci = new Fibonacci();
		System.out.println("------------------------------------------------------------------------");
		System.out.println("Recursive fibonacci solution -> " +  fibonacci.RecursiveFib(0));
		System.out.println("Recursive fibonacci solution -> " +  fibonacci.RecursiveFib(5));
		System.out.println("Recursive fibonacci solution -> " +  fibonacci.RecursiveFib(8));
		System.out.println("Recursive fibonacci solution -> " +  fibonacci.RecursiveFib(12));
	//	System.out.println("Recursive fibonacci solution -> " +  fibonacci.RecursiveFib(100));
		System.out.println("------------------------------------------------------------------------");
		System.out.println("Iterative fibonacci solution -> " +  fibonacci.IterativeFib(0));
		System.out.println("Iterative fibonacci solution -> " +  fibonacci.IterativeFib(5));
		System.out.println("Iterative fibonacci solution -> " +  fibonacci.IterativeFib(8));
		System.out.println("Iterative fibonacci solution -> " +  fibonacci.IterativeFib(12));
		System.out.println("Iterative fibonacci solution -> " +  fibonacci.IterativeFib(100));
		
		//Reverse
		Reverse reverse = new Reverse();
		System.out.println("------------------------------------------------------------------------");
		long startTimeRecursiveReverse = System.nanoTime();
		System.out.println("Recursive Reverse solution -> " +  reverse.reverseRecursive("abc"));
		long endTimeRecursiveReverse = System.nanoTime();
		long timeRecursiveReverse = endTimeRecursiveReverse - startTimeRecursiveReverse;
		
		long startTime2RecursiveReverse = System.nanoTime();
		System.out.println("Recursive Reverse solution -> " +  reverse.reverseRecursive("odd"));
		long endTime2RecursiveReverse = System.nanoTime();
		long time2RecursiveReverse = endTime2RecursiveReverse - startTime2RecursiveReverse;
		
		long startTime3RecursiveReverse = System.nanoTime();
		System.out.println("Recursive Reverse solution -> " +  reverse.reverseRecursive("aujourd'hui"));
		long endTime3RecursiveReverse = System.nanoTime();
		long time3RecursiveReverse = endTime3RecursiveReverse - startTime3RecursiveReverse;
		
		System.out.println("Recursive Reverse solution -> " +  reverse.reverseRecursive("ppp"));
		System.out.println("Recursive Reverse solution -> " +  reverse.reverseRecursive("mosb"));
		
		ArrayList<Long> listRecursive = new ArrayList<>();
		listRecursive.add(timeRecursiveReverse);
		listRecursive.add(time2RecursiveReverse);
		listRecursive.add(time3RecursiveReverse);
		
		System.out.println("------------------------------------------------------------------------");
		long startTimeIterativeReverse = System.nanoTime();
		System.out.println("Iterative Reverse solution -> " +  reverse.reverseIterative("abc"));
		long endTimeIterativeReverse = System.nanoTime();
		long timeIterativeReverse = endTimeIterativeReverse - startTimeIterativeReverse;
		
		
		long startTime2IterativeReverse = System.nanoTime();
		System.out.println("Iterative Reverse solution -> " +  reverse.reverseIterative("odd"));
		long endTime2IterativeReverse = System.nanoTime();
		long time2IterativeReverse = endTime2IterativeReverse - startTime2IterativeReverse;
		
		long startTime3IterativeReverse = System.nanoTime();
		System.out.println("Iterative Reverse solution -> " +  reverse.reverseIterative("aujourd'hui"));
		long endTime3IterativeReverse = System.nanoTime();
		long time3IterativeReverse = endTime3IterativeReverse - startTime3IterativeReverse;
		
		
		ArrayList<Long> listIterative = new ArrayList<>();
		listIterative.add(timeIterativeReverse);
		listIterative.add(time2IterativeReverse);
		listIterative.add(time3IterativeReverse);
		
		System.out.println("Iterative Reverse solution -> " +  reverse.reverseIterative("ppp"));
		System.out.println("Iterative Reverse solution -> " +  reverse.reverseIterative("mosb"));
		
		BarChartExample barChart = new BarChartExample(listIterative, listRecursive);
		//barChart.launch(args);
		
		
		

	}

}
