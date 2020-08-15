package challenge05;

import java.util.ArrayList;

public class Fibonacci {

	public ArrayList<Integer> fibonacciSequence(int value) {

		ArrayList<Integer> fibonacci = new ArrayList<>();

		fibonacci.add(0);
		if (value == 0)
			return fibonacci;

		fibonacci.add(1);
		if (value == 1)
			return fibonacci;

		for (int i = 2; i <= value; i++) {

			int antepenultimateValie = fibonacci.get(i - 2);
			int lastValue = fibonacci.get(i - 1);
			fibonacci.add(lastValue + antepenultimateValie);

		}

		return fibonacci;

	}

}
