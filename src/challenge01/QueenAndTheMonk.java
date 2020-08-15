package challenge01;

import java.util.ArrayList;

public class QueenAndTheMonk {

	public ArrayList<Double> calcQnt() {
		
		ArrayList<Double> grains = new ArrayList<>();

		grains.add(1.0);

		while (grains.size() < 64) {

			int indexLastValue = grains.size() - 1;
			Double lastsValue = grains.get(indexLastValue);

			grains.add(lastsValue * 2);
		}

		return grains;

	}
	
	public ArrayList<Double> calcSum() {
		
		ArrayList<Double> grainsSum = new ArrayList<>();
		ArrayList<Double> qnt = this.calcQnt();
		
		grainsSum.add(1.0);
		qnt.add(1.0);
		
		for (int index = 1; index < qnt.size(); index++) {
			// qnt      = [1, 2, 4, 8, 16...]
			// grainSum = [1, 3, 7, x ]
			
			Double value = qnt.get(index) + grainsSum.get(index - 1); 
			grainsSum.add(value);
		}
		
		return grainsSum;
		
	}

}
