package day09_ternary;

import java.util.Scanner;

public class C4_Ternary4 {

	public static void main(String[] args) {
		
		// Soru2 ) Kullanicidan bir tam sayi alin ve 
		// sayinin tek veya cift oldugunu yazdirin
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen bir tam sayi giriniz");
		
		int sayi1 = scan.nextInt();
		
		
		System.out.println((sayi1%2==0)? "Cift sayi" : "Tek sayi");
		
		
		// girilen sayinin mutlak degerini yazdiriniz
        // 5 ->5    -12 -> 12  (girilen sayi x olsun . x pozitifse |x|=x  x negatifse |x|=-x )
		
		System.out.println((sayi1>0) ? sayi1 : -sayi1);

		
		
		scan.close();
	}

}
