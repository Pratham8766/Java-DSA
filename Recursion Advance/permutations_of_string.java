public class permutations_of_string {
    //permutation of a string problem
    public static void printPermutations(String s, String permutationString){
        if(s.length()==0){
            System.out.println(permutationString);
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            char currChar = s.charAt(i);
            String newStr = s.substring(0,i)+s.substring(i+1);
            printPermutations(newStr, permutationString+currChar);
        }
    }
    public static void main(String[] args) {
        printPermutations("abc","");
    }
}
