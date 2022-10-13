package loopDemo;

public class Main {

	public static void main(String[] args) {
		// Döngüler birbirine benzeyen işlemlerin tekkrarlanmasına yarar
		// Örneğin DB'de listedeki 50 öğrenciyi döngülerle ekrana bastırırız
		// i+=2 i'yi 2 şer arttır demek (ör: i=1 i=3 i=5....)
		// i++ i+=1 ve i=i+1 aynı şeyler

		// for
		for (int i = 2; i < 10; i += 2) {
			System.out.println(i);
		}
		System.out.println("For Döngüsü Bitti");

		// While
		int i = 2;
		while (i < 10) {
			System.out.println(i);
			i += 2;
		}
		System.out.println("While Döngüsü Bitti");

		// Do-while
		// Şart sağlanmasa bile en az bir kere çalışır
		int j = 100;
		do {
			System.out.println(j);
			j += 2;
		} while (j < 10);
		System.out.println("Do-while Döngüsü Bitti");
	}

}
