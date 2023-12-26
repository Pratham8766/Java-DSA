public class permutations{
    public static void printPermutations(String s, int idx, String newStr){
        if(s.length()==0){
            System.out.println(newStr);
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            char currChar = s.charAt(i);
            String sub = s.substring(0, i)+s.substring(i+1);
            printPermutations(sub, idx+1, currChar+newStr);
        }
    }
    public static void main(String [] args){
        String s = "ABC";
        printPermutations(s, 0,"");
    }
}