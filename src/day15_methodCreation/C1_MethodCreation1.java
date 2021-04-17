package day15_methodCreation;

import java.util.Scanner;

public class C1_MethodCreation1 {

	public static void main(String[] args) {

		/*
		 * Soru 1 ) Kullanicidan bir sayi alin. Bu sayinin negatif veya pozitif
		 * oldugunu, tek mi cift mi oldugunu ve uc basamakli veya daha buyukse birler,onlar
		 * ve yuzler basamagindaki rakamlarin toplamini, 100’den kucukse sadece 1’ler
		 * basamagini yazdirin.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir tamsayi giriniz");
		
		int sayi = scan.nextInt();

		pozitifNegatif(sayi); // girilen sayi argumentinin pozitif yada negatif oldugunu yazdirsin
		
		tekMiCiftMi(sayi);

		if (sayi >= 100) {

			yuzdenBuyuk(200);

		} else {
			yuzdenKucuk(sayi);
		}
		//scan.close();
		int a = yuzdenBuyuk(sayi);
		System.out.println(a);
	}

	private static void yuzdenKucuk(int sayi) {
		//System.out.println(sayi%10);
		
	}

	public static int yuzdenBuyuk(int sayi) { // 523
		int rakamlarToplami=0;
		
		rakamlarToplami= sayi%10;
        sayi/=10; //52
        
        rakamlarToplami+=sayi%10;
        sayi/=10;
        
        rakamlarToplami+=sayi%10;
        System.out.println(rakamlarToplami);
		
		return rakamlarToplami;

	}

	public static void tekMiCiftMi(int sayi) {
		
		if (sayi % 2 == 0) {
			System.out.println("sayi cift");
		} else {
			System.out.println("sayi tek");
		}
		

	}

	public static void pozitifNegatif(int sayi) { // parametre yazarken data tipinide yazmaliyiz

		System.out.println(sayi > 0 ? "pozitif" : (sayi < 0 ? "negatif" : "pozitif yada negatif degil"));
	}

}
