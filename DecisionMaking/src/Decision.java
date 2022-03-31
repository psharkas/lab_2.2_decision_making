import java.util.Scanner;

public class Decision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter a number between 1 and 100.");

		int num = scnr.nextInt();
		System.out.println(num);

		if (num % 2 == 0) {

			if (num >= 2 && num <= 25) {
				System.out.println("Even and less than or equal to 25.");
			}

			else if (num >= 26 && num <= 60) {
				System.out.println("Even.");
			}

			else if (num > 60) {
				System.out.println(num + " and Even.");
			}
		}

		else {

			if (num > 60) {
				System.out.println(num + ", Odd and over 60.");
			}

			else {
				System.out.println(num + " and Odd.");
			}

		}

	}

}
