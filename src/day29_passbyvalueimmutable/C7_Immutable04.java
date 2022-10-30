package day29_passbyvalueimmutable;

public class C7_Immutable04 {
	
    public static void main(String[] args) {
    	
        String a = "";  // String bir variable'in yanina ne gelirse gelsin onu String olarak görur
                        //  ve concatination yapar.
        
        // String'lerde her atama isleminde 3 sey degisir: 1- Deger, 2-Referance, 3-Container(Sepet)
        a+=2; // a=2
        
        a+='c'; // a=2c
        
        a+=false; // a=2cfalse

        
        if (a=="2cfalse") {
        	
            System.out.println("==");
        }
        
        if (a.equals("2cfalse")) {
        	
            System.out.println("equals");
        }
    }
}

