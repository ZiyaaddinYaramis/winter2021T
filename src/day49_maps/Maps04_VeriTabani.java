package day49_maps;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Maps04_VeriTabani {
	
    public static void main(String[] args) {
        
        String dosyaYolu= "C:\\Users\\ziyaa\\OneDrive\\Masaüstü\\VeriTabani.csv";
        
        Map<String,String> veriMap = veriTabaniAl(dosyaYolu); 
        
        System.out.println(veriMap);
        
        
        System.out.println("Java Bitti Ama Core Olani");
    }
    public static Map<String, String> veriTabaniAl(String dosyaYolu)  {
        
        Map<String,String> eklenecekMap =new HashMap<>(); // sonucu döndurmek icin olusturduk
        
            try {
            	
            	BufferedReader br=new BufferedReader(new FileReader(dosyaYolu)); // BufferedReader java'da dosya okumak 
                																 // icin olusturulan class'lardan biridir

         // BufferedReader dosyayi okumamiza yardim ediyor. BufferedReader clasindan bir obje olusturduk 
         // ve dosyamizi okuyacak bir  bir parametre "new FileReader(dosyaYolu)" girdik yani yeni  bir dosya okuyucu olusturduk.

                
                String satir=br.readLine(); // readLine() bir satiri okumak icin method'dur. 
                                            // biz bu satiri satir diye bir degiskene ekledik
                
                
                while(satir != null) { // satir bos degilse yani null degilse..
                	// while'in sarti true oldugu surece  while body calisacak
                    
                    
                	
                	
                	
                	String keyValueArr[]=satir.split(";"); // satir.split(";"); alinan ilk satiri "," lerden parcalayarak
                	// keyValueArr[] array degiskenine(variable) ekliyor
                	
                	
                	
                    eklenecekMap.put(keyValueArr[0], keyValueArr[1]);  // keyValueArr[0], keyValueArr[1] keyvalue array'indeki 
                    // 0 ve 1'inci index'indeki elemani eklenecekmap isimli map'e ekliyoruz.
                    
                    satir=br.readLine(); // bir sonraki line'i okur
                    
                    //br.close();
                }               
            } catch ( IOException e) {
                
                e.printStackTrace(); // detayli hata raporu verir
            }
        
        return eklenecekMap;
    }
    
    
}
