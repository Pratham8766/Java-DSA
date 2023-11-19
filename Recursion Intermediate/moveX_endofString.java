public class moveX_endofString {
    //Move a certain character to the end of the string
    public static void moveX(String s, int idx, int count, String n){
        if(s.length()==idx){
            for (int i = 0; i < count; i++) {
                n+='x';
            }
            System.out.println(n);
            return;
        }
        char currChar = s.charAt(idx);
        if(currChar=='x'){
            count++;
            moveX(s, idx+1, count, n);
        }
        else{
            n+=currChar;
            moveX(s, idx+1, count, n);
        }
    }
    public static void main(String[] args) {
        String s = "abcxxdusax";
        String p = "";
        moveX(s, 0, 0, p);
    }
}
