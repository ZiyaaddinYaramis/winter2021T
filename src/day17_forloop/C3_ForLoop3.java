package day17_forloop;

import java.util.Scanner;

public class C3_ForLoop3 {

	public static void main(String[] args) {
		
		// Kullanicidan 35'den kucuk pozitif bir sayi alin
		// girilen sayinin faktoriyelini hesaplayip yazdiran bir method olusturunuz
		// 6! = 1*2*3*4*5*6 =720
		
		Scanner scan= new Scanner(System.in);
		
        System.out.println("Lutfen faktoriyel hesaplamak icin 35'den kucuk pozitif bir sayi giriniz");
        
        int sayi=scan.nextInt();
        
        // int faktoriyel=1; // carpma islemine gore etkisiz eleman oldugu icin 1 sectik
        
        if (sayi<=0 || sayi>=35) {
			System.out.println("Lutfen gecerli bir sayi giriniz");
		} else {
			faktoriyelBul(sayi); //5
		}
        
        
        
     scan.close();   

	}

	public static void faktoriyelBul(int sayi) { // sonucu yazdirmamiz yeterli onun icin  void yaptik
		long faktoriyel=1;
		
		for (int i = 1; i <= sayi; i++) {
			faktoriyel*=i;
		}
		
		System.out.println(faktoriyel);
		
	}

}
