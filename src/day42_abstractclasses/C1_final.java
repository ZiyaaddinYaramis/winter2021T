package day42_abstractclasses;

public class C1_final {
    
    final static int SAYI=10; 
    
    //instance bir variable'i final ve static yaparsaniz JAVA ONU BOLD YAPAR
    // biz de ismi BUYUK HARFLE yazariz
    
    String isim; // null
    
    // Instance variable'lara ilk deger atamasi yapmak zorunda degiliz
    // Deger atamadigimizda Java data turune gore default bir deger atar
    
    
    
    
    // final String soyisim;
    		// final variable'larin degeri sonradan degistirilemeyecegi icin 
    		// ilk atama yapilmadan olusturulmasina java izin vermez
    
    
    
    public static void main(String[] args) {
        
        System.out.println(SAYI); // ==> static variable'la  static main method'dan ulasabiliriz ama
        							// final variable oldugu icin yeni atama yapilamaz
        
        // SAYI=11; ==> final oldugu icin  degistirilemez!
        
        System.out.println(Integer.MAX_VALUE); //==> MAX_VALUE final method'u oldugunu gösterir
        
    }
    
    
    
    public void deneme() {
        System.out.println("deneme yapiyoruz");
    }
    
    public final void deneme2() {
        System.out.println("deneme yapiyoruz 2");
    }
    
    
    
    
    
    
    
    
    
}
