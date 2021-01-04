public class PigLatin {
	private static String[] vowels = {"a", "e", "i", "o", "u"};

	private static boolean inArray(Object element, Object[] array) {
		for (Object e : array) {
			if (element.equals(e)) {
				return true;
			}
		}

		return false;
	}

	public static String pigLatinSimple (String s) {
		String firstLetter = s.substring(0, 1);
		boolean firstLetterIsVowel = inArray(firstLetter, vowels);

		if (firstLetterIsVowel) {

		}

		return "";
	}

}
