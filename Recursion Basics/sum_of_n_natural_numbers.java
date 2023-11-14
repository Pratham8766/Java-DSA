public class sum_of_n_natural_numbers {
    public static int func1(int n){
        if(n==0){
            return 0;
        }
        return n+func1(n-1);
    }
    public static void func2(int startingNo, int endingNo, int sum){
        if(startingNo==endingNo){
            sum+=startingNo;
            System.out.println("Sum of natural numbers is: "+sum);
            return;
        }
        sum+=startingNo;
        func2(startingNo+1, endingNo, sum);
    }
    public static void main(String[] args) {
        // System.out.println(func1(5));
        func2(1, 5, 0);
    }
}
