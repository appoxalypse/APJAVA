public class Test04 {

	public static void main(String[] args) {

		String s1 = new String("hi there");
		int pos = s1.indexOf("e");
		String s2 = s1.substring(0, pos);
		System.out.println(s2);

		String s3 = "Hi";
		String s4 = s3.substring(0, 1);
		String s5 = s4.toLowerCase();
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);

		String s6 = "Bye";
		int answer = s3.compareTo(s6);
		System.out.println(answer); // positive because H is after B on alphabet (by 6 letters)

	}

}