public class Test02 {

	public static void main(String[] args) {

		String s1 = "abccba";
		int pos = s1.indexOf("b");
		System.out.println(pos);

		String s2 = "baby";
		int len = s2.length();
		System.out.println(len);

		String s3 = s2.substring(0, 3);
		System.out.println(s3);

		String s4 = "Miss you!";
		int len2 = s4.length();
		System.out.println(len2);

		String s5 = s2.substring(2);
		System.out.println(s5);

	}

}