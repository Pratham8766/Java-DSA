public class string_reverse {
    //String reversal
    public static void stringReverse(int i, String s){
        if(i==0){
            System.out.println(s.charAt(i));
            return;
        }
        System.out.println(s.charAt(i));
        stringReverse(i-1, s);
    }
    public static void main(String[] args) {
        stringReverse(3, "abcd");
    }    
}
