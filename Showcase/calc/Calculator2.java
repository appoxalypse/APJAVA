import java.util.*;

public class Calculator2 {

	public static void main(String[] args) {

		double num1;
		double num2;
		char operator;
		double result;

		Scanner in1 = new Scanner(System.in);

		System.out.println("Choose the first number: ");
		num1 = in1.nextInt();

		System.out.println("Choose the operator: ");
		operator = in1.next().charAt(0);

		System.out.println("Choose the second number: ");
		num2 = in1.nextInt();

		in1.close();

		switch (operator) {

			case '+':
				result = num1 + num2;
				System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
				break;

			case '-':
				result = num1 - num2;
				System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
				break;

			case '*':
				result = num1 * num2;
				System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
				break;

			case '/':
				result = num1 / num2;
				System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
				break;

			case '^':
				result = Math.pow(num1, num2);
				System.out.println(num1 + "^" + num2 + " = " + result);
				break;

			default:
				System.out.println("Please input a valid operator.");
				break;

		}

	}

}