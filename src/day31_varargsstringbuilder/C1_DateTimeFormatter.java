package day31_varargsstringbuilder;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class C1_DateTimeFormatter {

	public static void main(String[] args) {
		


		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt); // 2021-03-20T16:10:41.542104700
		
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yy/MMMM/dd hh:mm");
		
		/*
        yy : yilin son iki rakamini
        yyyy: yilin tamamini 
        M: ay sirasini verir mart icin : 3
        MM: ay sirasini verir mart icin : 03
        MMM : Ay isminin ilk uc harfini verir
        MMMM : Ay isminin tamamini veir
        */

	
		
		System.out.println(dtf.format(ldt)); // 21/maaliskuuta/20 04:17
		
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yy/MMMM/dd");
		System.out.println(dtf2.format(ldt)); // 21/maaliskuuta/20
		
		DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("HH:mm"); // 24 saat'lik sisteme gore
		DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("hh:mm"); // 12 saat'lik sisteme gore
		System.out.println(dtf3.format(ldt)); // 16:26 24 saat'lik sisteme gore
		System.out.println(dtf4.format(ldt)); // 04:26 12 saat'lik sisteme pm/am gore

		
		LocalDate dogumtarihi = LocalDate.of(1988, 7, 2);
		LocalDate bugun = LocalDate.now();
		
		System.out.println(dogumtarihi);
		
		Period benimYasim = Period.between(dogumtarihi ,bugun);
		System.out.println(benimYasim); // P-35Y-11M-12D
		
		int yas=Period.between(dogumtarihi, bugun).getYears();
        System.out.println(yas); // 32
        
	}

}
