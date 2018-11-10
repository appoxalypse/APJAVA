public class MakeAbba {

	public  static String makeAbba(String a, String b) {

		String result = a + b + b + a;
		return result;

	}

	public static void main(String[] args) {

		String string = makeAbba("Hi", "Bye");
		System.out.println(string);

	}

}