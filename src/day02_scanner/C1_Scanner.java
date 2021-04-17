package day02_scanner;

import java.util.Scanner;

public class C1_Scanner {

	public static void main(String[] args) {
		
		// Scanner ile kullanicidan bilgi alabiliriz
		// 3 adimda scanner islemini gerceklestiriyoruz
		
		// 1. adimda Scanner olusturacagiz
		
		Scanner scan = new Scanner(System.in);
		
		// new : Java da ne zaman  new kelimesini görseniz yeni bir object olusturuluyor demektir
		// parantezin icine yazilan  degerlere parametre diyoruz ve Scanner icin System.in yazmaniz gerekir
		// Bir kod yazdigimizda kodun altinda kirmizi cizgi olusuyorsa veya satir numarasi
		// olan kisimda kirmizi X olusuyorsa bir seyler yanlis demektir
		// util java`nin bizim icin hazirladigi bir kutuphanedir, ihtiyacimiz oldugunda ihtiyacimiz olan kodlari class
		// class`a import etmeniz yeterlidir
		// scan olusturdugumuz Scanner objesine verdigimiz isimdir. Farkli isimler de verebiliriz
		// ancak scan ismi tum programcilar tarafindan  kullanilan bir isimdir
		// kodumuzun anlasilabilir ve rahat okunabilir olmasi icin scan ismini kullanmaniz tavsiye edilir
		
		
		// 2. adim kullaniciya bir mesaj yazin
		System.out.println("Karenin bir kenar uzunlugunu girin");
		
		// 3. adim kullanicinin konsola girdigi degeri programimiza alacagiz
		// kullanicidan bir kenar uzunlugu istedigim icin kullanici kucuk bir sayida girebilir, 
		// buyuk bir sayida yazabilir, tam sayida yazabilir, virgullu sayi da yazabilir
		
		double kenar = scan.nextDouble();
		
		System.out.println("Girdiginiz kenar uzunluguna sahip karenin alani = "+kenar*kenar);
		//5.2 * 5.2 = 27.04
		
		
		scan.close();

	}

}
