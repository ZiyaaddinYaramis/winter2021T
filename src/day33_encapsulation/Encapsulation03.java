package day33_encapsulation;

public class Encapsulation03 {

	public static void main(String[] args) {
		
		// Encapsulation02 class'indaki class member'a ulasmaya calisalim (class member = objeleri vs)
		
		Encapsulation02 obj1 = new Encapsulation02();
		Encapsulation02 obj2 = new Encapsulation02();
		
	
		
		
		// Arkadaslar biz erisim yetkisini ikiye ayiriyoruz
		// 1- okuyabilme
		// 2- degistirip kullanabilme
		
		System.out.println(obj1.sayi); // 100 public oldugundan  hem okudum
		obj1.sayi=25;					// 25 hem de deger atayabildim
	
		System.out.println(obj1.sayi); // 25

		// System.out.println(sayi); ==> kabul etmez yeni bir sayi sanar
		
		System.out.println(obj2.sayi); // 100
		
		
		
		
		
		
		System.out.println(obj1.getOkulIsmi()); // Yildiz Koleji /// get method'u oldugu icin sadece bilgi verir
		// obj1.getOkulIsmi()= "Mehmet Koleji"; // get method'u sadece oku, degistiremez
		
		
		
		// System.out.println(obj1.setHesapNo()); ==> yazdiramayiz cunku yetkimiz yok
		
		obj1.setHesapNo(546789);; // ama atama yapabiliriz. atamada ancak (546789) bu sekilde olur 
		
		// System.out.println(obj1); // referansi verir ==> day33_encapsulation.Encapsulation02@123772c4
		
		// Bir Class icinde class member oluşturuken bunu diğer class'lar ile
		// ne oranda paylaşacağımıza karar veririz
		
		// 1-  Herkes okuyabilsin ve obje üzerinden değer atayıp kullanbilsin ==> public
		// 2 - Herkes okuyabilsin ama kimse obje izerinden de olsa değiştiremesin Private ==> Public get();
		// 3 - İlk atadığım değeri kimse goremesin Private ==> Public set ()
		
	}

}
