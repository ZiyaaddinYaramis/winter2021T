package day40_exceptions;

/*Bu class'ta mutlaka videoyu izlemelisin*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
Throws 													Throw
Throws ise bir veya daha fazla exc.'i 					Throw keyword'u 1 exc. firlatmak icin. 
declera etmek icindir. "," ile ayrilarak yazilabilir.   Throw declare etmiyor
Throws keyword ise method signature'inda kullanilir.	Throw method'un icinde kullanilir.
Throws'dan sonra sadece exc. turu yazilmasi yeterlidir	Throw'dan sonra new diyip exc. turunu yazmamis lazim.
*/


public class Exceptions02 {

	@SuppressWarnings({ "unused", "resource" }) // fis objesindeki hatalari yok etmek icin annoation yaptik
	
	// public static void main(String[] args) throws FileNotFoundException { 
	
	// throws FileNotFoundException ==>bu class calisirken FileNotFoundException 
    // hatasi alabilirsin demektir (cumleyi duzeltebilirim)

	public static void main(String[] args) throws FileNotFoundException, IOException  {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\ziyaa\\eclipse-workspace"
				+ "\\winter2021turkish\\src\\day39_exceptions\\file");		
		
		/*
		 * Java önce  new keyword dan sonra ya bulamazsam diyerek hata verdi 
		 * ve bizde add throws declaration yaptik. Cok Önemli! resme bak!
		 */
		

		/* 
		 try-catch blogu exception ile handle etmekde kullanilir
         throws keyword'u ise sadece declaration'dir, dolayisla
         throws kullanilan bir method'da exception olusursa KOD BLOKE OLUR
		*/
		
        int k=0;
        
        while((k=fis.read())!=-1) { 
            System.out.print((char)k);
        }
        
      
        
        /* Eger birden fazla exception icin throws keyword'u kullanacaksak
           yazacagimiz exceptionlarin arasindaki iliski ve siralama onemli olur
           eger yazdigimiz exception'lar arasinda parent-child iliskisi varsa 
           once child exception yazilmalidir, aksi takdirde child exc. erisilemez olur
        
        
           Eger yazacaklarimiz arasinda parent-child iliskisi varsa
           istersek sadece parent'i yazmamiz da yeterli olur.
		*/
		
		
	}

}
