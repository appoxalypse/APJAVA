public class Test09 {

	public static String firstLetterCap(String name) {

		String firstLetter = name.substring(0, 1);
		String restLetters = name.substring(1, name.length());

		String result = firstLetter + restLetters.toLowerCase();
		return result;

	}

	public static void main(String[] args) {

		System.out.println(firstLetterCap("ALEX"));

	}

}