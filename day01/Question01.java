package officeHours.day01;

import java.util.Scanner;

public class Question01 {
	public static void main(String[] args) {
		
		/*  Kullanicidan bir karakter girmesini isteyip, o karakterin ascii degerini yazdirin
		 ORNEK:
		         INPUT : #
		 		 OUTPUT : girdiginiz # karakterinin ascii degeri = 125'dir.
		 	 */
		
	Scanner	scan= new Scanner(System.in);
	System.out.print("lutfen bir karakter giriniz=");
	char karakter = scan.next ().charAt(0);
	
	int karakterAscii= (int) karakter;
	
	System.out.println("girdiginiz=" + karakter +" Ascii degeri=" + karakterAscii);
	
	System.out.println(karakter + 0);	
	
	
	scan.close();

	}

}
