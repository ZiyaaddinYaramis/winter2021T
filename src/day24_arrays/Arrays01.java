package day24_arrays;

import java.util.Arrays;

public class Arrays01 { // Arrays = Diziler demektir

	public static void main(String[] args) {
		


		int sayi=10;
		int sayi2=20;
		int sayi3=30;
		String isim="Ali";
		
		
		System.out.println(sayi);
		System.out.println(sayi2);
		System.out.println(sayi3);
		System.out.println(isim);
		
		// Java'da  birden fazla elemani koyabilecegimiz (store) object'ler vardir
		// Bugun bunlardan ilkini ögrenecegiz
		
		
		int arr[]= {10,20,30};  // int[] arr seklinde de kullanilabilir
		
								// Bu örnekte  Array'in elemanlarini direk yazdigim icin 
								// uzunluk belirtmeye ihtiyac kalmadi.
								// Bu kullanimda  max eleman sayisi (length) yazdigimiz eleman sayisidir.
		
		System.out.println(arr); // Array bir object'tir
								// Eger direk olarak Array'i yazdirmak isterseniz Java ref'i yazdirir
		
		System.out.println(Arrays.toString(arr)); // [10, 20, 30]
		
		String takim[]= new String[3];  // Array bir object'tir // takim isminde 3 adet String variableden olusan
															    // BIR ARRAY OLUSTURDUK.
		
		System.out.println(Arrays.toString(takim));  // [null, null, null, 

		takim[0]="Ali";
		System.out.println(Arrays.toString(takim)); // [Ali, null, null]
		
		takim[2]="Hasan";
		takim[1]="Veli";
		System.out.println(Arrays.toString(takim)); // [Ali, Veli, Hasan]
		
		// takim[3]="Mehmet";   // Java Run time programdir, dolayisiyla array programi calistirilinca
							   // olusturulur. 42. satirda syntax olarak hata olmadigindan CTE olmaz
							   // program calistiginda 3. index olmadigi icin RTE verir
		
		// Array'deki bir elemani update
		// veli'nin yerine kemal gelsin
		
		takim[1]="Kemal";
		System.out.println(Arrays.toString(takim)); // [Ali, Kemal, Hasan]
		
		// Bir Array'in uzunlugunu nasil bulabiliriz
		
		System.out.println(takim.length); // 3
											// String'deki length() idi  Array'de length
		
		// Array'deki son elemani Mehmet yapin
		
		takim[takim.length-1]="Mehmet";
		System.out.println(Arrays.toString(takim));
		
		
		// eger array'in eleman sayisi tek ise ortadaki elemani Can yapalim
		
		 if (takim.length %2 ==1) { // yani tek sayi ise  // if'in sarti boolean olmalidir
				 
	            int ortaIndex= (takim.length-1)/2;  // takim.length = array'in uzunlugudur ve array'in uzunlugundan 
		 											// 1 cikarip 2 ye bölersen ortaIndex'i bulursun (Matematik)
	            takim[ortaIndex]="Can";
	        }

		System.out.println(Arrays.toString(takim));
		
			
		

	}

}
