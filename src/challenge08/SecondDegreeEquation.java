package challenge08;

import java.util.ArrayList;

public class SecondDegreeEquation {

	public ArrayList<Double> calc(double a, double b, double c) {

		double x1 = (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
		double x2 = (-b - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);

		ArrayList<Double> roots = new ArrayList<>();
		roots.add(x1);
		roots.add(x2);
		
		
		return roots;

	}

}
