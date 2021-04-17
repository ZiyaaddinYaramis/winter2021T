package day34_inheritance;

/*
 * Getter ===> Oku, Atama Yapma!
 * Setter ===> Okuma!, Atama yap. 
 */


public class Encapsulation {
	
	
	private String okulIsmi= "Yildiz Koleji";
	private int okulHesapNo=1234;
	private boolean okulAcikMi = true;
	
	/**/
	
	public String getOkulIsmi() {
		return okulIsmi;
	}
	
	public int getOkulHesapNo() {
		return okulHesapNo;
	}
	
	
	public boolean isOkulAcikMi() {
		return okulAcikMi;
	}
	
	//*****set methodları (set olanlar bırsey dondurmeyecegı ıcın voıd yapacagız 
	//**********ve yeni degerı hemen(parametre-yenı deger atanmalı) kullanmalıyız)
    
    public void setOkulIsmi(String okulIsmi) {
        this.okulIsmi=okulIsmi;
        
    // ****** Disardaki class'dan gelen okulIsmi'ni bu class'daki okulIsmi'ne atama yapiyoruz.
    // ******Obje uzerionden old. icin bu class'daki orjinal degeri degistirmiyor.
        
    }
    
    
    public void setOkulHesapNo(int okulHesapNo) {
    	
        this.okulHesapNo=okulHesapNo;
    }
    
    
    
    public void setOkulAcikMi(boolean okulAcikMi) {
    	
        this.okulAcikMi=okulAcikMi;
    }
   /**/ 
    
    
    
    
    
}
