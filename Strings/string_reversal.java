public class string_reversal {
    public static void main(String[] args) {
        StringBuilder reverse = new StringBuilder("Hello");
        for(int i = 0; i<reverse.length()/2; i++){ //Here we have used reverse.length()/2 because if we parse through entire string it will make the string as it is Hello
            int frontPointer = i;
            int backPointer = reverse.length()-i-1; //Here reverse.length()-i-1 means (5-1) for getting index and minus i for getting that last index

            char frontChar = reverse.charAt(frontPointer);
            char backChar = reverse.charAt(backPointer);

            reverse.setCharAt(frontPointer, backChar);
            reverse.setCharAt(backPointer, frontChar);
        }
        System.out.println(reverse);


    }
}
