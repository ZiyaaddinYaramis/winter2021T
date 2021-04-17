package day42_abstractclasses;

public class C2_final2 extends C1_final{
	
    public static void main(String[] args) {
        
        System.out.println(C1_final.SAYI); // parent classtaki final variable ulasmak icin class adi ve nokta koymalisiniz
        
        
       // System.out.println(SAYI); //  ZATEN STATIC VARIABLE NEDEN C1_final.SAYI YAPTIN BE ADAM?:)
        
         
        //static bir variable okul ismi gibi herkes icin aynidir
        //C1_final.SAYI+=20;
        // Sayi variable'i final olarak tanimlandigi icin DEGISTIRILEMEZ
        
        
        C2_final2 obj1 = new C2_final2();
        
        obj1.deneme(); // Static main method icinden static olmayan bir methoda 
                        // ulasmak icin obje olusturmak gerekmektedir.
        
        
        
        
        
        //deneme(); // calismadi cunku method static degil
    }

	@Override  //==> parent class'taki method  gecersiz kilindi
	public void deneme() {
		System.out.println("child class'daki overriding method");
	}
   
   /*
    public void deneme2() {
        //Cannot override the final method from C1_final
         * 
         * Yaniiii final method override edilemez!!
    }
    */
   
    
    // final class yaptigimizda inherit edilemez // ===> sanki final class degilde  final method demek lazim???
    
}


