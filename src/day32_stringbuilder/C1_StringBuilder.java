package day32_stringbuilder;

public class C1_StringBuilder {

	public static void main(String[] args) {


		StringBuilder sb1 = new StringBuilder("Rumeysa");
		
		System.out.println(sb1 ); // Rumeysa
		
		sb1.append(" ").append("Cetinturk"); // verilen SB'in yanina istedigimiz String degerlerini ekler
		System.out.println(sb1 ); // Rumeysa Cetinturk
		
		//sb1.append("Javayi cok sever",6,10);  ==> bu sekilde de yapilir
		//System.out.println(sb1); // Rumeysa Cetinturk cok
		
		String cumle = "Javayi cok sever";
		sb1.append(cumle,6,10);  // Baska bir String'den istedigimiz bolumu Sb'in sonuna ekler
								 // baslangic indexi inclusive, bitis indexi exclusive'dir
		System.out.println(sb1); // Rumeysa Cetinturk cok
		
		
		// sb1.append(" ").append("Cetinturk" + " "); ==> bu sekilde de yapilir
		
		
		System.out.println(sb1.length()); // 21  SB'in uzunluk bilgisini verir
		System.out.println(sb1.capacity()); // 23 (7+16) SB'in kapasite bilgisini verir
		
		System.out.println(sb1.charAt(1)); // u SB'in istedigimiz indexde olan karakterin bilgisini verir
		
		
		sb1.charAt(5); // Bize bilgi getiren methodlar Sb1'i degistirmez
		System.out.println(sb1); // Rumeysa Cetinturk cok
		
		sb1.delete(17, 21); // SB'in istedigimiz index'leri arasindaki kismini siler
		System.out.println(sb1); // Rumeysa Cetinturk
		
		sb1.deleteCharAt(16); // Sb'in istedigimiz index'deki karekterini siler
		System.out.println(sb1); // Rumeysa Cetintur
		
		String isim= "Rumeysa Cetintur";
		System.out.println(sb1.equals(isim)); // data turleri farkli oldugu icin // false
											  // icerigin kiyaslanmasi munkun degildir
		
		
		StringBuilder sb2 = new StringBuilder("Rumeysa Cetintur");
		System.out.println(sb1==sb2); // false
		
		
		System.out.println(sb1.equals(sb2)); // false SB'da equals method'u String'den farkli calisir
											 // ancak ayni obje ile kiyaslandiginda true verir
											 // String'deki == gibi calisir
		
		//System.out.println(sb1==sb1); // true
		
		System.out.println(sb1.equals(sb1)); // true
		
		
		System.out.println(sb1.indexOf("Cetin")); // 8 SB'da arama yapar
		System.out.println(sb1.indexOf("e", 6)); // 9 istedigimiz indexten sonrasinda arama yapar
		
		System.out.println(sb1.indexOf("ziya")); // -1 aradigimiz String'i Sb'da bulamazsa -1 dondurur
		
		sb1.insert(7, " "); // istedigimiz index'den itibaren istenen String'i ekler
		System.out.println(sb1); // Rumeysa  Cetintur
		
		
		cumle="Merhaba Dunya";
		
		sb1.insert(0,cumle,0,8); 	
		
		
									// sb1.insert(index, str, offset, len)
									// 0: SB'a hangi index'den itibaren eklenecek
									// cumle : Hangi String'den eklenecek
									// 0 : cumlenin hangi indexinden baslanacak
									// 8 : bitis indexi
		
		sb1.insert(25, cumle, 8, 13);
		System.out.println(sb1); // Merhaba Rumeysa  CetinturDunya
		
		System.out.println(sb1.lastIndexOf("t")); // 22 istenen String'in kullanildigi son index' verir
		System.out.println(sb1.lastIndexOf("a", 22)); // 14 ==> 22 den önceki ilk a (istenen indexten oncesine bakar)
		
		
		sb1.replace(8, 16, "Seher");    // Merhaba Seher CetinturDunya ==> SB'in baslangic ve bitis 
										// index'leri arasindaki kismi verilen String ile degistirir.
		System.out.println(sb1);
		
		sb1.reverse(); // tersten yazdiriyor
		System.out.println(sb1); // aynuDrutniteC reheS abahreM
		sb1.reverse(); // normale döndurduk
		
		sb1.setCharAt(10, 'k'); // ''  a dikkat et  char olmasi lazim
		System.out.println(sb1); // Merhaba Seker CetinturDunya
		
		
		System.out.println(sb1.subSequence(8, 13)); // Seker ==> SB'in istedigimiz index'ler arasindaki bolumu verir
		
	
		System.out.println(sb1.substring(8)); // Seker Cetinturdunya
		// baslangic index'inden sona kadar

		sb1.subSequence(8,13);
		
		System.out.println(sb1); // Merhaba Seker Cetinturdunya
		
		sb1.substring(8, 13);

		System.out.println(sb1); // Merhaba Seker Cetinturdunya

		StringBuilder sb3=new StringBuilder("Java cok guzel");
		StringBuilder sb4=new StringBuilder("Java cok guzel");

		System.out.println(sb3.equals(sb4)); // false
		// iceriklerinin esit oldup olmadigina bakmak icin String'deki equals method'unu kullanalim
		
		System.out.println(sb3.toString().equals(sb4.toString())); // true

		sb3.toString().concat(" Insanin sevdikce sevesi geliyor"); // String class'ina ait methodlar
                       												// kullaninca kalici deg. olmaz 
			System.out.println(sb3);
			//toString() method'unu kullaninca SB String'e donusmus olur
			
			// dolayisiyla tum String methodlari kullanilabilir
			
			
			System.out.println(sb3.toString().concat(" Insanin sevdikce sevesi geliyor"));
			// Java cok guzel Insanin sevdikce sevesi geliyor

			System.out.println(sb1.length()); // 27
			System.out.println(sb1.capacity()); //48

			sb1.trimToSize(); // SB icin hazirlanan kapasitedeki fazlaliklari sile
			// length ile kapasiteyi esit duruma getirir
			
			System.out.println(sb1.length()); // 27
			System.out.println(sb1.capacity()); //27

			// System.out.println(sb3.compareTo(sb4));
		
		
		
		
		
		
		
		
		

	}

}
