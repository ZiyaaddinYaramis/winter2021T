package day22_constructor;

public class CarUretRunner {
	
    public static void main(String[] args) {
        
        CarUret car1 =new CarUret(); // CarUret() constructor dir.
        
        car1.marka="Toyota";
        car1.model="Corolla";
        car1.yil=2010;
        car1.kazasiVarMi=true;
        
        System.out.println(car1.marka + " " + car1.model + " " + car1.yil + " " + car1.kazasiVarMi);
        
        car1.yakit("Benzin"); // CarUret class'indaki public void yakit(String yakit) { } method'una 
                              // bu class'dan atama yaptik
        car1.vites("duz"); // CarUret class'indaki public void vites(String vites) { } method'una 
                           // bu class'dan atama yaptik
        
    }
}



