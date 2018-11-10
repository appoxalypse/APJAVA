public class Test01 {

	public static void main(String[] args) {

		String s1 = "apple";
		String s2 = "bat";
		String s3 = s2;
		System.out.println(s3); // defines string

		String s4 = "cat";
		System.out.println(s1 == s2); // tests for equality
		System.out.println(s2 == s4); // doesn't change value

	}

}