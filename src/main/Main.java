package main;

import java.util.ArrayList;

import challenge01.QueenAndTheMonk;
import challenge02.SequenceOne;
import challenge03.HandlingTextOne;
import challenge04.HandlingTextTwo;
import challenge05.Fibonacci;

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

	}

}
