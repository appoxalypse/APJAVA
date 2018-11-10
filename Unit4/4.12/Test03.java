public class Test03 {

	public static String faveSport(String name, String sport) {

		String result = name + "'s favorite sport is " + sport + ".";
		return result;

	}

	public static void main(String[] args) {

		System.out.println(faveSport("Gabby", "soccer"));

	}

}