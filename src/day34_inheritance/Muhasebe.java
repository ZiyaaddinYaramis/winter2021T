package day34_inheritance;

public class Muhasebe extends Personel {

	// Muhasebe class'i personel class'inin  child class'i oldugunu
	// declare  etmek icin  class ismine extends keyword ile 
	// parent class'i yazariz ===> Muhasebe YANINA  extends Personel EKLEDIK
	
	public int saatUcreti;
	public String statu;
	public int maas;

	public int maasHesapla() {
		maas = 30 * 8 * saatUcreti;

		return maas;
	}

}
