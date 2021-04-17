package day40_exceptions;

public class InvalidEmailIdCheckedException extends Exception {

	/*RESIM VE VIDEO'YA BAKMALISIN!!!!! YOKSA ISIN ZOR:)*/
		
	private static final long serialVersionUID = 1L;
	// Java exception'larin tekrarsiz olmasini saglamak icin her exception'a unique bir kod verir. 
	// nasil verildigine bakmak icin  videoya göz at!

	InvalidEmailIdCheckedException(String message) { // 11.satirdan 13. satira constructor olusturduk
		super(message);	
	}
	
	
}
