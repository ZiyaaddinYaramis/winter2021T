package day40_exceptions;

import java.util.Scanner;

public class Exceptions01 {

	public static void main(String[] args) {

/*
 * Kullanicidan yasini girmesini isteyin. 
 * Kodunuzu kullanici sifirdan kucuk bir sayi 
 * girerse Exception verecek sekilde yazin.
 */
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Lutfen yasinizi giriniz");
		int yas =scan.nextInt();
		
		
		
		
		
		try {
		if (yas>=0) {
			System.out.println("girdiginiz yas : " + yas);
		}else {
			
			
			
			throw new IllegalArgumentException(); // throw ettirdigin zaman program durur
			// new IllegalArgumentException() ile  yeni exception olustururp firlatiyoruz.
        
		
		
		}
		} catch (IllegalArgumentException e)	{
			
			//System.out.println(e.getMessage());
			
			e.printStackTrace();
			
		}
		
		
		System.out.println("Kod bloke olmamis");
		
		// Java'ya bir exception throw ettirmek icin "throw" ve "new" keyword'leri kullanilir
		// throw firlatmak demektir.
		
		
        // bu sekilde yazdigimizda Java exception throw eder ama
        // kodumuz da bloke olmus olur.
        // bloke olmasini engellemek isterseniz kodu try catch ile surround yapabiliriz
	
		
		
		
		
		
		
		
    }
}
