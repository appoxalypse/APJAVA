public class Test03 {

	public static void main(String[] args) {

		String s1 = new String("hi");
		String s2 = "bye";
		String s3 = "hi";
		s2 = s1;
		System.out.println(s1 == s2); // true
		System.out.println(s1 == s3); // false
		System.out.println(s1.equals(s3)); // true

		// "==" looks at the address of the strings, not whether they are equal

	}

}