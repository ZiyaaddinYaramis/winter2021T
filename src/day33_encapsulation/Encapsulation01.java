package day33_encapsulation;

import day20_scope.Scope1;
import day21_scope.Scope6;

public class Encapsulation01 {

	public static void main(String[] args) {
		
		// OOP concept
        // Object Oriented Programing
        // Bir proje kapsamindaki class'larda olusturulan variable ve method'larin
        // baska class'larda tekrar tekrar yazilmamasi, var oldugu class'dan obje uretilerek
        // bu variable ve method'larin istendigi kadar kullanilmasidir. (reusability)
        // Write Once Reuse Anywhere
        
        // scope6 class'indaki variable ve methodlara ulasmak istiyorum
        // bunun icin Scope6 class'indan obje uretmeliyiz


		Scope6 obj1 = new Scope6();
		// esitligin sol tarafi declartion
		// declaration 2 parcadir ilk parca Data turu, ikinci kisim isim
		// non-primitive'ler icin data turu ayni zamanda class ismi olabilir
		// sitligin saginda ise deger, 2 parcadan olusur
		// new keyword'u, ikincisi de constructor
		// hangi class'dan obje uretmek istersek o class'in constructor'ini kullaniriz
		
		
		
		
		obj1.num1=10;
		System.out.println(obj1.num1); // 10
		
		obj1.add();
		
		
		// deneme() method'unu main method icinden cagirabilir miyim? hayirrrrrrr:)		
		// deneme(); method'u static olmadigi icin main method'dan direk cagrilamaz
		// bunun yerine icinde oldugumuz class'dan bir obje uretip onun uzerinden
		// static olmayan method'lari da cagirabiliriz
		
		
		Encapsulation01 obj3= new Encapsulation01();
		obj3.deneme();
		

	}

	public void deneme() {
		
		// Projemiz kapsaminda bulunan tum Class'lardan
        // public variable ve method'lara istedigim yerden obje ureterek ulasabilirim.
        // eger ulasmak istedigim class uyeleri(class member) public degilse baska 
        // package'lerden ulasmak icin extra islem yapmamiz gerekir.
		
		Scope1 obj2 = new Scope1();
		obj2.isim= "Ahmet";
		obj2.soyisim= "Ozcelik";
		obj2.sayi=15;
		obj2.method();
		
		// Ben istedigim class'dan obje uretip oradaki public class uyelerine ulasabilirim...
		
		
	}
	
	
	
	
	
	
	
	/*
	 * 1) Encapsulation kisaca "data hiding(saklamak)" demektir. 
	 * 
	 * 2) Basarili bir Encapsulation asagidaki ozelliklere sahip olmalidir :
	 *   a) Nasil kullanilacagi belli olmali (Direksiyon gibi)
	 *   b) Kod'un karmasikligi kullanimin karmasikligina sebep olmamali. 
	 *      Yani cok karmasik kodlardan olusan bir yapi basit bir sekilde kullanilmali.
	 *   c) Bir bolumun bozulmasi baska bolumlerin bozulmasina sebep olmamali. 
	 *   
	 * 3) Encapsulayion nasil yapilir ? 
	 *   a) Access Modifier'lari "private" olarak kullaniniz. 
	 *   b) getter ve setter methodlari ile "encapsulated" data'lara ulasip onlari okuyabilir(getter) 
	 *      ve degistirebiliriz(setter)
	 *   
	 * 4) Encapsulation'in faydalari 
	 * 
	 *   a) Esneklik (flexibility). Normalde asagida "age" variable'inin degeri 25'dir . 
	 *      Ama diger class'larda setAge() methodunu kullanarak age
	 *      variable'inin degerini istedigimiz gibi degistirip kullanabiliriz.
	 *  
	 *   b) Reusability(Tekrar kullanabilirlik). getter ve setter method'larini bir kez olustururuz 
	 *      sonra prohe icindeki tum class'lardan istedigimiz kadar kullanabiliriz.
	 *  
	 *   c) Istedigimiz datayi getter() method'u olusturarak okunabilir hale getirebiliriz.
	 *      Istedigimiz datayi getter() method'u olusturmayarak OKUNAMAZ hale getirebilirim.
	 *      
	 *   d) Istedigimiz datayi setter() method'u olusturarak degistirilebilir yapabiliriz.
	 *      Istedigimiz datayi setter() method'u olusturmayarak DEGISTIRILEMEZ yapabiliriz. 
	 *      
	 *   e) Kullanicinin kulandigi sistem arkasindaki karmasik yapiyi kullaniciya gostermez. 
	 *      Boylece kullanici yapmak istediklerini daha rahat yapar.
	 *      
	 *   Note : Tum variable'lar private ve sadece getter() methodlari olusturdum.  
	 *          Bu tarz bir class'da datalar sadece okunabilir ama degistirilemez.
	 *          String'lerde degistirilemez yani immutable'dir . 
	 *          Bu tarz class'lara immutable class denir, yani Setter'i OLMAYAN classlara denir. 
	 * 
	 * 5) Bir Class'da
	 *   a) Tum variable'lar "private" ise 
	 *   b) Tum getter()'ler ve tum setter()'ler olusturulmus ise 
	 *      bu class " FULLY ENCAPSULATED" olarak adlandirilir. 
	 * 
	 * 6) Getter() ve Setter() methodlarina ayni zamanda "Java Beans"da denir. 
	 * 
	 */
	
	
	
	
}
