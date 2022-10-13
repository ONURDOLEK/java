package sesliHarfler;

public class Main {

	public static void main(String[] args) {
		/*
		 * char harf = 'ş';
		 * 
		 * switch (harf) { case 'A': case 'a': case 'I': case 'ı': case 'O': case 'o':
		 * case 'U': case 'u': System.out.println("Kalın Seslidir"); break; case 'E':
		 * case 'e': case 'İ': case 'i': case 'Ö': case 'ö': case 'Ü': case 'ü':
		 * System.out.println("İnce Seslidir"); break;
		 * 
		 * default: System.out.println("Geçersiz harf girdiniz"); }
		 */

		char harf = 'E';

		switch (harf) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("Kalın sesli harf");
			break;
		default:
			System.out.println("İnce sesli harf");
		}
	}
}
