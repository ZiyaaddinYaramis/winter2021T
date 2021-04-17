package day07_ifelsestatements;

import java.util.Scanner;

public class C3_IfElse2 {

	public static void main(String[] args) {
		// kullanicidan bir karekter girmesini isteyin
		// harf olup olmadigi yazdirin
		
		Scanner scan=new Scanner(System.in);
		
	System.out.println("Lutfen bir karekter giriniz");
	
	char karekter = scan.next().charAt(0);
	
	if ((karekter>='a' && karekter<='z') || (karekter>='A' && karekter<='Z')) {
		System.out.println("girdiginiz karekter harf");
	} else {
		System.out.println("girdiginiz karekter harf degil");
	}
	scan.close();
	}

}
