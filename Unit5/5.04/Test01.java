public class Test01 {

	public static void main(String[] args) {

		int x = 0;
		int y = 3;

		if (x == 0 || (y / x) == 3) { // evaluates as true and goes to the first case without touching the second conditional
			System.out.println("first case");
		} else {
			System.out.println("second case");
		}

	}

}