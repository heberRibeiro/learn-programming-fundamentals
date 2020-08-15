package challenge02;

import java.util.ArrayList;

public class SequenceOne {

	public Double calc(int value) {

		ArrayList<Double> seq = new ArrayList<>(); // [5, 4, 3, 2, 1]

		for (double i = 0; i < value; i++) {
			seq.add(value - i);
		}

		double sum = 0;
		for (int i = 0; i < seq.size(); i++) {
			sum = sum + (seq.get(i) / (i + 1));
		}

		return sum;

	}

}
