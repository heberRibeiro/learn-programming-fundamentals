package challenge03;

public class HandlingTextOne {
	
	public int calculateLetterA(String phrase) {
		
		int phraseLength = phrase.length();
		
		int sumLetterA = 0; 
		for (int i = 0; i < phraseLength; i++) {
			
			if (phrase.charAt(i) == 'a' || phrase.charAt(i) == 'A') sumLetterA = sumLetterA + 1;
			
			
		}
		
		
		return sumLetterA;
		
	}

}
