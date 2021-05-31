package officeHours.day02;

import java.util.Scanner;

public class Question_05 {

	
	public static void main(String[] args) {
		/* Kullanicidan ilk 3 buyuk harfden biri secildiginde cumle yazdiran kod yaziniz (switch case kullanin)
		 *
		 * ornek
		 *  Kullanici  : A , B , C harflerinden birini secsin
			 A'yi secmis ise, ==> Java is easy
			 B'yi secmis ise, ==> Java is fun
			 C'yi secmis ise, ==> I need to study :)
			 
			 
		 */	 
		Scanner scan = new Scanner(System.in);
		System.out.print (" A,B,C karakterlerinden birini giriniz=");
		char karakter= scan.next().toUpperCase().charAt(0);
		
			switch (karakter) {
			case 'A':
				System.out.print("Java is easy ");
				break;
			case 'B':
				System.out.print("Java is fun");
				break;
			case 'C':
				System.out.print("I need to study :)");
				break;
		
			 default:System.out.println("Lutfen bu uc harften birini seciniz...");
			}
    scan.close();
	}

}
