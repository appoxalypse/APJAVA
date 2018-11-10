public class Test01 {

	public static void main(String[] args) {

		boolean finishedHomework = true;
		boolean eatDinner = true;

		if (finishedHomework && eatDinner) {
			System.out.println("Time to sleep!");
		}
		else if (finishedHomework && !eatDinner) {
			System.out.println("Eat dinner!");
		}
		else if (eatDinner && !finishedHomework) {
			System.out.println("Finish homework!");
		}
		else {
			System.out.println("Finish homework and eat dinner!");
		}

	}

}