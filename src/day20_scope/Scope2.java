package day20_scope;

public class Scope2 {

	public static void main(String[] args) {
		// ben farkli class'lardan da Scope1 class'ina object olusturarak ulasabilirim. 
		// Direk kullanilamaz objeckt ile ulasilabilir. Cunku instance variable.
		
		Scope1 obj4 = new Scope1();
		System.out.println(obj4.isim); // Scope1 class'indaki ilk instance variable degerini alir.
									   //(class level'daki) // Mehmet
		System.out.println(obj4.soyisim); // null
		
		obj4.soyisim = "Can";
		obj4.isim = "Ahmet";
		
		System.out.println(obj4.isim + " " + obj4.soyisim);
		
		
		
		

	}

}
