package day21_scope;

public class Scope2 {

	public static void main(String[] args) {

		// Static variable'lar icin object olusturma ihtiyaci yoktur.
		// Baska bir Class'dan static variable'lara ulasmak istedigimizde
		// Ulasmak istedigimiz Class'in adi.static variable adi yazmamiz yeterlidir.
		
		System.out.println(Scope1.okulAdi);
		System.out.println(Scope1.okulId); // Java Run Time program dir
										   // Scope2 Class'i calistirildiginda Scope1 calismazzz
										   // dolayisiyla en basta olusturulan veya atanan degerler gecerli olur
		
		Scope1.okulAdi="Mehmet Koleji";
		System.out.println(Scope1.okulAdi); // Mehmet Koleji
		
		
		Scope1.staticMethod(); // Scope1 clasindaki staticMethod() calisir
		
		
		/*
		 * 
		 * System.out.println(okulId + " " + okulAdi + " " + acikMi);
		 * okulId=1203;
		 * 
		 * yukaridaki kodlar burada calisir
		 * 
		 * output: 1201 Mehmet Koleji false
		 */
		
		
		
		
		System.out.println(Scope1.okulId); // 1203 (26. satirdan dolayi)
		System.out.println(Scope1.okulAdi); // Mehmet Koleji
		
		
		
	}
	
}
