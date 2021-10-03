
public class Factorial {

	public static void main(String[] args) {
		// factorial------------
		int number = 5, fact = 1;
		for (int i = 1; i <= number; i++) {
			fact = fact * i;
		}
		System.out.println("factorial of " + number + " is = " + fact);
//-------------------------------------------------
//convert negative to positive
		int number1 = -2;
		if (number1 > 0) {
			System.out.println("number is positive = " + number1);
		} else if (number1 < 0) {
			number1 = number1 * -1;
			System.out.println("number is negative -" + number1 + " converted to positive = " + number1);

		} else {
			System.out.println("number is neutral = " + number1);
		}
		// ---------------------------
		// fibonacci
		int numb1 = 0, numb2 = 1, sum;
		for (int i = 0; i < 8; i++) {
			sum = numb1 + numb2;
			numb1 = numb2;
			numb2 = sum;

			System.out.println("sum = " + sum);
		}
		// -----------------------

	}
}
