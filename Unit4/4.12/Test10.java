public class Test10 {

	public static String removePart(String message, String target) {

		int targetSize = target.length();
		int targetPos = message.indexOf(target);

		String firstPart = message.substring(0, targetPos);
		String secondPart = message.substring((targetPos + targetSize + 1), message.length());

		String result = firstPart + secondPart;
		return result;

	}

	public static void main(String[] args) {

		System.out.println(removePart("I am very happy!", "very"));

	}

}