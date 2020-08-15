package chalenge06;

import java.util.ArrayList;
import java.util.Arrays;

public class BiggestWord {

	public String calcBiggestWord(String phrase) {

		String biggestWord = "";

		ArrayList<String> words = new ArrayList<>(Arrays.asList(phrase.split(" ")));

		for (String word : words) {

			if (word.length() > biggestWord.length())
				biggestWord = word;

		}

		return biggestWord;

	}

}
