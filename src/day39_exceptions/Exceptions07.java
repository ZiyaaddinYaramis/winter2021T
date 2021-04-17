package day39_exceptions;

public class Exceptions07 {
	
    public static void main(String[] args) {
    	
        // Data turlerini casting yaparken uygun olmayan islem yaparsaniz
        // Java ClassCastException verir
        
        // Eger tamamen sayilardan olusmayan bir String'i int'a cevirmeye 
        // calisirsaniz Java NumberFormatException verir
        
        int sayi=10;
        
        //String str=sayi; // CTE 
        
        String str="123456";
        
        System.out.println(str+10); // 12345610 ==> string ile concat yapar.
        
        
        
        
        int strSayi=Integer.parseInt(str);
        
        // Integer bir Wrapper classtir  ve  methodlara ulasabiliriz
        // parseInt() ==> Integer  Wrapper class'inin method'u olarak string i sayiya ceviren method'dur 
        // Amaaaa rakam olan string karekterleri sayiya cevirir ve 
        // Integer Wrapper class data type in method'unu kullanir
        // Wrapper class'larin mantigini unutmamalisin!!
 
        System.out.println(strSayi+10); // 123466 ==> artik bir int oldugu icin topladi
        System.out.println(str+20); // 12345620
        
        String str2="123a45";
        //System.out.println(Integer.parseInt(str2)); // NumberFormatException
        
        Object sayi2=40;
        String sayiStr=(String)sayi2;   //Bu isleme  Explicit narrowing casting denir
                                        // ClassCastException ==> cunku  int'i string'e ceviriyorsun
        
    }
}