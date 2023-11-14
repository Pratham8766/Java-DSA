public class height_of_stack {
    public static int returnHeight(int x, int n){
        if(n==0 || x==0){
            return 1;
        }
        return x*returnHeight(x, n-1);
    }
    public static int returnHeightOptimal(int x, int n){
        if(n==0 || x==0){
            return 1;
        }
        if(n%2==0){
            return (returnHeightOptimal(x, n/2) * returnHeightOptimal(x, n/2));
        }
        return returnHeightOptimal(x, n/2)*returnHeightOptimal(x,n/2)*x;
    }
    public static void main(String[] args) {
        System.out.println(returnHeight(2, 5));
        System.out.println(returnHeightOptimal(2, 5));
    }
}
