public class Test02 {

	public static void main(String[] args) {

		double height = 60;
		double weight = 110;
		double heightSquared = height * height;
		double bodyMassIndex = weight / heightSquared;
		double bodyMassIndexMetric = bodyMassIndex * 703;
		System.out.println(bodyMassIndexMetric);

	}

}