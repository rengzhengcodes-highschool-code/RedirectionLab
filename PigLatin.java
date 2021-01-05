import java.util.Scanner;


public class PigLatin {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String print = "";

		while (input.hasNextLine()) {
			print = "";
			Scanner line = new Scanner(input.nextLine());

			while(line.hasNext()) {
				print += pigLatinBest(line.next());

				if (line.hasNext()) {
					print += " ";
				}
			}

			if (input.hasNextLine()) {
				System.out.println(print);
			}
		}

		System.out.print(print);
	}

	private static String[] vowels = {"a", "e", "i", "o", "u"};
	private static String[] diagraphs = {"bl", "br", "ch", "ck", "cl", "cr", "dr", "fl", "fr", "gh", "gl", "gr", "ng", "ph", "pl", "pr", "qu", "sc", "sh", "sk", "sl", "sm", "sn", "sp", "st", "sw", "th", "tr", "tw", "wh", "wr"};
	private static String[] letters = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

	private static boolean inArray(Object element, Object[] array) {
		for (Object e : array) {
			if (element.equals(e)) {
				return true;
			}
		}

		return false;
	}

	public static String pigLatinSimple (String s) {
		s = s.toLowerCase();
		String firstLetter = s.substring(0, 1);
		boolean firstLetterIsVowel = inArray(firstLetter, vowels);

		String output;

		if (firstLetterIsVowel) {
			output = s + "hay";
		} else {
			output = s.substring(1, s.length()) + s.charAt(0) + "ay";
		}

		return output;
	}

	public static String pigLatin (String s) {
		s = s.toLowerCase();
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

		return output;
	}

	public static String pigLatinBest (String s) {
		s = s.toLowerCase();
		boolean startsWithLetter = inArray(s.substring(0, 1), letters);
		String output;

		if (!startsWithLetter) {
			output = s;
		} else {
			boolean endsWithLetter = inArray(s.substring(s.length() - 1, s.length()), letters);

			if (endsWithLetter) {
				output = pigLatin(s);
			} else {
				output = pigLatin(s.substring(0, s.length() - 1)) + s.charAt(s.length() - 1);
			}
		}

		return output;
	}

}
