package day22_constructor;

public class OtomobilRunner {
	
    public static void main(String[] args) {
        
        
        Otomobil oto1 = new Otomobil(); // default constructor kullandik
        
        oto1.vites("otomatik"); // Otomobil clas'indaki  String vites isimli method u cagirip atama yaptik
        
        /*
         * Otomobil Class'indan bir obje urettigimiz icin o class'daki Method'lara veya variable'lara ulasabiliriz
         * eger baska bir Class'daki Method ve variable lara ulasmak istiyorsak 
         * ilgili  class'in  objesini olusturmaliyiz.
         * 
         * örn; CarUret oto2 = new Otomobil();
         * yaparsak  CarUret class'indan Method'lara veya variable'lara ulasabiliriz
         * 
         */
        
        Otomobil oto2 = new Otomobil ("Kirmizi"); // Otomobil clasindaki String  parametreli constructor'dan object urettik
        
    }
}

