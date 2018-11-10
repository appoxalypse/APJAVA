public class Test06 {

	public static String nameColorFood(String name, String color, String food) {

		String result = name + "'s favorite color is " + color + ". His favorite food is " + food + ".";
		return result;

	}

	public static void main(String[] args) {

		System.out.println(nameColorFood("Julian", "green", "pizza"));

	}

}