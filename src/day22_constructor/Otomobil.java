package day22_constructor;

public class Otomobil {
    
    public Otomobil(String renk){ // parametreli constructor olusturduk. 
    							  // Istersek constructor'i parametreli olarak olusturabiliriz
        
    }
    
    // biz bir constructor olusturdugumuzda java default olani yok eder
    // dolayisiyla biz bir constructor olusturdugumuzda MUTLAKA 
    // default constructor'in YERINE DE bir constructor yazmaliyiz
    
    public Otomobil() { // default constructor'in yerine bunu yazmaliyiz
        
    }
    
    // ONEMLI NOT : Default constructor'dan baska bir constructor yazdigimizda
    // java default olani yok ettigi icin MUTLAKA biz default YERINE DE constructor yazmaliyiz
    
    String marka;
    String model;
    int yil;
    boolean kazasiVarMi;
    
    public void yakit(String yakit) { // method
        System.out.println("Araba yakit olarak " + yakit  + " kullanir");
    }
    
    public void vites(String vites) { // method
        System.out.println("Araba " + vites + " viteslidir");
    }
}

