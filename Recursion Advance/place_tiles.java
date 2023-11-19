
public class place_tiles{
    //Place tiles of size 1xm in a floor of size nxm
    public static int count(int n, int m){
        if(n<m){
            return 1;
        }
        if(n==m){
            return 2;
        }
        int horizontalPlacement = count(n-1,m);
        int verticalPlacement = count(n-m,m);

        return horizontalPlacement+verticalPlacement;
    }
    public static void main(String[] args) {
        int n=4, m=2;
        System.out.println(count(n, m));
    }
}