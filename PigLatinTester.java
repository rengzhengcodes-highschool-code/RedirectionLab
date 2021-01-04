public class PigLatinTester extends PigLatin {

	public static void main(String[] args) {
		System.out.println(pigLatinSimple("mock"));
		System.out.println(pigLatinSimple("pie"));
		System.out.println(pigLatinSimple("david"));
		System.out.println(pigLatinSimple("aaron"));
		System.out.println(pigLatinSimple("a"));
		System.out.println(pigLatinSimple("t"));

		System.out.println();

		System.out.println(pigLatin("the"));
		System.out.println(pigLatin("check"));
		System.out.println(pigLatin("skee"));
		System.out.println(pigLatin("emu"));
		System.out.println(pigLatin("grade"));
		System.out.println(pigLatin("a"));
		System.out.println(pigLatin("t"));

		System.out.println();

		System.out.println(pigLatinBest("*emu"));
		System.out.println(pigLatinBest("4chan"));
		System.out.println(pigLatinBest("fish!"));
		System.out.println(pigLatinBest("fish"));
		System.out.println(pigLatinBest("the."));
		System.out.println(pigLatinBest("cat!"));
		System.out.println(pigLatinBest("amazing?"));
		System.out.println(pigLatinBest("apple%"));
	}

}
