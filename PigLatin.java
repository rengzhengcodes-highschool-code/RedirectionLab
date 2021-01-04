public class PigLatin {

	private static boolean inArray(Object element, Object[] array) {
		for (Object e : array) {
			if (element.equals(e)) {
				return true;
			}
		}

		return false;
	}

	public static String pigLatinSimple (String s) {
		String[] vowels = {"a", "e", "i", "o", "u"};
		String firstLetter = s.substring(0, 1);
		boolean firstLetterIsVowel = false;

		for (String vowel : vowels) {
			if (firstLetter.equals(vowel)) {
				firstLetterIsVowel = true;
			}
		}

		if (firstLetterIsVowel) {
			
		}

		return "";
	}

}
