public class Test02 {

	public static void main(String[] args) {

		String s1 = "Let's do some addition:";
		int num1 = 3;
		int num2 = 2;
		String s3 = "equals the number";
		int sum = num1 + num2;

		String calculation = s1 + " " + num1 + " + " + num2 + " " + s3 + " " + sum;
		System.out.println(calculation);

		// example from runestone
		String message = "12" + 4 + 3;
		System.out.println(message); // 1243

		/*
		This does not work:
		String message2 = 12 + 4 + 3;
		*/

		// add before append:
		String message3 = "12" + (4 + 3);
		System.out.println(message3);

	}

}