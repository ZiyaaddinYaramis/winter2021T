package day30_datetime;

import java.time.LocalDate;

public class C1_LocalDate01 {
	
	public static void main(String[] args) {
		
		
		// Java'da sadece tarih kullanmak istiyorsak
		// LocalDate Class'indan bir obje uretiriz
		
		LocalDate tarih = LocalDate.now();
		
		System.out.println(tarih); // 2021-03-19
		
		System.out.println(tarih.plusWeeks(20)); // 2021-08-06 20 <== hafta sonrasini verir
		System.out.println(tarih.plusDays(500)); // 2022-08-01 <== 500 gun sonrasini verir
		System.out.println(tarih.plusYears(3).plusMonths(5).plusDays(12)); // 2024-08-31 <== 3 yil 5 ay 12 sonrasini verir
		
		System.out.println(tarih.minusMonths(15)); 
		System.out.println(tarih.minusYears(3).minusMonths(4).minusDays(10));
		
		
		System.out.println(tarih.getDayOfYear());// 78
        System.out.println(tarih.getMonthValue()); // 3
        System.out.println(tarih.getDayOfWeek()); // Friday
        
        
        LocalDate dogumGunu= LocalDate.of(1985, 4, 8);
        System.out.println(dogumGunu.getDayOfWeek()); // MONDAY
        
        System.out.println(dogumGunu.getMonth()); // APRIL

        
		System.out.println(tarih.isLeapYear()); // false (leap yil mi yazdirir.)
		
		// Eger suan ki tarih ile degil de  eski bir tarih ile islem yapacaksak
		// LocalDate.of() methodunu kullaniyoruz
		LocalDate tarih1 = LocalDate.of(1995, 12, 15);  // bende farli gösteriyor
		LocalDate tarih2 = LocalDate.of(1995, 12, 10);
		
		System.out.println(tarih1.isAfter(tarih2)); // true (tarih1, tarih2'den sonra mi?)
		System.out.println(tarih1.isBefore(tarih2)); // false  (tarih1, tarih2'den once mi?)
		
		
		
		
	}
}
