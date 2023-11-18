public class ways_to_call_guest {
    public static int callGuest(int n){
        if(n<=1){
            return 1;
        }
        //call in single
        int singleWay = callGuest(n-1);
        //if 1 guest is called single recursive call will be given to see how remaining guest gets called

        //call in pair
        int pairWay = (n-1)*callGuest(n-2); 
        //A single partner will have n-1 as a partner choices 
        
        return singleWay+pairWay;
    }
    public static void main(String[] args) {
        System.out.println(callGuest(4));
    }
}
