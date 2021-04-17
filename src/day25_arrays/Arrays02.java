package day25_arrays;

import java.util.Arrays;

public class Arrays02 {

	public static void main(String[] args) {
		
		// verilen bir array'de bir elemanin var olup olmadigini nasil kontrol ederiz?
		
		int arr[]= {10,25,3,16,75};
		
		int sayi=25;
		
		boolean flag=false;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==sayi) {
				flag=true;
			}
		}
		
		if (flag) {
			System.out.println("Array sorulan elemani iceriyor");
		} else {
			System.out.println("Array sorulan elemani icermiyor");
		}
		
		
		// Arrays clas'indan method kullanarak yapalim
		
		Arrays.sort(arr); // ilk önce siralama yapalim [3,10,16,25,75]
		
		System.out.println(Arrays.binarySearch(arr, 10)); // 1
		System.out.println(Arrays.binarySearch(arr, 17)); // -4 // yok ama olsaydi 4.eleman olurdu (index degil)
		System.out.println(Arrays.binarySearch(arr, 5)); // -2
		
		// binarySearch sonuc olarak aradigimiz eleman varsa indexini verir
		// aradigimiz eleman yoksa - isareti ile olsaydi kacinci eleman olacagini dondurur
		
		int arr2[]= {12,15,25,14,3,12,65};
		
		Arrays.sort(arr2);
	
		
		System.out.println(Arrays.binarySearch(arr2, 14)); // 3
		System.out.println(Arrays.binarySearch(arr2, 20)); // -6
		System.out.println(Arrays.binarySearch(arr2, 12)); // 1
		System.out.println(Arrays.binarySearch(arr2, 2)); // -1
		
		
		// Array nasil String'e cevrilir
		
		// String arrayString = arr2.toString(); 
		
		System.out.println(arr2.toString());// ==> referansi yazdirir
		
		System.out.println(Arrays.toString(arr2)); // String' e cevirip yazdirir
		
		String arrayString = Arrays.toString(arr2);
		
		
		
													// arr2 yi String'e cevirerek manipule etmis olduk 
													// bu sayede String METHOD'LARINI kullanabiliriz
		

		System.out.println(arrayString); // [3, 12, 12, 14, 15, 25, 65]  ==> Bosluklar dahil her bir karakter
										 // artik String'dir
        
        
        System.out.println(arrayString.substring(5)); // bastaki [ dahil tum array'i String'e cevirir.
        											  // substring(5) => 5. index dahil sonrasini yazdirir 

		
		
		
			
	

	}

}
