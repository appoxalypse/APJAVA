public class Part02 {

	public static void main(String[] args) {

		double bill = 89.23;
		double tip = bill * 0.20;
		double total = bill + tip;
		int numPeople = 3;
		double perPersonCost = total / numPeople;
		System.out.println(perPersonCost);

	}

}