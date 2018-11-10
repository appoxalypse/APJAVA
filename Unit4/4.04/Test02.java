public class Test02 {

	public static void main(String[] args) {

		String s1 = "hello";
		String s2 = "Hello";
		String s3 = "aaaaa";
		System.out.println(s1 == s2); // false
		System.out.println(s1 == s3); // false
		System.out.println(s1.equals(s2)); // false

		// case matters

	}

}