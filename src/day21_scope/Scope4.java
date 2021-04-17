package day21_scope;

public class Scope4 {
	
	
    public static void main(String[] args) {
        
        int sayi=10;
        
        System.out.println(sayi); // uyari yok olsun diye ben olusturdum (7.satir)
        
        // 1- bir method icinde olusturulan variable, sadece o method icinde kullanilabilir
        // 1- System.out.println(isim);
        
        int sayi2; // 2- bir local variable deger atanmadan da olusturulabilir
        
        // 2- System.out.println(sayi2); //2-  ancak ilk deger atamasi yapilmayan variable'lar kullanilamaz
        // 2- sayi2++; // 2- ilk deger atanmadigi icin artirma yada azaltma da yapamayiz
        // 2- Java deger atamasi olmadan local variable oluturulmasina izin verir, ilerde deger atanacak diye bekler
        
        sayi2=15; // 2- olusturma ayri satirda(14.satir) , deger atamasi ayri satirda (20 satir) yapilabilir
        
        
        System.out.println(sayi2); // uyari yok olsun diye ben olusturdum (14.satir)
        
        // 3- birden fazla method'un oldugu class'larda her method'da kullanmamiz gereken
        // 3- ortak variable'lar varsa class level'da variable olusturmaliyim
        // 3- ortak variable class'in yapisina bagli olarak instance veya static olabilir
        
    }
    
    public static void staticMethod() {
        
    	
    
    	
        String isim="Hasan";
        //1-  System.out.println(sayi); bu kurala main method icerisinde olusturulan variable'lar da dahildir
        
        System.out.println(isim); // uyari yok olsun diye ben olusturdum (33.satir)
    }
    
    public void method() {
        
        boolean isTrue=true;
        //1-  System.out.println(sayi); Bu kural static olan veya olmayan tum methodlar icin gecerlidir
        
        System.out.println(isTrue); // uyari yok olsun diye ben olusturdum (41.satir)
        
        
       
    }
}



