package day29_passbyvalueimmutable;

public class C5_Immutable02 {

	public static void main(String[] args) {
		
		
		// degisikligi kalici yapmak icin atama yaparsak
		// immutable class'lar nasil davranir
		
		String isim ="Ali";
		
		isim = isim + "";
		
		
		
		System.out.println(isim.equals("Ali")); // true equals sadece degerlere bakar kural!
		System.out.println(isim=="Ali"); // false  (==) isareti hem degere hemde referansa bakar
		
		
		
		String str1 = new String("Mehmet");
		String str2 = new String("Mehmet");
		
		
		System.out.println(str1==str2); // false ==> cunku referanslarinin ayni olmasi imkansiz
		System.out.println(str1.equals(str2)); // true  ==> equals sadece degerlere bakar kural!
		
		
		String str3 = "Mehmet"; // Java String pool yani String havuzuna bakar ve  bulursa  
								// ben niye bir daha olusturayim der ve  tasarruf etmek icin 
		                        // degeri ayni olan  str3 ve str4'e string havuzundaki ayni 
		                        // objeye atiyor
		
		String str4 = "Mehmet";

		System.out.println(str3==str4); // true
		System.out.println(str3.equals(str4)); //true
		
		System.out.println(str3==str1); // false  // her turlu referans farkli cunku biri yeni obje (new keyword) seklinde olusturuldu
		System.out.println(str3.equals(str1)); //true
		
		
	}

}
