package officeHours.day01;

import java.util.Scanner;

public class Question05 {

	public static void main(String[] args) {

		// Kullanicidan kilosunu ve boyunu alip
		// Vucut kitle indeksini hesaplayan bir program yaziniz.
		// Ipucu : Vucut
		// Kitle Indeksi (VKI) = Vucut Agirligi(kg.) / Boy uzunlugunun karesi (m.)
		// ORNEK:
		// INPUT      : Kilo: 71
		//                   Boy: 1,72
		// OUTPUT  : Vucut Kitle Indeksiniz : 23


		Scanner scan = new Scanner(System.in);
		System.out.println("vucut agırlıgı="); double agirlik = scan.nextDouble();
		System.out.println("boy uzunlugu="); double uzunluk = scan.nextDouble();

		double vkı= agirlik / (uzunluk*uzunluk);
		System.out.println("vucut kitle iNDEKSİ (VKI) =" + Math.round(vkı));

		scan.close();
    }
}
