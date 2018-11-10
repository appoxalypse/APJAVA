public class ExtraEnd {

	public static String extraEnd(String str) {

		String result = str.substring(str.length() - 2, str.length()) + str.substring(str.length() - 2, str.length()) + str.substring(str.length() - 2, str.length());
		return result;

	}

	public static void main(String[] args) {

		String string = extraEnd("Hello");
		System.out.println(string);

	}

}