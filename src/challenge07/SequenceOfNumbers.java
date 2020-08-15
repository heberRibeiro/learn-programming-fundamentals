package challenge07;

public class SequenceOfNumbers {

	public double calc(double value) {

		double factorial;
		double oddSum;
		double evenSum;

		/**
		 * Check if the given number is even or odd
		 */
		if (value % 2 == 0) {
			// Even number

			double totalSum = (value + 1) * (value / 2);
			oddSum = Math.pow((value / 2), 2);
			evenSum = totalSum - oddSum;

		} else {
			// Odd number

			double totalSum = (value * value + value) / 2;
			oddSum = Math.pow((value + 1) / 2, 2);
			evenSum = totalSum - oddSum;

		}

		double numberForFactorCalculation = evenSum - oddSum;
		factorial = this.calcFactorial(numberForFactorCalculation);

		return factorial;
	}

	public double calcFactorial(double value) {

		if (value == 0)
			return 1;

		double factorial = value * calcFactorial(value - 1);

		return factorial;
	}

}
