package day35_inheritance;

public class Personel {

	public String isim;
	public int sayi;
	



	public Personel() { // parametresiz bir cons. olusturdum (source ile yaptik ve hicbir parametme secmedik)
		// super();
		
		/*
		 * Java dan yaridim alarak bir cons. olusturdugumuzda java cons. ilk satirirna  super(); keyword'unu ekler
		 * Eger icinde oldugumuz class bir child class degilse super(); keywordu silinebilir
		 * Bugune kadar biz olusturdugumuz cons.'larda hic super(); keywordu'u kullanmadik
		 * 	ancak bizim classlarimiz child class olmadigindan sorun olmadi
		 */
		
		System.out.println("Personel parametresiz cons. calisti");
	}


	public Personel(String isim, int sayi) { // parametreli bir cons. olusturdum (source ile yaptik ve parametme secdik)
		super();
		//this.isim = isim;
		//this.sayi = sayi;
		
		
		System.out.println("Personel parametreli cons. calisti");
		
	}

	
	 /*
	   public Personel(int sayi){     ===>ILK OLUSTURDUGUMUZ CONS.
		
	    }
	 */
	
	
	
	/*
	 * Eski derslerden hatirlatma;
	 *  Her class default constructor'a sahiptir.
	 *  Default constructor'in parametresi yoktur
	 *  biz parametreli veya paremetresiz  bir constructor olusturdugumuzda default cons. silinir
	 *  Eger biz sadece bir tane parametreli cons. olusturursak, Java default olani sildigi icin 
	 *  	parametresiz cons. kalmaz
	 *  Dolayisiyla parametreli bir cons. olusturdugumuzda mutlaka default cons. yerine de  
	 *  	parametresiz bir cons. olusturmamiz gerekir.
	 */
}
