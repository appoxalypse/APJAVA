public class Right2 {

	public static String right2(String str) {

		String original = str;
		String lastTwo = str.substring(str.length() - 2, str.length());
		String firstLetters = str.substring(0, str.length() - 2);

		String result = lastTwo + firstLetters;

		return result;

	}

	public static void main(String[] args) {

		System.out.println(right2("Hello"));

	}

}