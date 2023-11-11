public class stringbuilder_implementation {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Pratham");
        // System.out.println(sb);

        // System.out.println(sb.charAt(0));

        //setCharAt method
        // sb.setCharAt(0,'R');
        // System.out.println(sb);

        //insert method
        sb.insert(3, 'c');
        // System.out.println(sb);
        
        
        //delete method
        sb.delete(3,4);
        System.out.println(sb);
        
        //append method
        sb.append("Gajbhiye");
        System.out.println(sb+"hi");

        //length method
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        

    }
}
