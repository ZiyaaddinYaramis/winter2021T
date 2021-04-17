package day43_interfaces;

public class InterfaceRunner implements Interface02 {

	public static void main(String[] args) {


		/*
		 * static olarak tanimlanmis bir variable veya method
		 * baska class'dan classIsmi.methodIsmi seklinde cegrilabilir
		 * 
		 */

		
		Interface02.deneme2();
		
		// Default keyword'u ile olusturdugumuz method ise 
		// obje uzerinden cagrilabilir
		
		
		
		InterfaceRunner obj =new InterfaceRunner(); // inheritance olmazsa  baska class a ulasamayiz
													// önce yaptigimizde class inheritance degildi ve
													// implements keyword ile parent child iliskisini kurduk
													// sonra  obje uzerinden  variable ulastik.
		obj.deneme();
		
		
	}

}
