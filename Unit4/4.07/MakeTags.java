public class MakeTags {

	public static String makeTags(String tag, String word) {

		String result = "<" + tag + ">" + word + "</" + tag + ">";
		return result;

	}

	public static void main(String[] args) {

		String string = makeTags("i", "Yay");
		System.out.println(string);

	}

}