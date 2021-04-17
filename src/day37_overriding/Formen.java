package day37_overriding;

public class Formen extends Isci {
	
	
	public String sorumluOldBolum = "bakim";
	public String isim="Emrullah";
	

	public static void main(String[] args) {
		
		
		// Interitance'da data turu olarak class ismi kullanimi

		
		// Bir class'da obje uretirken data turu olarak class'in kendisini 
        // veya parent(lar)ini kullanabiliriz.
        // Olusturdugumuz obje ile variable kullanmamiz gerekirse, hangi degeri 
        // alacagini anlamak icin once Data turu olan class'a gideriz
        // orada aradigimiz variable varsa kullaniriz, yoksa 
        // parent(lar)ina bakariz, YUKARI DOGRU GIDERKEN ILK BULDUGUMUZ DEGERI KULLANIRIZ
		
		
		
		
		Formen fr1=new Formen();
		
		// fr1 objesini kullanarak hangi class'larin variable'larini gorebilirim?
		
		fr1.sorumluOldBolum="Marangozhane";
		fr1.maas=10000;
		System.out.println(fr1.isim + " " + fr1.sorumluOldBolum + " " + fr1.maas); // Emre Marangozhane 10000
		
		
		
		Isci fr2 = new Formen();
		// Data turu olarak Isci secildigi icin
		
		fr2.bolum="Kaynak atölyesi"; // fr2.isim="Yakup";
		
		
		System.out.println(fr2.isim + " " + fr2.bolum + " " + fr2.maas); // Mesut Kaynak atolyesi 5000
		
        
        Personel fr3=new Formen();
        System.out.println(fr3.isim); // Emre

		
		
	}

}
