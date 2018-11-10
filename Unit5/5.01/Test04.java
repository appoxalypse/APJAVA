public class Test04 {

	public static void main(String[] args) {

		int score = 93;
		char grade;

		if (score >= 90) {
			grade = 'A';
		}		
		if (score >= 80) {
			grade = 'B';
		}
		if (score >= 70) {
			grade = 'C';
		}
		if (score >= 60) {
			grade = 'D';
		}
		else {
			grade = 'E';
		}

		System.out.println(grade); // OUTPUTS 'D'

		// because all if statements, it goes thru all of them


	}

}