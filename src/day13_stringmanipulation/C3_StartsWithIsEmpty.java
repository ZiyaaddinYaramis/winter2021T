package day13_stringmanipulation;

public class C3_StartsWithIsEmpty {

	public static void main(String[] args) {
	
		String str = "Her gun Java olsa";
		
		// startsWith() verilen String'in istenen karakterle baslayip  baslamadigini true yada false olarak dönus yapan  method'dur
		
		
		System.out.println(str.startsWith("H")); // true
		
		System.out.println(str.startsWith("Her ")); // true
		
		System.out.println(str.startsWith("g",4)); // true
		
		System.out.println(str.startsWith("Java,7")); // false (7. index dahil oldugundan öturu false oldu)
		
		System.out.println(str.isEmpty()); // false
		
		String str2 = "";
		
		System.out.println(str2.isEmpty()); // true  
		
		//isEmpty() verilen String'in uzunlugu 0 (sifir) yani hicbir karakter icermiyorsa output'un true yada false olarak döndugu method'dur
		
		// String str3 = null; // null bir deger degildir
							  // sadece str3'un hic bir seye esit olmadigini gosteren POINTER'dir
		
		// System.out.println(str3.isEmpty()); // RTE

	}

}
