import java.util.HashSet;

public class subsequence_of_unique_string {
    public static void printUniqueSubsequence(String str, int idx, String newString, HashSet<String> set) {
        if (idx == str.length()) {
            if (set.contains(newString)) {
                return;
            } else {
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char currentChar = str.charAt(idx);
        printUniqueSubsequence(str, idx + 1, newString + currentChar, set);

        printUniqueSubsequence(str, idx + 1, newString, set);
    }

    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();
        printUniqueSubsequence("aaa", 0, "", set);
    }
}
