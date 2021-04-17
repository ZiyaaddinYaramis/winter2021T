package day42_abstractclasses;

public abstract class YanHizmetler extends Personel{
    
    // abstract bir class'in abstract child'ini olusturursak 
    // abstract methodlari implement yapamayiz
    // Java bilir ki bu child son class degil, mutlaka bun child'in 
    // concrete child clas'i olacak
    
    public static void main(String[] args) {
        
        // YanHizmetler obj1 = new YanHizmetler();
        // abstract bir class'dan obje URETILEMEZ!!
        // Cannot instantiate the type YanHizmetler
    }
}
