public class keypad_combination {
    public static String [] keypad = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void printCombination(String s, int idx, String newString){

        if(idx==s.length()){
            System.out.println(newString);
            return;
        }
        char currChar = s.charAt(idx);
        String mapping = keypad[currChar-'0']; //Giving the index of the alphabet in the keypad array
        
        for (int i = 0; i < mapping.length(); i++) {
            printCombination(s, idx+1, newString+mapping.charAt(i));
        }
    }
    public static void main(String[] args) {
       printCombination("23", 0, "");
    }
}
