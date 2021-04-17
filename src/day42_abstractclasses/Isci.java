package day42_abstractclasses;


	// ABSTRACT OLMAYAN YANI (CONCRETE) TUM CHILD CLASS'LAR ABSTRACT METHOD'LARI OVERRIDE ETMEK ZORUNDADIR!

	/*
	- Abstract class, genellikle ortak özellikleri olan nesneleri 
		tek bir çati altinda toplamak için kullanilır.
		
	- Tum child class’larda olmasini istedigimiz dinamik ozellikleri (methods) 
		abstract class’da abstract method olarak olustururuz.
		
	- Abstract olmayan (concrete) tum child class’lar abstract method’lari override etmek zorundadir. 
		Boylece tum child class’lar ayni dinamik ozelliklere (methods) sahip olurlar.
 
	- Abstract class nasil olusturulur ? Abstract class olusturmak icin 
		class keyword’unden once abstract keyword’u yazilmalidir.
 			public abstract class Personel {
				}
				
	- Abstract method nasil olusturulur ? 
		Abstract method olusturmak icin abstract keyword’u yazilmalidir.
		 
	- Abstract method’un body’si OLMAZ (No implementation),
	 	body olusturursaniz CTE olusur.
	
	- Abstract method private, final veya static olarak tanimlanamaz.
 		public abstract void maasHesapla();
 
	Not : Bir abstract class, abstract veya concrete method’lara sahip olabilir.
	Not : Concrete class icinde Abstract method OLUSTURULAMAZ!!!!




		Kural 1) Concrete bir child class, parent’i olan abstract class’lardaki 
				tum abstract method’lari implement etmelidir, diger turlu CTE olusur.
				
		Kural 2) Abstract method’lari implement etmek icin oncelikle overriding yapilmalidir.
		
		Kural 3) Abstract class, abstract olmayan (concrete) method’lara da sahip olabilir. 
				Cocrete method’lar implement edilmek ZORUNDA DEGILDIR. 
				Parent-child iliskisi ile kullanilabilirler veya istenirse override edilebilirler.
				
		Kural 4) Abstract bir child class, parent’i olan abstract class’lardaki 
				method’lari implement etmek ZORUNDA DEGILDIR. 
  				Parent-child iliskisi ile tum method’lara ulasabilir.
  				
		KURAL 5) Abstract class’lar somutlastirilamaz (can not be instantiated) 
				yani abstract class’larda obje olusturulamaz.
				
				
		Kural 6) Abstract class’lar private veya final olarak tanimlanamaz.

		Not : Bir abstract class, abstract veya concrete method’lara sahip olabilir.
		NOT : Concrete class icinde Abstract method OLUSTURULAMAZ!!


*/


public class Isci extends Personel {

	public static void main(String[] args) {
		

		Isci isci1 =new Isci();
		
		isci1.maasHesapla(); // Isciler icin maas : 5000 tl cunku override yapildi
		isci1.mesaiBilgisi(); // Isciler gunluk 8 saat calisir override yapildi
		isci1.isim="Ziya"; // Ziya
		System.out.println(isci1.isim);
		
		// System.out.println(isim); // isim static olmalidir ve parent'a giderdi.
		// (sayet static olsaydi ilk degerini yazdirirdi yani parent class'daki ilk atamayi yazardi). 
		// obje uzerinden yapti isen obje. yapmalisin
		
		isci1.ozelSigorta();  	// abstract parent class'daki concrete method'u istersem kullanirim
        						// Bu personel ozel sigorta kapsamindadir
        						// Bu method'u override etmedik ama parent-child iliskisi ile kullanabildik

		
		
		
	}

	@Override
	public void maasHesapla() {
		//   parent class'daki abstract method'u implement (uyarlama) etti
        // 1- sen abstract bir class'i parent edindiysen mutlaka oradaki abstract method'u
        //    implement etmelisin
        // 2- parent class'daki method'da body olmadigi icin onu kullanmanin anlami yok
        //    biz child class'da body olan method (concrete) kullanip islem yapmaliyiz
		
		
		
		System.out.println("Isciler icin maas : 5000 tl");
		
	}

	@Override
	public void mesaiBilgisi() {
		System.out.println("Isciler gunluk 8 saat calisir");
		
	}

}
