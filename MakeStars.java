import java.util.Scanner;

public class MakeStars {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String print = "";

		while (input.hasNextLine()) {
			print = "";
			Scanner line = new Scanner(input.nextLine());

			while(line.hasNext()) {
				int charCount = line.next().length();
				for (int i = 0; i < charCount; i++) {
					print += "*";
				}

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

}
