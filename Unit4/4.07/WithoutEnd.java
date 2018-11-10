public class WithoutEnd {

	public static String withoutEnd(String str) {

		String result = str.substring(1, str.length() - 1);
		return result;

	}

	public static void main(String[] args) {

		String string = withoutEnd("coding");
		System.out.println(string);

	}

}