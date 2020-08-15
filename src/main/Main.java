package main;

import java.util.ArrayList;

import chalenge06.BiggestWord;
import challenge01.QueenAndTheMonk;
import challenge02.SequenceOne;
import challenge03.HandlingTextOne;
import challenge04.HandlingTextTwo;
import challenge05.Fibonacci;
import challenge07.SequenceOfNumbers;
import challenge08.SecondDegreeEquation;

public class Main {

	public static void main(String[] args) {

		// Challenge 01 - Queen and the monk
		QueenAndTheMonk queenAndTheMonk = new QueenAndTheMonk();

		ArrayList<Double> grainsQuantity = queenAndTheMonk.calcQnt();
		ArrayList<Double> grainsSum = queenAndTheMonk.calcSum();

		System.out.println("=================================");
		System.out.println("Challenge 01 - Queen and the monk");
		System.out.println("=================================");

		for (int i = 0; i < grainsQuantity.size(); i++) {
			Integer casa = i + 1;
			System.out.println(
					"Casa: " + casa + " - " + "Qtd: " + grainsQuantity.get(i) + " - " + "Soma: " + grainsSum.get(i));

		}

		// Challenge 02 - Sequence I
		System.out.println("=================================");
		System.out.println("Challenge 02 - Sequence I");
		System.out.println("=================================");

		SequenceOne sequenceOne = new SequenceOne();

		System.out.println(sequenceOne.calc(5));

		// Challenge 03 - Handling Text I
		System.out.println("=================================");
		System.out.println("Challenge 03 - Handling Text I");
		System.out.println("=================================");

		HandlingTextOne handlingTextOne = new HandlingTextOne();
		String phrase = "Just any sentence to count the number of letters A";
		System.out.println(handlingTextOne.calculateLetterA(phrase));

		// Challenge 04 - Handling Text II
		System.out.println("=================================");
		System.out.println("Challenge 04 - Handling Text II");
		System.out.println("=================================");

		HandlingTextTwo handlingTextTwo = new HandlingTextTwo();
		String phraseTwo = "Just any sentence to count the number of words";
		System.out.println(handlingTextTwo.calculateNumberOfWord(phraseTwo.trim()));

		// Challenge 05 - Fibonacci
		System.out.println("=================================");
		System.out.println("Challenge 05 - Fibonacci");
		System.out.println("=================================");

		Fibonacci fibonacci = new Fibonacci();
		System.out.println(fibonacci.fibonacciSequence(10));

		// Challenge 06 - Biggest Word
		System.out.println("=================================");
		System.out.println("Challenge 06 - Biggest Word");
		System.out.println("=================================");

		BiggestWord biggestWord = new BiggestWord();

		System.out.println("Maior palavra = " + biggestWord.calcBiggestWord(phrase));

		// Challenge 07 - Factorial
		System.out.println("=================================");
		System.out.println("Challenge 07 - Factorial");
		System.out.println("=================================");

		SequenceOfNumbers sequenceOfNumbers = new SequenceOfNumbers();
		System.out.println(sequenceOfNumbers.calc(10.0));

		// Challenge 08 - Second Degree Equation
		System.out.println("=================================");
		System.out.println("Challenge 08 - Second Degree Equation");
		System.out.println("=================================");
		
		SecondDegreeEquation secondDegreeEquation = new SecondDegreeEquation();
		System.out.println(secondDegreeEquation.calc(1, -5, 4));
	}

}
