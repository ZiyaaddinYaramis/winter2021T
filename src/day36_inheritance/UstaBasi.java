package day36_inheritance;

import java.util.ArrayList;
import java.util.List;

public class UstaBasi extends Isci {
	
	public String bolum="takimhane";
	public int sorOldIscisay=20;

	public static void main(String[] args) {


		UstaBasi ub1= new UstaBasi();
		// objeyi torun class'inda olusturunca 3 class'a da ulasabiliyoruz
		
		System.out.println(ub1.bolum); //takimhane
		System.out.println(ub1.sorOldIscisay); //20
		System.out.println(ub1.saatUcreti);//10
		System.out.println(ub1.isim);//Mehmet
		
		
		
		//List<String>list = new ArrayList<>();
		
		
		//String str = new String("Hasan");
		//Object str = new String("Hasan");
		
		
		Isci ub2=new UstaBasi();
		// Extend ile birbirine bagli olan class'larda IS-A relation olan
		// data turleri istege bagli olarak kullanilabilir.
		// Daha genis Data turu yazmanin avantaji: kapsamin daha genis olmasi
		// Daha genis Data turu yazmanin dezavantaji: data turu olarak sectigimiz  class ve parent(larina)
		// ait datalara ulasabiliriz
		
		System.out.println(ub2.departman); 
		System.out.println(ub2.izindeMi);
		
		
		
		Personel ub3=new UstaBasi();
		System.out.println(ub3.id);

	}

}
