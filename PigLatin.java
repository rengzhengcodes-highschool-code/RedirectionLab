public class PigLatin {
	private static String[] vowels = {"a", "e", "i", "o", "u"};
	private static String[] diagraphs = {"bl", "br", "ch", "ck", "cl", "cr", "dr", "fl", "fr", "gh", "gl", "gr", "ng", "ph", "pl", "pr", "qu", "sc", "sh", "sk", "sl", "sm", "sn", "sp", "st", "sw", "th", "tr", "tw", "wh", "wr"};

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

		String output;

		if (firstLetterIsVowel) {
			output = s + "hay";
		} else {
			output = s.substring(1, s.length()) + s.charAt(0) + "ay";
		}

		return output.toLowerCase();
	}

	public static String pigLatin (String s) {
		boolean isDigraph;
		try {
			isDigraph = inArray(s.substring(0, 2), diagraphs);
		} catch (IndexOutOfBoundsException e) {
			isDigraph = false;
		}

		String output;

		if (isDigraph) {
			output = s.substring(2, s.length()) + s.substring(0, 2) + "ay";
		} else {
			output = pigLatinSimple(s);
		}

		return output.toLowerCase();
	}

}
