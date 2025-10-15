package main;

import java.util.ArrayList;
import java.util.Arrays;

import chart.BarChartFibonacci;
import chart.BarChartReverseWord;
import factorial.Factorial;
import fibonacci.Fibonacci;
import javafx.application.Application;
import javafx.stage.Stage;
import reverse.Reverse;

public class Main{

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
		
		long startTimeRecursiveFibonacci = System.nanoTime();
	  //  System.out.println("Recursive fibonacci solution -> " +  fibonacci.RecursiveFib(50));
		long endTimeRecursiveFibonacci = System.nanoTime();
		long timeRecursiveFibonacci = endTimeRecursiveFibonacci - startTimeRecursiveFibonacci;
		System.out.println("------------------------------------------------------------------------");
		System.out.println("Iterative fibonacci solution -> " +  fibonacci.IterativeFib(0));
		System.out.println("Iterative fibonacci solution -> " +  fibonacci.IterativeFib(5));
		System.out.println("Iterative fibonacci solution -> " +  fibonacci.IterativeFib(8));
		System.out.println("Iterative fibonacci solution -> " +  fibonacci.IterativeFib(12));
		
		long startTimeIterativeFibonacci = System.nanoTime();
		System.out.println("Iterative fibonacci solution -> " +  fibonacci.IterativeFib(50));
		long endTimeIterativeFibonacci = System.nanoTime();
		long timeIterativeFibonacci = endTimeIterativeFibonacci - startTimeIterativeFibonacci;
		
		ArrayList<Long> listIterativeFibonacci = new ArrayList<>(Arrays.asList(timeIterativeFibonacci));
		ArrayList<Long> listRecursiveFibonacci = new ArrayList<>(Arrays.asList(timeRecursiveFibonacci));
		
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
		
		ArrayList<Long> listRecursive = new ArrayList<>(Arrays.asList(timeRecursiveReverse, time2RecursiveReverse, time3RecursiveReverse));
		
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

		ArrayList<Long> listIterative = new ArrayList<>(Arrays.asList(timeIterativeReverse, time2IterativeReverse, time3IterativeReverse));

		System.out.println("Iterative Reverse solution -> " +  reverse.reverseIterative("ppp"));
		System.out.println("Iterative Reverse solution -> " +  reverse.reverseIterative("mosb"));
		
		ArrayList<String> name = new ArrayList<String>(Arrays.asList("abc","odd","aujourd'hui"));
		ArrayList<String> nameFibonacci = new ArrayList<String>(Arrays.asList("50"));
		
		graphReverseWord(name, listRecursive, listIterative, args);
		//graphFibonacci(nameFibonacci, listRecursiveFibonacci, listIterativeFibonacci, args);

	}
	
	public static void graphReverseWord(ArrayList<String> name, ArrayList<Long> listeTimeExecutionRecursivityReverse, ArrayList<Long> listeTimeExecutionIterativeReverse, String[] args) {
		BarChartReverseWord.listeTimeExecutionRecursivityReverse = listeTimeExecutionRecursivityReverse;
        BarChartReverseWord.listeTimeExecutionIterativeReverse = listeTimeExecutionIterativeReverse;
        BarChartReverseWord.title = "ReverseWord Iterative VS Recursive";
        BarChartReverseWord.label = "ReverseWord";
        BarChartReverseWord.name = name;
        BarChartReverseWord.NameSerie1 = "ReverseWord Iterative";
        BarChartReverseWord.NameSerie2 = "ReverseWord Recursive";
        Application.launch(BarChartReverseWord.class, args);
	}
	
	public static void graphFibonacci(ArrayList<String> name, ArrayList<Long> listeTimeExecutionRecursivityReverse, ArrayList<Long> listeTimeExecutionIterativeReverse, String[] args) {
		BarChartFibonacci.listeTimeExecutionRecursivityReverse = listeTimeExecutionRecursivityReverse;
		BarChartFibonacci.listeTimeExecutionIterativeReverse = listeTimeExecutionIterativeReverse;
		BarChartFibonacci.title = "Fibonacci Iterative VS Recursive";
		BarChartFibonacci.label = "Fibonacci";
		BarChartFibonacci.name = name;
		BarChartFibonacci.NameSerie1 = "Fibonacci Iterative";
		BarChartFibonacci.NameSerie2 = "Fibonacci Recursive";
        Application.launch(BarChartFibonacci.class, args);
	}
}
