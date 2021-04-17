package day38_exceptions;

import java.util.Scanner;

public class Exceptions02 {

	public static void main(String[] args) {

		// Kullanicidan 2 tamsayi alin ve bölumlerini yazdirin

		int count = 1;
		
		Scanner scan = new Scanner(System.in);

		while (count < 100) {

			// Scanner scan = new Scanner(System.in);

			System.out.println("Lutfen bölunecek tamsayiyi yazin");

			int sayi1 = scan.nextInt();

			System.out.println("Lutfen bolecek tamsayiyi girin");

			int sayi2 = scan.nextInt();

			
			
			/*
			 * java'ya exception'i handle etmek icin bir cözum uretmezsek java exception ile
			 * karsilastiginde calismayi durdurur (stop execution) throws exception
			 * (exception firlatir) (problemin kaynagini bize gösterir)
			 * 
			 * tum aplication durmus olur... Musterinin kullandigi bir uygulama icin bu
			 * KABUL EDILEMEZ bunun icin kod yazan kisi muhtemel sorunlari ongörmeli ve java
			 * ya bu sorunla handle edebilmesi icin yol göstermelidir
			 * 
			 */

			
			
			System.out.println("islem no : " + count);

			try {

				System.out.println("Bolme isleminin sonucu : " + sayi1 / sayi2);
			} catch (ArithmeticException e) {
				System.out.println("sayiyi sifira bolemezsin");
			}
			count++;
		}
		scan.close();
	}

}
