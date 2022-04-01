package apexCodingAcademy;

public class Day01_array {
    public static void main(String[] args) {

        //int number =1;
        int number2 =2;
        int number3 =3;
        int number4 =5;
        int number5 =7;
        int number6 =8;
        int number7 =9;

        // listeler
        // array
        // ArrayList


        // Scanner scan = new Scanner(System.in);
        int[] numbers = new int[7]; // [0,0,0,0,0,0]
        numbers[0] = 1;
        System.out.println(numbers[0]);
        //System.out.println(numbers[7]); // runtime error ==> ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 7


        /*
        Programlama hata çesitleri nelerdir?
        Uygulama gelistirme asamasinda hatalar 3 grupta degerlendirilir:
        Syntax Error – Sözdizimi Hatalari
        Run-time Error – Çalisma Zamani Hatalari
        Logic Error (Bug) – Mantiksal Hatalar (Böcek)
         */

        // break point nedir bakilacak (debug)

        numbers[0]= 10;
        numbers[1]= 200;
        numbers[2]= 300;
        numbers[3]= 50;
        numbers[4]= 7;
        numbers[5]= 8;

        System.out.println(numbers); // referansi verir

        System.out.println(numbers.toString()); // referansi string'e cevirir

        // traditional for loop - geleneksel for loop
        for (int i =0; i<numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println("----------------------------------");

        /*
        Döngunun ne kadar dönecegini bilmiyorsak while kullanilir, biliyorsak for kullanilir
         */

        // enhanced for loop (foreach)
        for (int number:numbers
             ) {
            System.out.println(number);
        }

        // for loop'taki asil amac, bana tum elemanlari getirsin
        // ve bende  o elemanlarla baska seyler yapayim
        // for loop yazmamizin amaci array'in TUM ELEMANLARI uzerinde islem yapmak ise
        // foreach loop daha kolay kod yazmamizi saglar


        // each ==> her bir demek
        // for each loop istedigim bir topluluktaki tum elemanlari birer birer bana getirir
        // for each loop'da baslangic degeri YOKTUR, bitis degeri YOKTUR, index YOKTUR



        String[] cities = new String[5];
        //cities[0]="Istanbul";
        //cities[1]="Ankara";

        String[] cities1 = {"Istanbul","Ankara","Bursa","Konya","Izmir"};

        for (String city:cities1
             ) {
            System.out.println(city);
        }






    }
}
