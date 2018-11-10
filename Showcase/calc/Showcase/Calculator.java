/*

AP Java Self Study Showcase

Arnav Pradhan	(apradhan)
Ken Wong		(kewong)
Kush Shah 		(kushah)
Samik Pradhan	(spradhan)

This is a calculator that takes 3 inputs: 2 values and 1 operator.

*/

import java.util.*;

public class Calculator {

	public static void main(String[] args) {

		System.out.println("This is a calculator. The program will ask for two numbers and an operator. Valid operators include: +, -, *, ÷, %, ^, and √. If you want to use exponents, the first number is the base and the second number is the exponent. If you want to find the square root, the only number that matters is the second number.");

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

			case '÷':
				result = num1 / num2;
				System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
				break;

			case '^':
				result = Math.pow(num1, num2);
				System.out.println(num1 + "^" + num2 + " = " + result);
				break;

			case '√':
				result = Math.sqrt(num2);
				System.out.println("√(" + num2 + ") = " + result);
				break;

			case '%':
				result = num1 % num2;
				System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
				break;

			default:
				System.out.println("Please input a valid operator.");
				break;

		}

	}

}