public class Part06 {

	public static void main(String[] args) {

		int miles = 200;
		double price = 2.20;
		int mpg = 42;
		double numGalls = miles / mpg;
		double totalCost = numGalls * price;
		System.out.println(totalCost);

	}

}