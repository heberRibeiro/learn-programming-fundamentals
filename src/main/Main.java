package main;

import java.util.ArrayList;

import challenge01.QueenAndTheMonk;

public class Main {

	public static void main(String[] args) {

		// Challenge 01 - Queen and the monk
		QueenAndTheMonk queenAndTheMonk = new QueenAndTheMonk();

		ArrayList<Double> grainsQuantity = queenAndTheMonk.calcQnt();
		ArrayList<Double> grainsSum = queenAndTheMonk.calcSum();

		// System.out.println(queenAndTheMonk.calcQnt());
		// System.out.println(queenAndTheMonk.calcSum());

		System.out.println("=================================");
		System.out.println("Challenge 01 - Queen and the monk");
		System.out.println("=================================");

		for (int i = 0; i < grainsQuantity.size(); i++) {
			Integer casa = i + 1;
			System.out.println(
					"Casa: " + casa + " - " + "Qtd: " + grainsQuantity.get(i) + " - " + "Soma: " + grainsSum.get(i));

		}

	}

}
