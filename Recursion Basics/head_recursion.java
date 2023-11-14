public class head_recursion {
    public static void display(int n){
        if(n==0){
            return;
        }
        display(n-1);
        System.out.println(n);       
    }
    public static void main(String[] args) {
        display(5);
    }
}
