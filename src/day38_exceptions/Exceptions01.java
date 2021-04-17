package day38_exceptions;


/*
 * try-catch blogunda hedef farkli durumlar icin aciklama yazip handle etmektir.
 */



import java.util.Scanner;

public class Exceptions01 {

	public static void main(String[] args) {

		// Kullanicidan 2 tamsayi alin ve bölumlerini yazdirin

		Scanner scan = new Scanner(System.in);

		System.out.println("Lutfen bölunecek tamsayiyi yazin");
	
		

		int sayi1 = scan.nextInt();
		
		

		System.out.println("Lutfen bolecek tamsayiyi girin");
		// java exception'i handle etmek icin try-catch blogu olusturmus
		
		
		int sayi2 = scan.nextInt();

		
		try {
			System.out.println("Bolme isleminin sonucu : " + sayi1 / sayi2);
			
		} catch (ArithmeticException e) {
			System.out.println("sayiyi sifira bolemezsin");
		}
		scan.close();
	}

}



/*	
 * try {
			System.out.println("Bolme isleminin sonucu : " + sayi1 / sayi2);
			
		} catch (ArithmeticException e) {
			System.out.println("sayiyi sifira bolemezsin");
		}
		
		===> BUNA Exception'I HANDLE ETMEK DENIR
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * Lutfen bölunecek tamsayiyi yazin
 *	10 
 * 	Lutfen bolecek tamsayiyi 
 * 	girin 0
 * 
 * 
 * 
 * 
 * Exception in thread "main" java.lang.ArithmeticException: / by zero 
 * 			at day38_exceptions.Exceptions01.main(Exceptions01.java:23)
 * 
 * 
 * 
 * 
 * 
 * java.lang.ArithmeticException ==> sorunun ne oldugu
 * 
 * by zero ==> Exception'in kaynagi
 * 
 * Exceptions01.java:23 ==> sorunun oldugu satir
 * 
 */
