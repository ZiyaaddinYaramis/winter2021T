package day26_arraylists;

import java.util.ArrayList;
import java.util.List;

public class C3_ArrayList02 {

	public static void main(String[] args) {
		// List'in uzunlugu nasil bulunur
		
		List<Integer> list = new ArrayList<>(); // List ve ArrayList ikiside  import edilmelidir yoksa hata verir
		
		list.add(10);
		list.add(15);
		list.add(8);
		list.add(12);
		list.add(20);
		
		System.out.println(list); // [10, 15, 8, 12, 20]
		
		// list.size() ==> uzunlugu verir
		
		System.out.println(list.size()); // 5
		
		// bir eleman nasil silinir
		
		list.remove(1); // 1. index i kaldirir
		
		System.out.println(list); // [10, 8, 12, 20]
		
		System.out.println(list.remove(2)); // git 12'yi kaldir, bize 12'yi dondurur
		// remove(index) kullandigimizda  o indexteki elemani remove eder 
		// ve bunun delili olarak bize o elemani getirir
		// eger olmayan bir index girersek RTE verir
		
		System.out.println(list); // [10, 8, 20]
		
		List<String> list2 = new ArrayList<>();
		
		list2.add("Ali");
		
		System.out.println(list2.remove("Hasan")); // git Hasan'i kaldir dedik bulamadigi icin false dondurur
		
		// remove(Object) method'u kullanildiginda eger Java istenen elemani bulup remove ederse
		// bize true dondurur, listede bulamazsa istegin yerine 
		// getirilemedigini anlamamiz icin false dondurur.
		
		
		
		

	}

}
