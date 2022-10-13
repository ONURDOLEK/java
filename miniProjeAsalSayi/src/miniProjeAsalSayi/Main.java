package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {
		/*
		 * int number = 25; int remainder = number % 2; System.out.println(remainder);
		 */

		int number = 2;
		int remainder = number % 2;
		boolean isPrime = true;
		
		if(number==1) {
			System.out.println("sayı asal değidir");
			return;
		}
		if(number<1) {
			System.out.println("geçersiz sayı");
			return;
		}
		for (int i = 2; i < number; i++) {

			if (number % i == 0) {
				isPrime = false;
			}
		}
		if (isPrime) {
			System.out.println("sayı asaldır");
		} else {
			System.out.println("sayı asal değildir");
		}

	}

}
