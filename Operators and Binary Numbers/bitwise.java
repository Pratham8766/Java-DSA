public class bitwise {
    public static void main(String[] args) {
        int a = 5; //0101
        int b = 6; //0110
                   //   0100

        System.out.println("Bitwise AND a&b = "+(a&b)); 
        System.out.println("Bitwise OR a|b = "+(a|b)); 

        /*
        XOR
        Similar Value = false;
        Different Value = true; 

        0 0 = 0
        1 1 = 0
        0 1 = 1
        1 0 = 1
        int a = 5; //0101
        int b = 6; //0110
        */

        System.out.println("Bitwise XOR a^b = "+(a^b));
        

        //Left Shift
        int c = a<<4;
        System.out.println(c);

        //Right Shift
        int d = b>>1;
        System.out.println(d);
        
        
    }    
}

