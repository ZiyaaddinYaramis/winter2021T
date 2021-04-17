package day34_inheritance;

public class Isci extends Muhasebe {

	public static void main(String[] args) {

		Isci isci1 = new Isci();
		isci1.isim = "Ömer";
		isci1.soyisim = "Aydin";
		isci1.id = 1001;
		isci1.izindeMi = false;
		isci1.saatUcreti = 10;
		isci1.statu = "Isci";

		isci1.maas = isci1.maasHesapla(); // ====> COK ÖNEMLI METHOD ILE ATAMA YAPTIK

		System.out.println(
				isci1.id + " " + isci1.isim + " " + isci1.soyisim + " " + isci1.statu + " " + isci1.maas + " tl");

		/*
		 * BU DERSE KADAR HANGI CLASS'DAN BILGI ELDE ETMEK ISTIYORSAK O CLASS'DAN OBJE
		 * OLUSTURDUK INHERITANCE ILE BU MECBURIYET ORTADAN KALKTI CHILD CLASS'DA
		 * OLUSTURDUGUM OBJE ILE TUM PARENT CLASS'LARDA BULUNAN VARIABLE VE METHOD'LARI
		 * INHERIT EDEBILIRIM.
		 */

		Isci isci2 = new Isci();
		isci2.isim = "Esat";
		isci2.soyisim = "Okumus";
		isci2.id = 1002;
		isci2.izindeMi = true;
		isci2.saatUcreti = 15;
		isci2.statu = "Isci";

		isci2.maas = isci2.maasHesapla(); // ====> COK ÖNEMLI METHOD ILE ATAMA YAPTIK

		System.out.println(
				isci2.id + " " + isci2.isim + " " + isci2.soyisim + " " + isci2.statu + " " + isci2.maas + " tl");

	}

	// Isci isci1=new Isci();
	/// isci1. BURADA NEDEN CALISMADI? CUNKUUUUUUUUU.... main methot class in  motorudur. 

}
