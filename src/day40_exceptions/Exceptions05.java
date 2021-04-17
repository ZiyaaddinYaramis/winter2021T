package day40_exceptions;

public class Exceptions05 {
	
    public static void main(String[] args) {
        
        System.out.print(exceptions()); // acde
    }
    @SuppressWarnings("finally")
    public static String exceptions() {
        String result = "";
        String v = null;
        
        
        try {
        	
        	try{
        		result=result+"a"; //a
        		v.length(); // Exception verecek ==> NullPointerException
        		result=result+"b"; // 19. satirda hata verecegi icin bu kod calismaz ve catch blogu calisir
        	} catch(NullPointerException e) {
        		
        		result=result+"c"; // ac
        		
        	} finally {
        		result=result+"d"; // acd
        		
        		//throw new Exception(); // yeni bir exception olusturduk
        	}
        	
        } catch (Exception e) {
        	
        	result=result+"e"; //acde
        	
        	}
        return result;
    }
}

