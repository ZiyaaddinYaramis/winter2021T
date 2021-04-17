package day44_iterator;

// bu soruyu for ile de cözup pratik yapabilirsin


import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iterator02 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");

		System.out.println(list); // [A, B, C, D]

		// her elemana B harfini ekleyelim (yaniii her elemani degistir yaniii update et)

		ListIterator li1 = list.listIterator();

		while (li1.hasNext()) {

			// li1.next();

			String temp = (String) li1.next(); // bu kisimda özel bir durum oldu ve hoca collextion'da anlatacagim dedi
			li1.set(temp + "B");// add@supperswarr... yaptik

		}

		System.out.println(list);

	}

}
