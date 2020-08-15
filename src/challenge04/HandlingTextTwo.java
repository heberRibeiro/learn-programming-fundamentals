package challenge04;

public class HandlingTextTwo {

	public int calculateNumberOfWord(String phrase) {

		int phraseLength = phrase.length();

		int numberOfWord = 1;
		for (int i = 0; i < phraseLength; i++) {

			if (phrase.charAt(i) == ' ')
				numberOfWord = numberOfWord + 1;

		}

		return numberOfWord;

	}

}
