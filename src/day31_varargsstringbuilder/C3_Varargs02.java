package day31_varargsstringbuilder;

public class C3_Varargs02 {

	public static void main(String[] args) {
		

		toplama(2,5); //  yapilisina videodan bakmalisin cok pratik bir yolu var
		toplama(5,10,15);
		toplama(4,5,9,7);
		toplama(5,6,8,10,45,78,-12);

	}

	public static void toplama(int... var) { // data turunden sonra yazdigimiz ... varargs kullanacagiz anlamina gelir.
											 // var varargs adidir istedigini yazabilirsin
		
		int toplam=0; // local variable'a deger atamak zorundayiz cunku java lokal variable'a default deger atamaz
		              // biz  method argumanlarini toplayacagimiz icin ilk degerin toplama icin  etkisiz elemanini atamaliyiz
		
		
		for (int each : var) {  // var'a git her bir int'i bana getir
			                    // each bir loop local variable'dir ve variable adi'dir
			                    // each ismini degistirilebilir
			
			toplam+=each; // toplam = toplam + each
		}
		
		System.out.println("toplam : "+ toplam);
	}

}
