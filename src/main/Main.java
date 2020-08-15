package main;

import java.util.ArrayList;

import challenge01.QueenAndTheMonk;
import challenge02.SequenceOne;

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

	}

}
