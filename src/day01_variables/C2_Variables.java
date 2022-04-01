package day01_variables;

public class C2_Variables {
	
	public static void main(String[] args) {

		
		int sayi; // ;  yazim dilindeki . gibidir. java ;`u görunce o satirdaki kod yaziliminin bittigini anlar
		sayi=27;
		System.out.print(sayi); // eger println degilde print yazarsak yazdirma isleminden
		                        // sonra alt satira gecmez
		
		char ilkHarf='M';
		
		System.out.println(ilkHarf);  // println yazinca yazma isleminden sonra alt satira gecer
		
		double sayiDouble = 5.34;
		
		System.out.println(sayiDouble);
		
		System.out.println(sayi + sayiDouble); // 27 + 5.34 = 32.34
		
		System.out.println(sayi + ilkHarf); // 27 + 77 = 104
		// Eger bir toplama isleminde char degisken kullanilirsa karakterin Ascii degeri ile toplama yapilir
		// char data turundeki degiskenler matematiksel islemlerde kullanilirsa ASCII TABLOSU DEVREYE GIRER
		// java o karekter yerine ASCII tablosundaki degeri kullanir
	}
}
