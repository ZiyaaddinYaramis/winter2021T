package day19_dowhileloop;

import java.util.Scanner;

public class C1_Count {

	public static void main(String[] args) {
		
		// Kullanicidan bir cumle ve bir harf isteyin
		// while loop kullanarak cumlede istenen harf kac kez kullanilmis bulunuz
		// program Case Sensitive olsun
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Lutfen bir cumle giriniz");
		String cumle = scan.nextLine();
		
		
		System.out.println("Lutfen saymak istediginiz harfi giriniz");
		String harf=scan.next().substring(0,1); // String olarak ilk harfi alir. 
												// substring() string icinden bir bölum almak icin kullanildi
		
		
		int count=0; //ihtiyacimiz olan kac kez kullanilmis degeri
		
		int index=0; // while icin baslangic degeri . while icin mutlaka bir baslangic degerine ihtiyacimiz var.
		
		
		while(index<cumle.length()) { // == kullanmadigimiz icin  .length() yeterli aksi halde .length()-1 kullanmamiz gerekirdi
			// index<cumle.length() ==> bitis degeri
			
			
			if (cumle.substring(index, index+1).equals(harf)) { // substring(index, index+1) ==> istedigimiz index i sira ile getirir
				
				count++;
			}
			
			index++; // while icin artis degeri. bu olmazsa while sonsuz dönguye girer
		}
		
		System.out.println("cumlede" + harf + " harfi " + count + " defa kullanilmis ");
		
		scan.close();
	}

}
