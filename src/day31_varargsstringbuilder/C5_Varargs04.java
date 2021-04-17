package day31_varargsstringbuilder;

import java.util.ArrayList;
import java.util.List;

public class C5_Varargs04 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(20);
		
		
	    // toplama(list); // varargs esnek oldugu icin list'e benzese de list degildir

		
		Integer arr[] = {15, 20, 25 };
		
		Integer arr1[] = list.toArray(new Integer[0]); 
		
		// multiDiamensionalArrays desteklenmiyor (not applicable ==> uygulanamaz)
		
		toplama(arr); // 60 // varargs array olarak calisir ve argument olarak array yollanabilir

		// kullanicidan deger alarak varargs calsitirmak istiyorsak
		// girilen degerleri bir array'e kaydetmeliyiz
		// bunun icin kullanicidan aldiginiz degerleri esnek oldugu icin bir list'e
		// koyariz
		// sonra list'i array'e ceviririz.
		
		toplama(arr1); // 30 // List'in array e cevrilip calistirilmasi

	}

	public static void toplama(Integer... var) {

		Integer toplam = 0;

		for (Integer each : var) {

			toplam += each;
		}

		System.out.println(toplam);
	}

}
