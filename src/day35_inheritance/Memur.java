package day35_inheritance;

public class Memur extends Personel {

	
	public int maas;
	
	
	public Memur() {
		super(); // super parent class a git demek
		
		System.out.println("Child class parametresiz cons. calisti");
	}
	
	
	public Memur(int maas) {
		super("Ali", 12); // super parent class a git demek
		
		System.out.println("Child class parametreli cons. calisti");
	}
	
	
	
	/*
	 * Inheritance 'da cons. olusturdugumuzda  java'nin otomatik olarak cons.'a koydugu
	 * 	super() keyword önemlidir.
	 * super() keyword default cons. gibidir . biz görmesek de calisir' ancak yerine
	 * 	baska bir keyword yazarsak etkisiz hale gelir.
	 * 
	 		***** extends varsa yerine birsey yazmadikca super() (cons. call) calisir....****
	 * 
	 */
	
	
	
	
	public static void main(String[] args) {
		
	Memur obj1 = new Memur(2400);
		 

	}

}
