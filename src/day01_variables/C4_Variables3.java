package day01_variables;

public class C4_Variables3 {

	public static void main(String[] args) {
		
		String isim1="Java";
		String isim2="Guzel";
		
		// Java Guzel
		System.out.println(isim1+" "+ isim2);
		
		int sayi1=5;
		int sayi2=7;
		
		System.out.println(sayi1+sayi2+isim1); // 5+7 java  ==> 12Java
		System.out.println(isim1+sayi1+sayi2); // Java+5 ==> Java5 (bir string ve sayiyi görunce birlestirir 
		                                       // ve sonuc yine bir string olur) Java5 artik bir string
		                                       // Java5+7 ==>  Java57 (bir string ve sayiyi görunce birlestirir
		                                       //ve sonuc yine bir string olur)

	}

}
