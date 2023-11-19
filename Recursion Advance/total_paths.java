public class total_paths {
    //Total no of paths to go to certain point problem 
    public static int totalNoOfPaths(int i, int j, int n, int m){
        if(i==n || j==m){
            return 0;
        }
        if(i==n-1 && j==m-1){
            return 1;
        }
        int firstPath = totalNoOfPaths(i+1, j, n, m);
        int secondPath = totalNoOfPaths(i, j+1, n, m);
        return firstPath+secondPath;
    }
    public static void main(String[] args) {
        int n = 3, m = 3;
        System.out.println(totalNoOfPaths(0, 0, n, m));
    }
}
