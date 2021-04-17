package day24_arrays;

import java.util.Arrays;

import java.util.Scanner;

public class Arrays04 {
	
    public static void main(String[] args) {
    	
        // Kullanicidan degerler alarak int bir array olusturun
        // once kullanicidan girecegi sayi adedini almamiz lazim ki array'i olusturalim
        
        Scanner scan= new Scanner(System.in);
        
        System.out.println("Lutfen kac sayidan olusan bir array istediginizi yaziniz");
        
        int sayiAdeti=scan.nextInt(); 
        
        
        
        System.out.println("Lutfen sayilari giriniz");
        
        int arr[]= new int[sayiAdeti]; // sayiAdeti kadar  int data type den olusan bir array objesi olusturduk
        
       // System.out.println("Lutfen sayilari giriniz"); // Burada da yazilabilir java akillidir
        
        for (int i = 0; i < arr.length; i++) {
           arr[i]= scan.nextInt();
            
        }
        
        System.out.println(Arrays.toString(arr));
        
        
        scan.close();
    }
}
