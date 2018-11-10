public class Test01 {

	public static String firstLetter(String firstName, String middleName, String lastName) {

		String result = firstName.substring(0, 1) + middleName.substring(0, 1) + lastName.substring(0, 1);
		return result.toLowerCase();

	}

	public static void main(String[] args) {

		System.out.println(firstLetter("Samik", "Rajesh", "Pradhan"));

	}

}