package sayiBulma;

public class Main {

	public static void main(String[] args) {
		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
		int aranacak = 88;
		boolean bool = false;
		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				bool = true;
				break;
			}
		}
		if (bool) {
			System.out.println("aranacak sayı dizi içerisindedir");
		} else {
			System.out.println("aranacak sayı dizi içerisinde değildir");
		}
	}

}
