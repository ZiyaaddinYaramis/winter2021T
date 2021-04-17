package day24_arrays;

import java.util.Arrays;

public class Arrays02 {
	
    public static void main(String[] args) {
    	
        /*
         Soru 1: Verilen  bir array’in tum elemanlarini 
         bir soldaki konuma tasiyacak bir program yazin. 
         Ornek; array [1,2, 3] ise output [2, 3, 1] olacak
         */
        
        int arr[]= {1,2,3,4,5,6};
        
        
        
        // int arrYeni[]= {2,3,4,5,6,1}; // böyle bir islemde dinamik olmazdi 
        								 // yani degisen sartlarda gecerli olan bir kod olmazdi
        
        int temp= arr[0]; // Array 0'inci index = temp
        
        for (int i = 0; i < arr.length-1; i++) { // arr.length-1 son index demek
            
            arr[i]=arr[i+1]; // arr[0]=arr[1];
            
               
        }
        
        arr[arr.length-1] =temp; // arr.length-1 son index demek ve son index i temp e atadik yani ilk index oldu
        
        System.out.println(Arrays.toString(arr));
    }
}



