package day42_abstractclasses;

public abstract class Personel {
	
	/*
	   
	   Bir class'i abstract yapmak icin class keyword'unden once
	   abstract yazmak yeterlidir
	
	
	   abstract bir class'in icinde variable olabilir mi?
	   olabilir
	*/
	
	public String isim = "Ziya";
	
	// variable'lar abstract olur mu?
	// olmaz..
	
	
	
	// public abstract int sayi=10; 
	// Illegal modifier for the field sayi; only public, protected, private, static, 
	// final, transient & volatile are permitted
	
	
	// abstract class'in tum contrete child'lari abstract class'daki
	// tum dinamik ozellikleri yani methodlari
	// override etmek zorundadir. ==> not= birinin yapmadigini digeri yapabilir! önemli olan hepsinin yapilmasidir
	
	
	
	
	// bir method abstract olur mu ve nasil yapilir?
	public abstract void maasHesapla(); // ==> dikkat body yok
	public abstract void mesaiBilgisi();
	
	
	
	// Bir abstract class'da concrete method yazilabilir mi ?
    // Bir abstract class'da abstract ve concrete method'lar olabilir
	
    //  Concrete child class'lar abstract method'lari override ETMEK ZORUNDADIR ama
    //  Concrete methodlari override etmek istege baglidir.
	
	
    public void ozelSigorta() {
        System.out.println("Bu personel ozel sigorta kapsamindadir");
    }
	
}
