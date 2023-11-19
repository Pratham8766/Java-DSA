public class subsequences_of_string {
    //Subsequence of a given string
    public static void printSubsequence(String str, int idx, String newString){
        if(idx==str.length()){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        
        printSubsequence(str, idx+1, newString+currChar);

        printSubsequence(str, idx+1, newString);
    }
    public static void main(String[] args) {
        printSubsequence("abcd", 0, "");
    }
}
