package day27_arraylist;

import java.util.Arrays;
import java.util.List;

public class ArrayList05 {

	public static void main(String[] args) {
		
		// Verilen bir Array'i list'e nasil ceviririz?
		
		String arr[]= {"Ali","Veli"};
		
		List<String> listArr = Arrays.asList(arr);		// Arrays clas'indan yardim aliyoruz

		System.out.println(listArr); // [Ali, Veli] 
		
		
		
		
		Integer arr1[] = {1,2,3};
		
		List<Integer> list2 = Arrays.asList(arr1);  // Arrays clas'indan yardim aliyoruz
		
		System.out.println(list2); // [1, 2, 3]
		
		
		// (Not: List'te sadece non primitive yada Wapperclass lar olabilir)
		
		// Bazen cok fazla elemani olan bir liste olusturmamiz gerekir.
        // Bu durumda liste elemanlarini tek tek eklemek yerine
        // elemanlari bir Array'e ekler, sonra da array'i list'e cevirebiliriz
        // ornek bir web sitesindei tum urunleri bir listeye eklemek istedigimizde
        
        // Ancak bu method'la array'den cevirdigimiz list esnek olmaz
        // (array'in ozelliklerini tasir) add(), remove(),clear() gibi uzunlugu etkileyen methodlar kullanilamaz
        // Java bu degisimdeki Array ve List'i senkronize eder, birinde yaptigimiz degisiklik
        // otomatik olarak digerini de update eder
		
		
		arr1[1]=5;
		
		System.out.println("Array1 :" + Arrays.toString(arr1));
		System.out.println("list : " + list2);
		
		System.out.println(arr1); // referans verir !!
		
		list2.set(2, 13);
		System.out.println("list2 : " + list2); 
        System.out.println("array2 : " + Arrays.toString(arr1));
		
		
		
	}

}
