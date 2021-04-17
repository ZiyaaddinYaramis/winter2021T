package day21_scope;

public class Scope1 {
	int deneme;
	static int okulId= 1201;
	static String okulAdi="Yildiz Koleji";
	static boolean acikMi; // default deger false
	
	// static variable'lar class level'da olusturuldugu icin class'in her yernden kullanilabilirler
	// instance variable'lar static olmayan method'larda direk kullanilabiliyorken' static method'larda
	// object olusturularak kullanilabiliyordu
	// static variable'lar ise ister static isterse olmayan tum method'lardan direk kullanilabilir

	public static void main(String[] args) {
		
		
		
		System.out.println(okulId + " " + okulAdi + " " + acikMi); // 1201 Yildiz Koleji false
		okulId=1202;
		acikMi=true;
		
		staticMethod();
		
		
		System.out.println(okulId + " " + okulAdi + " " + acikMi); //1203 Yildiz Koleji true  (kodlar siralamaya göre yazilir)
		
	}

	public static void staticMethod() {
		System.out.println(okulId + " " + okulAdi + " " + acikMi); // 1202 Yildiz Koleji true
		okulId=1203;
		
		
		
	}
	
	public void method() {
		okulId=1205;
		
		
	}
	
	
	
}
