package apexCodingAcademy;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Day01_ArrayList {
    public static void main(String[] args) {
        // add
        // size
        // get
        // indexOf
        // remove
        // contains

        ArrayList<Integer> numbers = new ArrayList();
        numbers.add(100);
        numbers.add(200);
        numbers.add(300);

        //System.out.println(numbers.size());

        //System.out.println(numbers.get(0));

        numbers.remove(1); // 1. indexdeki elemani siler

        System.out.println(numbers);
        System.out.println(numbers.indexOf(300));
        System.out.println();


        /*
        // Bir ArrayList nasil olusturulur?
		// ArrayList bir objedir, dolayisiyla yeni bir tane olusturmak icin  new keyword kullanmaliyiz



		// 1.yol
		ArrayList<String> list = new ArrayList<String>();

		// 2.yol
		ArrayList<String> list2 = new ArrayList<>();

		// 3.yol En cok bu kullanilir
		List<String> list3 = new ArrayList<>();

		// Not : eger constructor olarak List<>() kullanilirsa CTE verir
		// List<>() constructor olarak kullanilamaz

		// List<String> list4 = new List<>();

		// Olusturdugumuz Class isimleri Java'da kullanilan obje isimleri ile AYNi OLMAMALIDIR

		// List'e eleman ekleme
		// List olusturulurken otomatik olarak eleman ekleme ozelligi yoktur
		// elemanlarin tek tek eklenmesi gerekir

		list3.add("Ali");
		list3.add("Veli");
		list3.add("Ayse");

		// List nasil yazdirilir?

		System.out.println(list3); // [Ali, Veli, Ayse]

		list3.add(1, "Can"); // 1.index'e istenen degeri ekler

		System.out.println(list3); // [Ali, Can, Veli, Ayse]

		list3.add(1, "Fatma");

		System.out.println(list3); // [Ali, Fatma, Can, Veli, Ayse]
         */



    }
}
