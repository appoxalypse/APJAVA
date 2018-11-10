public class Test11 {

	public static String replace(String message, String replace, String replaceWith) {

		int replacePos = message.indexOf(replace);
		int replaceSize = replace.length();

		String before = message.substring(0, replacePos);
		String after = message.substring((replacePos + replaceSize), message.length());

		String result = before + replaceWith + after;
		return result;

	}

	public static void main(String[] args) {

		System.out.println(replace("That was great - lol.", "lol", "laugh out loud"));

	}

}