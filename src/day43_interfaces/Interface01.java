package day43_interfaces;
public interface Interface01 {
    public void motor(); // interface icinde abstract method'lar ve 
                         // OZEL concrete method'lar olabilir
    /*
     Bir abstract method'un body'si olmadigindan o method'un istenen dinamik ozelligi 
     nasil gerceklestirecegini bilmemiz mumkun degildir
     Sadece ne yapacagini biliriz
     
     Bu method bize sunu anlatir:
     Beni inherit eden her concrete class'in dinamik motor ozelligi olmalidir
     
     */
    void vites(); // Beni inherit eden her concrete class'in dinamik vites ozelligi olmalidir
    abstract void kasa(); // Beni inherit eden her concrete class'in dinamik kasa ozelligi olmalidir
    
    // Interface'de sadece ABSTRACT, PUBLIC method'lar olur
    // bu iki keyword'u yazsak da yazmasak da Java tum method'lari bu sekilde kabul eder,
    
    // Java'da interface olusturmak istiyorsak bastan o sekilde olusturmaliyiz
    // Bir class sonradan bazi keyword'ler yazilarak interface yapilamaz
    
    String ISIM ="Mustafa"; // Java isim kelimesini italik ve bold yapti
                            // Demmek ki tum variable'lar final ve static'tir
    
}



 /*
     - Interface'lerin simgesinin sag ust kosesine "I" harfi cikar ayirt edilebilmesi icin.
     - Interface bir class degildir . Interface INTERFACE'dir.
     - Interface icinde sadece kendisinden tureyen siniflarin icini doldurmak zorunda oldugu,
     body'si olmayan method'larin olusturuldugu bir yapidir.
     - Kisacasi kendisini inherit eden class'lar icin yerine getirmeleri gereken methodlari belirten
     "tum alanlari doldurulmak zorunda olan bir sablon" gibidir.
     - Interface'ler somutlastirilamaz(can not be instantiated) yani Interface'de obje OLUSTURULAMAZ.
     - Interface bir cesit to do list'tir. Concrete class'lari interface'deki tum methodlari implement etmek zorunda birakir.
     Nasil yapilacagina degil ne yapilacagina odaklanir.
     - Bir class birden fazla class'a extend edilemez ama birden fazla interface'e implement edilebilir.
      NOT : Abstract class'lar interface'deki abstract methodlari implement etmek zorunda degildir.
     - Optional bazi method'lar koymak istersek, en uste concrete bir parent koyariz.
     - Bir class 4 farkli class'a inherit edemez AMA bir class istedigimiz kadar INTERFACE'e implements ile baglanabilir.
     - Birden fazla class'i parents olarak kabul edemeyiz fazla birden fazla Interface'i parent olarak kabul edebiliriz.
     
     ABSTRACT vs INTERFACE
     1) Abstract :
      1.1 - Class’dir.
      1.2 - Abstract ve concrete method’lar konabilir.
      1.3 - Kismi olarak abstraction saglar.
      1.4 - Birden fazla abstract class’a direk child olunamaz. Coklu inheritance’i desteklemez.
      1.5 - Hiz acisindan avantajlidir
      1.6 - Icindeki tüm nesnelerin “public” olmasi zorunlu degildir.
      1.7 - Soyut olmayan metodlar static olarak tanimlanabilir.
      1.8 - Abstract class constructor’a sahiptir 
     
     2) Interface : 
     2.1 - Class degildir.
     2.2 - Sadece abstract method’lar konabilir.
     2.3 - Tam abstraction (soyutluk) saglar
     2.4 - Bir class’dan istediginiz kadar interface’i inherit edebilirsiniz. Coklu inheritance’a uygundur.
     2.5 - Hiz acisindan abstract class’a gore yavastir.
     2.6 - Icindeki tüm nesnelerin “public” olması gerekir.
     2.7 - Method'lar static olamaz
     2.8 - Abstract class constructor’a sahiptir
     
     
       Interface'lar icin Inheritance Kurallari :
       
       1) Interface'lerde inheritance yapmak icin implements keyword'u kullanilir.
       Class extends Class || Class implements Interfase || Interface extends Interface
       
       2) Bir class birden fazla Interface'e implements ile baglanabilir
       public class Arabam impelents ElektrikMotor, OtomatikVites, Seda { } 
       Arabam -> Class
       ElektrikMotor, OtomatikVites, Seda -> Interface
       
       3) Birden fazla Interface'i implements ile inherit ettigimizde ayni isimde variable veya method'larla karsilasabiliriz.
       Bu durumda Java ne yapacagini bilmek isteyeceginden istedigimiz variable ismini interface ismi ile birlikte yazariz.
       Method'lar mecburen override yapilacagi icin hangi interface'den alindiginin hicbir onemi yoktur.
       
       4) Ayni isme fakat farkli return type'a sahip method'lari olan Interface'leri ayni class'dan inherit edemeyiz. 
       Signature ayni , return type farkli ise (ikiside interface olmak sarti ile) inherit edemeyiz.
       
     */

