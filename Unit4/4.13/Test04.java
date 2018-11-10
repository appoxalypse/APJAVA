public class Test04 {

	public static void main(String[] args) {

		String message = "I hope this works";

		String part1 = message.substring(0, 2);
		String part2 = message.substring(message.length() - 2);

		System.out.println(part1 + part2);

	}

}