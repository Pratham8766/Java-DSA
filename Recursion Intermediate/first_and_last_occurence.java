public class first_and_last_occurence {
    public static int first = -1;
    public static int last = -1;
    public static void fl(String s, int idx, char element){

        if(idx==s.length()){
            System.out.println("First Occurence: "+first);
            System.out.println("Last Occurence: "+last);
            return;
        }
        if(s.charAt(idx)==element){
            if(first==-1){
                first = idx;
            }
            else{
                last = idx;
            }
        }
        fl(s, idx+1, element);
    }
    
    public static void main(String[] args) {
        fl("abaacdaefaahe", 0, 'e');
    }
}
