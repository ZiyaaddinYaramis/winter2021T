package day25_arrays;

import java.util.Arrays;

public class Arrays01 {

	public static void main(String[] args) {

		// Array (Dizi) : Java'da birden fazla variable store etmek icin kullanilan objelerden biridir.
		// Array olustururken 2 seyi declare etmeliyiz: 
		// 1- data type (bir array'in icerisinde sadece ayni data tipinden elemanlar olabilir.) 
		// 2- uzunluk (uzunluk array'in icerisine konulacak max eleman sayisini belirtir ve bundan fazlasini koymak istersek RTE verir)

		int arr[] = { 10, 23, 54 }; // length = 3 1. yol

		String isimler[] = new String[4]; // lenght = 4 olan bos bir array olusturur 2.yol

		// Array'de primitive datalar veya non-primitive datatlarin referenslari store edilebilir
		// Mesela isimler array'inin icinde isim degerleri degil, isimlerin referanslari olur

		// Array'in elemanlarina ulasma ve update etme

		System.out.println(isimler[1]);

		isimler[2] = "Boss";

		isimler[0] = "Elveda";

		// Array'in tum elemanlarini yazdirma

		System.out.println(isimler); // referansi yazdirir // [Ljava.lang.String;@71dac704

		System.out.println(Arrays.toString(isimler)); // [Elveda, null, Boss, null]

		// method kullanmadan tum elemanlari yazdiralim

		for (int i = 0; i < isimler.length; i++) {

			System.out.print(isimler[i] + " ");
		}

		System.out.println();

		System.out.println(arr); // referans
		System.out.println(Arrays.toString(arr));
		
		// Array'in elemanlarini nasil siralayabiliriz
		
		isimler[1]="Bilal";
		isimler[3]="Mehmet";
		
		Arrays.sort(isimler);
		System.out.println(Arrays.toString(isimler));
		
		

	}

}

// objectler non primitive dir ve arr da bir objedir. icindekinin int olmasi muhim degil 
// cunku objenin icinde primitive olabilir. bundan öturude referans