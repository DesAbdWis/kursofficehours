package officeHours.day02;

import java.util.Scanner;

public class Question_04 {

	public static void main(String[] args) {
		/*Kullanici tarafindan girilen bir sayinin
		 *mutlak degerini yazdirmak iiin bir program yazin.
		 */

		
		Scanner scan = new Scanner(System.in);
		System.out.print("Lutfen bir sayi giriniz=");
		int sayi = scan.nextInt();
		
		// System.out.println("sayinin mutlak degeri=" + Math.abs(sayi));
		
		 if (sayi < 0) {
           System.out.println("mutlak degeri=" + sayi*(-1));
        }
        else {
            System.out.println("mutlak degeri=" +sayi);
        }
 
		scan.close();
		
		
		
		
		
		
	}

}
