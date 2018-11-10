public class Test07 {

	public static void main(String[] args) {

		String first = "Gerald";
		String middle = "Foster";
		String last = "Jones";

		String initials = first.substring(0, 1) + middle.substring(0, 1) + last.substring(0, 1);
		String lowerInitials = initials.toLowerCase();

		System.out.println(lowerInitials);

	}

}