package day25_arrays;

import java.util.Arrays;

public class Arrays04 {

	public static void main(String[] args) {
		
		// iki array'in esit oldugunu kontrol etme
		
		int arr[]= {10,25,5,20};
		int arr2[]= {25,10,20,5};
		
		System.out.println(Arrays.equals(arr, arr2)); // false
		
		Arrays.sort(arr); // [5, 10, 20, 25]
		Arrays.sort(arr2); // [5, 10, 20, 25]
		
		System.out.println(Arrays.equals(arr, arr2));
		
		// Iki array'in birbirine esit olmasi icin uzunluklari, icindeki tum elemanlar,
        // ve esit elemanlarin indexleri esit olmalidir.
		
		
		

	}

}
