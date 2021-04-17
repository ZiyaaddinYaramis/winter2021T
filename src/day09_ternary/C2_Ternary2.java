package day09_ternary;

public class C2_Ternary2 {

	public static void main(String[] args) {
		
		
		int y = 1;
        int z = 1; 
        
        
        int a = y<10 ? y++ : z++; // a=1
        						  // y=2
        
        
        System.out.println(y + "," + z + "," + a);  // y=2 z=1 a=1   2,1,1
        
        System.out.println(y++); // y=2
        						 // y=3
        System.out.println(++y); // y=4
        
        System.out.println(y); // y=4


	}

}
