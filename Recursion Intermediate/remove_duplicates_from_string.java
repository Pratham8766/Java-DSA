public class remove_duplicates_from_string {
    //Remove duplicates from the string 
    private static int toIndex(char c) {
        if (Character.isUpperCase(c)) {
            return c - 'A';
        } else {
            return c - 'a' + 26;
        }
    }

    public static boolean map [] = new boolean[52];
    public static void remove_duplicate(String s, int idx, String newString){
        if(s.length()==idx){
            System.out.println(newString);
            return;
        }
        
        if(map[toIndex(s.charAt(idx))] == true){
            remove_duplicate(s, idx+1, newString);
        }
        else{
            newString+=s.charAt(idx);
            map[toIndex(s.charAt(idx))] = true;
            remove_duplicate(s, idx+1, newString);
        }
    }
    public static void main(String[] args) {
        remove_duplicate("happynewyear",0,"");
    }
}
