public class tower_of_hanoi {
    //Tower of Hanoi problem
    public static void TOH(int n, String src, String help, String Dest){
        if(n==1){
            System.out.println("Transfer Disk "+n+ " from " + src + " to "+ Dest);
            return;
        }
        TOH(n-1, src, Dest, help);
        System.out.println("Transfer Disk "+n+ " from " + src + " to "+ Dest);
        TOH(n-1, help, src, Dest);
    }
    public static void main(String[] args) {
        int n = 3;
        TOH(n, "Source Tower", "Helper Tower", "Destination Tower");
    }
}
