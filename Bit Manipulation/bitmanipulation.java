
public class bitmanipulation {
    public static void main(String[] args) {
        /*
         * Bit consists of following operations
         * 1. Get Bit Operation: Get the value whether it is 0 or 1 at a particular
         * index i
         * 
         * 2. Set Bit Operation: Set the value at a particular index i where 0 is
         * changed to 1 and 1 is changed to 1
         * 
         * 3. Clear Bit Operation: Clear the value at a particular index i, so that it
         * becomes 0
         * 
         * 4. Update Bit Operation: 0 to 1 and 1 to 0 updation
         */

        // 1. Get Operation
        /*  
        Get the 3rd bit (position = 2) of a number n (n = 0101)

        Bit mask = 1<<i
        Operation = AND
        */

        // int n = 5;
        // int position = 1;
        // int bitMask = 1 << position;
        // int result = n & bitMask;

        // if (result == 0) {
        //     System.out.println("The bit is 0");
        // } else {
        //     System.out.println("The bit is 1");
        // }

        // if the resultant value is non zero then the bit is 1 and if zero then 0

        // 2. Set Operation
        // Set the 2nd bit (position = 1) of a number n (n = 0101)

        // Bit mask = 1<<i
        // Operation = OR

        // int n = 5;
        // int position = 1;
        // int bitmask = 1<<position;
        // int result = n | bitmask;
        
        // System.out.println(result);


        // 3. Clear Operation
        /*
        Set the 2nd bit (position = 1) of a number n (n = 0101)

        Bit mask = 1<<i
        Operation = AND WITH NOT

         Calculate NOT of Bitmask
         then calculate NOT with AND of original Number
         */

        // int number = 5;
        // int position = 2;
        // int bitmask = 1<<position; 
        

        // int not = ~bitmask;
        // int newNumber = number&not;
        // System.out.println(newNumber);


        // 4. Update Operation
        /*
         For 1
        Bit mask = 1<<position
        Operation = AND with NOT

        For 2
        Bit mask = 1<<position
        Operation = OR


        0101
        1011
        0001
         */

        // For changing 1 to 0
        // int number = 5;
        // int position = 2;
        // int bitmask = 1 << position;
        
        // int notBitMask = ~(bitmask);
        // int newNumber = notBitMask & number;
        // System.out.println(newNumber);

        // For changing 0 to 1
        // int number = 5;
        // int position = 1;
        // int bitmask = 1 << position;
        // int newNumber = bitmask | number;
        // System.out.println(newNumber);

        // int number = 5;
        // int position = 1;
        // int changingBit = 0;

        // if(changingBit==0){
        //     int bitMask = 1 << position;
        //     int newNumber = bitMask | number;
        //     System.out.println(newNumber); 
        // }
        // else{
        //     int newBitMask = 1 << position;
        //     int nNewBitMask = ~(newBitMask);
        //     int newNumber1 = nNewBitMask & number;
        //     System.out.println(newNumber1);
        // }
    }
}
