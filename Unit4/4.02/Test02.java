public class Test02 {

	public static void main(String[] args) {

		String greeting = "Hello";
		Class currClass = greeting.getClass();
		System.out.println(currClass);
		Class parentClass = currClass.getSuperclass();
		System.out.println(parentClass);

	}

}